package com.saurabh.restaurent.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

public @Data class VegItems implements Serializable {

	
	private static final long serialVersionUID = 6882758938872433160L;
	
	private List<String> vegetable;
	private List<String> dal;
	
	@Override
	public String toString() {
		return "VegItems [vegetable=" + vegetable + ", dal=" + dal + "]";
	}
	
	
	

}
