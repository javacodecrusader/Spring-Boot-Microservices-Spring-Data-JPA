package com.saurabh.restaurent.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

public @Data class SoupItems implements Serializable {
	
	private static final long serialVersionUID = 6654419910257626041L;
	private List<String> soups;

	@Override
	public String toString() {
		return "SoupItems [soups=" + soups + "]";
	}
	

}
