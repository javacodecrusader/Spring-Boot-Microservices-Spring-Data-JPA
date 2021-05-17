package com.saurabh.restaurent.ws.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saurabh.restaurent.model.RestaurentItem;
import com.saurabh.restaurent.ws.dao.I_RestaurentDao;
import com.saurabh.restaurent.ws.entity.Restaurent;

@Service
public class RestaurentService {
	
	@Autowired
	private I_RestaurentDao restaurentDao;
	
	
	public RestaurentItem getRestaurents() {
		System.out.println("RestaurentItem");
		RestaurentItem items = new RestaurentItem();
		Iterable<Restaurent> restaurents = restaurentDao.findAll();
		restaurents.iterator();
		return items;
	}
	
	public RestaurentItem getRestaurent(int restaurentid) {
		System.out.println("RestaurentItem");
		RestaurentItem item = new RestaurentItem();
		 
		 Optional<Restaurent> restaurent = restaurentDao.findById(restaurentid);
		 if (restaurent.isPresent()) {
			 convertEntityToDomainObj(restaurent.get(), item);
		 }
		return item;
	}
	
	public RestaurentItem addToMenu(RestaurentItem restaurentItem ) {
		
		Restaurent restaurent = new Restaurent();
		convertDomainObjToEntity(restaurentItem, restaurent);
		System.out.println("Saving entity .............");
		restaurent = restaurentDao.save(restaurent);
		
		System.out.println("added item "+restaurent.toString());
		
		return convertEntityToDomainObj(restaurent, restaurentItem); 
	}

	private void convertDomainObjToEntity(RestaurentItem restaurentItem, Restaurent restaurent) {
		restaurent.setRestaurentlocation(restaurentItem.getRestaurentLocation());
		restaurent.setRestaurenttinno(restaurentItem.getRestaurenttinno());
		restaurent.setRestaurentname(restaurentItem.getRestaurentName()+" Food ");
	}

	private RestaurentItem convertEntityToDomainObj(Restaurent restaurent, RestaurentItem restaurentItem) {
		restaurentItem.setRestaurentLocation(restaurent.getRestaurentlocation());
		restaurentItem.setRestaurentName(restaurent.getRestaurentname());
		restaurentItem.setRestaurenttinno(restaurent.getRestaurenttinno());
		return restaurentItem;
	}

}
