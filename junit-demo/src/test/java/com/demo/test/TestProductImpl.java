package com.demo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.impl.ProductImpl;

public class TestProductImpl {

	
	ProductImpl impl = new ProductImpl();
	@Test
	public void testCalculatePrice() {
		//fail("Not yet implemented");
		
		assertEquals(impl.calculatePrice("Commercial", "product1"), 50.0,0);
	}
	
	@Test
	public void testCalculatePriceConsumer() {
		//fail("Not yet implemented");
		
		assertEquals(impl.calculatePrice("consumer", "product2"), 26.0,0);
	}
	
	@Test
	public void testCalculatePriceConsumer1() {
		//fail("Not yet implemented");
		
		assertEquals(impl.calculatePrice("Consumer", "product3"), 25.0,0);
	}
	
	@Test
	public void testCalculatePriceConsumer2() {
		//fail("Not yet implemented");
		
		assertEquals(impl.calculatePrice("commercial", "product2"), 50.0,0);
	}
	
	@Test
	public void testCalculatePriceCommercial() {
		//fail("Not yet implemented");
		
		assertEquals(impl.calculatePrice("commercial", "product2"), 50.0,0);
	}


}
