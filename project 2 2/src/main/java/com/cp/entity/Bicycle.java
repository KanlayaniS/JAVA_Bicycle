package com.cp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Bicycle")
public class Bicycle {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "owner")
	private String owner;
	//เจ้าของ  or ใครเช่า หรือว่าง 
	//อยากเพิ่ม status มั้ย ?? เช่น ว่าง
	
	@Column(name = "price")
	private String price;
	
	public Bicycle(int id, String name, String owner, String price) {
		super();
		this.id = id;
		this.name = name;
		//this.owner = owner;
		this.owner = owner;
		this.price = price;
	}
	public Bicycle() {
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
		//this.owner = owner;
		this.owner = owner;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
