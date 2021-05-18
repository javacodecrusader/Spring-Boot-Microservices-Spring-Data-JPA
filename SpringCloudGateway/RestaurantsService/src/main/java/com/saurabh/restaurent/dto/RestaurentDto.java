package com.saurabh.restaurent.dto;

import java.io.Serializable;

public class RestaurentDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2610646851546111636L;
	
	private String restaurentName;
	private int restaurenttinno;
	private String restaurentLocation;

	public String getRestaurentName() {
		return restaurentName;
	}
	public void setRestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}
	public int getRestaurenttinno() {
		return restaurenttinno;
	}
	public void setRestaurenttinno(int restaurenttinno) {
		this.restaurenttinno = restaurenttinno;
	}
	public String getRestaurentLocation() {
		return restaurentLocation;
	}
	public void setRestaurentLocation(String restaurentLocation) {
		this.restaurentLocation = restaurentLocation;
	}
	@Override
	public String toString() {
		return "RestaurentDto [restaurentName=" + restaurentName + ", restaurenttinno=" + restaurenttinno
				+ ", restaurentLocation=" + restaurentLocation + "]";
	}

	
}
