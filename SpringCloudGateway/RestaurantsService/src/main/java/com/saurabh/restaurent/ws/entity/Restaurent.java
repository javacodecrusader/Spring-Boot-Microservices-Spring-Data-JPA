package com.saurabh.restaurent.ws.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Restaurent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer restaurentid;
	private String restaurentname;
	private int restaurenttinno;
	private String restaurentlocation;
	public String getRestaurentname() {
		return restaurentname;
	}
	public void setRestaurentname(String restaurentname) {
		this.restaurentname = restaurentname;
	}
	public int getRestaurenttinno() {
		return restaurenttinno;
	}
	public void setRestaurenttinno(int restaurenttinno) {
		this.restaurenttinno = restaurenttinno;
	}
	public String getRestaurentlocation() {
		return restaurentlocation;
	}
	public void setRestaurentlocation(String restaurentlocation) {
		this.restaurentlocation = restaurentlocation;
	}
	@Override
	public String toString() {
		return "Restaurent [id=" + restaurentid + ", restaurentname=" + restaurentname + ", restaurenttinno=" + restaurenttinno
				+ ", restaurentlocation=" + restaurentlocation + "]";
	}
	
	
}
