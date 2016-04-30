package com;

import java.io.IOException;


public class Use extends Thread {
	
	public void run(){
		Customer c=new Customer(1,"Abhimanyu","Light customer");
		c.display();
		
		Shop sc=new Shop();
		synchronized (this) {
			
		try {
			sc.shopping();
			sc.cart();
		} catch (IOException e) {
			System.out.println("Shopping exception:"+e);
			e.printStackTrace();
		}
	}
	}
	
	public static void main(String[] args) {
		Use u=new Use();
		Thread t1=new Thread(u);
		t1.start();
		
		
		
	   
		
	}
	

}
