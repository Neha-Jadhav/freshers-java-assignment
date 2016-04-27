package com;

import java.io.IOException;


public class Use extends Thread {
	
	public void run(){
		Customer c=new Customer(11,"Abhimanyu",1,"Light customer");
		c.display();
		Shop sc=new Shop();
		try {
			sc.shopping();
		} catch (IOException e) {
			System.out.println("Shopping exception:"+e);
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Use u=new Use();
		
		Thread t1=new Thread(u);
		
		t1.start();
		
		
	   
		
	}
	

}
