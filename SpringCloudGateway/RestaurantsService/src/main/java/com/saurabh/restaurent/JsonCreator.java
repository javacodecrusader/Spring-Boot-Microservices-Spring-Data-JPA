package com.saurabh.restaurent;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.saurabh.restaurent.model.MainCourseItems;
import com.saurabh.restaurent.model.RestaurentItem;

public class JsonCreator {

	public static void main(String[] args) {

		RestaurentItem items = new RestaurentItem();
		
		items = getRestaurentMenu(items);
		
		ObjectMapper obj = new ObjectMapper();
		try {
			String itemJson = obj.writeValueAsString(items);
			System.out.println(itemJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static RestaurentItem getRestaurentMenu(RestaurentItem items) {
			items.setRestaurentName("Achyutam");
			items.setRestaurenttinno(123);
			items.setRestaurentLocation("Mathura");
			return items;
	}

}
