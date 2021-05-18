package com.saurabh.restaurent.ws.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saurabh.restaurent.dto.RestaurentDto;
import com.saurabh.restaurent.model.RestaurentItem;
import com.saurabh.restaurent.ws.service.RestaurentService;

@RestController
@RequestMapping("/restaurent")
public class RestaurantsController {

	@Autowired
	private RestaurentService restaurentService;
	
	@Autowired
	private Environment env;
	
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
		System.out.println("--------------------------------------------------");
		System.out.println(" Port is : "+env.getProperty("server.port"));
		System.out.println(" Instance Id : "+env.getProperty("eureka.instance.instance-id"));
		System.out.println("--------------------------------------------------");
		return restaurentService.getRestaurent(restaurentid);
	}
	
	
	@PostMapping(path = "/addRestaurent")
	public RestaurentItem addRestaurent(@RequestBody RestaurentItem restaurentItem ) {
		System.out.println("added Restaurent : "+restaurentItem.toString());
		ModelMapper mapper = new ModelMapper();
		RestaurentDto restaurentDto = mapper.map(restaurentItem, RestaurentDto.class);
		RestaurentDto addedRestaurent = restaurentService.addRestaurent(restaurentDto);
		RestaurentItem items = mapper.map(addedRestaurent, RestaurentItem.class);
		return items;
	}
}
