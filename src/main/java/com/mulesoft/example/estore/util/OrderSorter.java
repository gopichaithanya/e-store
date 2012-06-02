package com.mulesoft.example.estore.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class OrderSorter {

	private Map<String, Order> orders;
	private String customerName;
	private String deliveryAddress;
	
	public OrderSorter(String customerName, String deliveryAddress) {
		this.orders = new HashMap<String, Order>();
		this.customerName = customerName;
		this.deliveryAddress = deliveryAddress;
	}
	
	public void sortOrderItem(String providerId, OrderItem item) {
		if (!orders.containsKey(providerId)) {
			Order order = new Order();
			order.setCustomerName(this.customerName);
			order.setDeliveryAddress(this.deliveryAddress);
			order.setProviderId(providerId);
			orders.put(providerId, order);
		}
		orders.get(providerId).addOrderItem(item);
	}
	
	public Collection<Order> getSortedOrders() {
		return orders.values();
	}
	
}
