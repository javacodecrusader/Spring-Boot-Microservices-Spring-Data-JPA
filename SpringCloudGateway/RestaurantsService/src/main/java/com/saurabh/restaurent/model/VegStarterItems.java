package com.saurabh.restaurent.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

public @Data class VegStarterItems implements Serializable {

	private static final long serialVersionUID = -6461492203943920453L;

	private List<String> vegStartes;

	@Override
	public String toString() {
		return "VegStarterItems [vegStartes=" + vegStartes + "]";
	}
	
}
