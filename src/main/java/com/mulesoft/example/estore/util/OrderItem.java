package com.mulesoft.example.estore.util;

public class OrderItem {

	private String productId;
	private int quantity;
	
	public OrderItem(String productId, int quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[OrderItem|productId=").append(this.productId).append(";quantity=").append(this.quantity).append("]");
		return sb.toString();
	}
	
}
