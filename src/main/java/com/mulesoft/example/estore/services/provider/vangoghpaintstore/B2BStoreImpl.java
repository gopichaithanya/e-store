package com.mulesoft.example.estore.services.provider.vangoghpaintstore;

import java.util.LinkedList;
import java.util.List;

public class B2BStoreImpl implements B2BStore {

	List<Product> products;
	
	public B2BStoreImpl() {
		products = new LinkedList<Product>();
		
		products.add(new Product("DBS1823", "LuPont", "Terracota red", 83.25f));
		products.add(new Product("DBS1824", "LuPont", "Wild weed green", 83.90f));
		products.add(new Product("DBS1825", "LuPont", "Deep ocean blue", 81.20f));
		products.add(new Product("712825A", "Werming Shillians", "Plain white", 45.10f));
		products.add(new Product("237825B", "Werming Shillians", "Plain black", 50.90f));
		products.add(new Product("237825B", "Tlidden", "Arsenic blue", 120.00f));
		products.add(new Product("231225B", "Tlidden", "Feldgrau green", 110.00f));
		products.add(new Product("214782B", "Tlidden", "Falu red", 115.00f));
		products.add(new Product("937822B", "Tlidden", "Gamboge yellow", 119.00f));
		
	}
	
	@Override
	public List<Product> listProducts() {
		return products;
	}

	@Override
	public Product getProductInfo(String upc) {
		for (Product p: products) {
			if (p.getUpcCode().equals(upc)) {
				return p;
			}
		}
		return null;
	}

	@Override
	public String orderProduct(String upc, int qty) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
