package com;

import java.util.Date;

public class Customer {
	private int c_id;
	private String c_name;
	private String c_type;
	int no_carts=3;
	
	public Customer(int c_id, String c_name, String c_type) {
		
		this.c_id = c_id;
		this.c_name = c_name;
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
	public String getC_type() {
		return c_type;
	}

	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	

	public void display(){
		
		System.out.println("=========WELCOME TO FOODY BAZAR=========");
		System.out.println("----------------------------------------");
		Date d=new Date();
		System.out.println("Customer Entered at:"+ d);
		System.out.println("------------------------------------------------");
		System.out.println("Customer id :"+c_id);
		System.out.println("Customer name :"+c_name);
		System.out.println("Customer type :"+c_type);
		
		if(getC_id()>no_carts){
			System.out.println("Carts Unavailable. Please wait for sometime");
		}else{
			System.out.println("Cart is available.Happy Shopping..!!!");
		}
	}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


