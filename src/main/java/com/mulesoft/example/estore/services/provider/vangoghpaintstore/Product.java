package com.mulesoft.example.estore.services.provider.vangoghpaintstore;

public class Product {

	private String upcCode;
	private String brand;
	private String color;
	private float price;
	
	public Product() {
		
	}
	
	public Product(String upcCode, String brand, String color, float price){
		this.upcCode = upcCode;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public String getUpcCode() {
		return upcCode;
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public float getPrice() {
		return price;
	}

	public void setUpcCode(String upcCode) {
		this.upcCode = upcCode;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
}
