package com.saurabh.restaurent.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

public @Data class BreadItems implements Serializable {

	private static final long serialVersionUID = -6644490915775572346L;
	private List<String> breads;
	
	@Override
	public String toString() {
		return "BreadItems [breads=" + breads + "]";
	}
}
