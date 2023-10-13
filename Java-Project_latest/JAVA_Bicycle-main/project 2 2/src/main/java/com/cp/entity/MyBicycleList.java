package com.cp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="MyBicycles")
public class MyBicycleList {
	//attribute
	
	//เพิ่มและลบ และมีอยู่ที่เท่าไหร่
	
	@Id
	private int id;
	private String name;
	
	private String owner;
	
	private String price;

	public MyBicycleList(int id, String name, String owner, String price) {
		super();
		this.id = id;
		this.name = name;
		//this.author = author;
		this.owner = owner;
		this.price = price;
		// price ราคาจักรยาน 
	}

	public MyBicycleList() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
