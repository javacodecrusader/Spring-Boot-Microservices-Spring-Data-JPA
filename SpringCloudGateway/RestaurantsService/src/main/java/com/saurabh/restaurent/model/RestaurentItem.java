package com.saurabh.restaurent.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

//@Getter @Setter
public @Data class RestaurentItem implements Serializable {

	private static final long serialVersionUID = 8476304879491921346L;
	
	/*
	 * List<StarterItems> startereItems; List<MainCourseItems> mainCourseItems;
	 * 
	 * @Override public String toString() { return "RestaurentItem [startereItems="
	 * + startereItems + ", mainCourseItems=" + mainCourseItems + "]"; }
	 */

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
		return "RestaurentItem [restaurentName=" + restaurentName + ", restaurenttinno=" + restaurenttinno
				+ ", restaurentLocation=" + restaurentLocation + "]";
	}
}
