package com.demo.impl;

public class ProductImpl {
	
	public double calculatePrice(String category,String name)
	{
		if(category.equals("Consumer"))
			return 25.0;
		else if(category.contentEquals("Commercial"))
			return 50.0;
		
		return -1.0;
	}

}
