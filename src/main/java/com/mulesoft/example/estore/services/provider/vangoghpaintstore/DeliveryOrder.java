package com.mulesoft.example.estore.services.provider.vangoghpaintstore;

import java.util.Collection;

public class DeliveryOrder {

	private String address;
	private String name;
	private Collection<DeliveryOrderItem> items;
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Collection<DeliveryOrderItem> getItems() {
		return items;
	}
	
	public void setItems(Collection<DeliveryOrderItem> items) {
		this.items = items;
	}
	
}
