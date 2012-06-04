package com.mulesoft.example.estore.services.provider.vangoghpaintstore;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DeliveryOrderItem {

	private String upc;
	
	private int qty;

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
}
