package com.mulesoft.example.estore.services.provider.vangoghpaintstore;

import java.util.List;

import javax.jws.WebService;

@WebService
public interface B2BStore {

	public List<Product> listProducts();
	
	public Product getProductInfo(String upc);
	
	public String placeOrder(DeliveryOrder order);
		
}
