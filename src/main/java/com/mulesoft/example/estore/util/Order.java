package com.mulesoft.example.estore.util;

import java.util.Collection;
import java.util.LinkedList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order {
	
	private String providerId;
	private String customerName;
	private String deliveryAddress;
	
	private Collection<OrderItem> items;

	public Order() {
		items = new LinkedList<OrderItem>();
	}
	
	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Collection<OrderItem> getItems() {
		return items;
	}

	public void setItems(Collection<OrderItem> items) {
		this.items = items;
	}
	
	public void addOrderItem(OrderItem item) {
		this.items.add(item);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Order|");
		sb.append("providerId=").append(this.providerId).append(";");
		sb.append("customerName=").append(this.customerName).append(";");
		sb.append("deliveryAddress=").append(this.deliveryAddress).append(";");
		sb.append("items={");
		for (OrderItem i: this.items) {
			sb.append(i.toString()).append(",");
		}
		sb.append("}]");
		
		return sb.toString();
	}
}
