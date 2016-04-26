package com;

public class Customer {
	private int c_id;
	private String c_name;
	private int cart;
	private String c_type;
	
	public Customer(int c_id, String c_name, int cart, String c_type) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.cart = cart;
		this.c_type = c_type;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public int getCart() {
		return cart;
	}

	public void setCart(int cart) {
		this.cart = cart;
	}

	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	

	public void display(){
		System.out.println("Customer id :"+c_id);
		System.out.println("Customer name :"+c_name);
		System.out.println("Cart Status :"+cart);
		System.out.println("Customer type :"+c_type);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
