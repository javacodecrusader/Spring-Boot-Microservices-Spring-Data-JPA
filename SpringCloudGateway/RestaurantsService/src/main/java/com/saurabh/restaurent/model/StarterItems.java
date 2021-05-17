package com.saurabh.restaurent.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

public @Data class StarterItems implements Serializable {

	private static final long serialVersionUID = 7886626964589806787L;
	
	private List<SoupItems> soupItems;
	private List<VegStarterItems> vegStarterItems;
	

}
