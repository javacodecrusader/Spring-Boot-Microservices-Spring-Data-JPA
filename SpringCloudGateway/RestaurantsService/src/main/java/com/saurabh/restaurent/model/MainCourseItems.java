package com.saurabh.restaurent.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

public @Data class MainCourseItems implements Serializable {

	private static final long serialVersionUID = 1552074472408169069L;
	List<VegItems> vegItems;
	List<BreadItems> breadItems;
	
	@Override
	public String toString() {
		return "MainCourseItems [vegItems=" + vegItems + ", breadItems=" + breadItems + "]";
	}
	
	
}
