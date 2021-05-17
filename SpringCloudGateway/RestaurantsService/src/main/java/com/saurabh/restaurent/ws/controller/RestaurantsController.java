package com.saurabh.restaurent.ws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.restaurent.model.RestaurentItem;
import com.saurabh.restaurent.ws.service.RestaurentService;

@RestController
@RequestMapping("/restaurent")
public class RestaurantsController {

	@Autowired
	private RestaurentService restaurentService;
	
	@GetMapping(path = "/menu")
	public RestaurentItem getMenu() {
		System.out.println("RestaurentItem");
		RestaurentItem items = new RestaurentItem();
		
		return items;
	}
	
	@GetMapping(path = "/restaurents")
	public RestaurentItem getRestaurents() {
		System.out.println("RestaurentItem");
		RestaurentItem items = new RestaurentItem();
		restaurentService.getRestaurents();
		return items;
	}
	
	@GetMapping(path = "/{restaurentid}")
	public RestaurentItem getRestaurent(@PathVariable Integer restaurentid) {
		
		return restaurentService.getRestaurent(restaurentid);
	}
	
	
	@PostMapping(path = "/addToMenu")
	public RestaurentItem addToMenu(@RequestBody RestaurentItem restaurentItem ) {
		System.out.println("added item"+restaurentItem.toString());
		RestaurentItem items = new RestaurentItem();
		items = restaurentService.addToMenu(restaurentItem);
		return items;
	}
}
