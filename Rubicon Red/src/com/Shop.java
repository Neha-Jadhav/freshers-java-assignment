package com;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Shop{
	int ch;
	double price;
	int input=0;
	Integer item;
	
	Scanner sc=new Scanner(System.in);
	ArrayList <String>a1=new ArrayList<String>();
	ArrayList <Integer>a2=new ArrayList<Integer>();
	
	public void shopping() throws IOException{
		System.out.println("............CATEGORIES.............");
		System.out.println("            1.Vegetables");
		System.out.println("            2.Fruits");
		System.out.println("            3.Dairy Products");
		System.out.println("            4.Chocolates");
		
		System.out.println("Select the item category you want to buy");
		ch=sc.nextInt();
		
		switch(ch){
		
		case 1: System.out.println("........Vegetables........");
		      veg();
		      break;
		case 2: System.out.println("..........Fruits..........");
		      fruit();
		      break;
	    case 3: System.out.println("........Dairy Products........");
		      dairy();
		      break;
	    case 4: System.out.println("........Chocolates........");
		     chocolates();
	          break;
	    default: System.out.println("Invalid choice");
	          
		}
	}
		
	
	 void veg() throws IOException {
		
		System.out.println("\nVEGGIES        PRICE/KG ");
	    System.out.println("1.Brinjal            20rs");
	    System.out.println("2.Cabbage            15rs");
	    System.out.println("3.Tomato             15rs");
	    System.out.println("4.Carrot             45rs");
	    
	    System.out.println("\nSelect vegetables");
	    ch=sc.nextInt();
	    switch(ch){
	    
	    case 1: System.out.println("You have selected brinjal");
	   price=20;
	    System.out.println("Enter number of kgs");
	    int brinjal=sc.nextInt();
	    int brinjal_total=(int) (price*brinjal);
	    a1.add("brinjal");
	    a2.add(brinjal_total);
	    System.out.println("Added to cart");
	    System.out.println("price is:"+brinjal_total+"rs");
	    break;
	    
	    case 2: System.out.println("You have selected cabbage");
	   price=15;
	    System.out.println("Enter number of kgs");
	    int cabbage=sc.nextInt();
	    int cabbage_total=(int) (price*cabbage);
	    a1.add("cabbage");
	    a2.add(cabbage_total);
	    System.out.println("Added to cart");
	    System.out.println(" price is:"+cabbage_total+"rs");
	    break;
	    
	    case 3: System.out.println("You have selected tomato");
	    price=15;
	    System.out.println("Enter number of kgs");
	    int tomato=sc.nextInt();
	    int tomato_total=(int) (price*tomato);
	    a1.add("tomato");
	    a2.add(tomato_total);
	    System.out.println("Added to cart");
	    System.out.println(" price is:"+tomato_total+"rs");
	    break;
	    
	    case 4: System.out.println("You have selected carrot");
	    price=45;
	    System.out.println("Enter number of kgs");
	    int carrot=sc.nextInt();
	    int carrot_total=(int) (price*carrot);
	    a1.add("carrot");
	    a2.add(carrot_total);
	    System.out.println("Added to cart");
	    System.out.println(" price is:"+carrot_total+"rs");
	    break;
	    }
	    System.out.println("no.items:"+a1.size());
		System.out.println("items are:"+a1);
		//System.out.println("Total price:"+a2.size());
		cart();
	 }
	
	void fruit() throws IOException {
    	System.out.println("\nFRUITS        PRICE         ");
	    System.out.println("1.Apple          20rs");
	    System.out.println("2.Orange         10rs");
	    System.out.println("3.Banana         30rs");
	    System.out.println("4.Grapes         60rs");
	    
	    System.out.println("\nSelect fruits");
	    ch=sc.nextInt();
	    switch(ch){
	    
	    case 1: System.out.println("You have selected apple");
	   price=20;
	    System.out.println("Enter number of kgs");
	    int apple=sc.nextInt();
	    int apple_total=(int) (price*apple);
	    a1.add("Apple");
	    a2.add(apple_total);
	    System.out.println("Added to cart");
	    System.out.println(" price is:"+apple_total+"rs");
	    break;
	    
	    case 2: System.out.println("You have selected orange");
	   price=10;
	    System.out.println("Enter number of kgs");
	    int orange=sc.nextInt();
	    int orange_total=(int) (price*orange);
	    a1.add("Orange");
	    a2.add(orange_total);
	    System.out.println("Added to cart");
	    System.out.println("price is:"+orange_total+"rs");
	    break;
	    
	    case 3: System.out.println("You have selected banana");
	    price=30;
	    System.out.println("Enter number of dozens");
	    int banana=sc.nextInt();
	    int banana_total=(int) (price*banana);
	    a1.add("Banana");
	    a2.add(banana_total);
	    System.out.println("Added to cart");
	    System.out.println(" price is:"+banana_total+"rs");
	    break;
	    
	    case 4: System.out.println("You have selected grapes");
	    price=60;
	    System.out.println("Enter number of kgs");
	    int grapes=sc.nextInt();
	    int grapes_total=(int) (price*grapes);
	    a1.add("Grapes");
	    a2.add(grapes_total);
	    System.out.println("Added to cart");
	    System.out.println("price is:"+grapes_total+"rs");
	    break;
	    }
	    System.out.println(" no.items in cart are:"+a1.size());
		System.out.println("items are:"+a1);
		cart();
		
		}
	
	void dairy() throws IOException {
			System.out.println("\nProducts        PRICE         ");
		    System.out.println("1.Milk           30rs");
		    System.out.println("2.Curd           15rs");
		    System.out.println("3.Paneer         100rs");
		    
		    System.out.println("\nSelect dairy products");
		    ch=sc.nextInt();
		     switch(ch){
		    case 1: System.out.println("You have selected Milk");
	  price=30;
	    System.out.println("Enter number of lts");
	    int milk=sc.nextInt();
	    int milk_total=(int) (price*milk);
	    a1.add("milk");
	    a2.add(milk_total);
	    System.out.println("Added to cart");
	    System.out.println(" price is:"+milk_total+"rs");
	    break;
	    
	    case 2: System.out.println("You have selected curd");
	    price=15;
	    System.out.println("Enter number of kgs");
	    int curd=sc.nextInt();
	    int curd_total=(int) (price*curd);
	    a1.add("Curd");
	    a2.add(curd_total);
	    System.out.println("Added to cart");
	    System.out.println(" price is:"+curd_total+"rs");
	    break;
	    
	    case 3: System.out.println("You have selected paneer");
	    price=100;
	    System.out.println("Enter number of kgs");
	    int paneer=sc.nextInt();
	    int paneer_total=(int) (price*paneer);
	    a1.add("Paneer");
	    a2.add(paneer_total);
	    System.out.println("Added to cart");
	    System.out.println("price is:"+paneer_total+"rs");
	    break;
			
		}
		     System.out.println("total items:"+a1.size());
				System.out.println("items are:"+a1);
				cart();
		}
	
	void chocolates() throws IOException {
		 
		    System.out.println("\nChocolates        PRICE         ");
		    System.out.println("1.Dairy Milk       60rs");
		    System.out.println("2.Perk             10rs");
		    System.out.println("3.5 Star           15rs");
		    System.out.println("4.Munch            5rs");
		
		    System.out.println("\nSelect chocolates");
		    ch=sc.nextInt();
		    switch(ch){
		    
		    case 1: System.out.println("You have selected Dairy Milk");
		   price=60;
		    System.out.println("Enter number of chocolates");
		    int dairymilk=sc.nextInt();
		    int dairymilk_total=(int) (price*dairymilk);
		    a1.add("Dairy milk");
		    a2.add(dairymilk_total);
		    System.out.println("Added to cart");
		    System.out.println(" price is:"+dairymilk_total+"rs");
		    break;
		    
		    case 2: System.out.println("You have selected perk");
		    price=10;
		    System.out.println("Enter number of chocolates");
		    int perk=sc.nextInt();
		    int perk_total=(int) (price*perk);
		    a1.add("perk");
		    a2.add(perk_total);
		    System.out.println("Added to cart");
		    System.out.println(" price is:"+perk_total+"rs");
		    break;
		    
		    case 3: System.out.println("You have selected 5 star");
		    price=15;
		    System.out.println("Enter number of chocolates");
		    int star=sc.nextInt();
		    int star_total=(int) (price*star);
		    a1.add("5star");
		    a2.add(star_total);
		    System.out.println("Added to cart");
		    System.out.println(" price is:"+star_total+"rs");
		    break;
		    
		    case 4: System.out.println("You have selected Munch");
		    price=5;
		    System.out.println("Enter number of chocolates");
		    int munch=sc.nextInt();
		    int munch_total=(int) (price*munch);
		    a1.add("Munch");
		    a2.add(munch_total);
		    System.out.println("Added to cart");
		    System.out.println(" price is:"+munch_total+"rs");
		    break;
		    }
		    System.out.println("total items:"+a1.size());
			System.out.println("items are:"+a1);
			cart();
	}
	
	public void cart() throws IOException{
		
		System.out.println("Do you want to continue shopping: yes or no");
		String ans=sc.next();
		if(ans.equals("yes")){
		shopping();
		}else{
			remove();
		}
			
		}
		
   public void remove(){
	   System.out.println("------------------------------------------");
		System.out.println("Do you want to remove any item: yes or no");
		String ans1=sc.next();
	if(ans1.equals("yes")){
		System.out.println("Enter the item you want to remove");
		 String input=sc.next();
		 if (a1.contains(input))
			{
				a1.remove(input);
				System.out.println(input+ " has been removed.");
			}else{
				System.out.println(input + " was not found in your shopping cart.");
			}
		}else{
			System.out.println("-----------------------------------");
			System.out.println();
			 System.out.println(" Total items are:"+a1.size());
				System.out.println("Items are:"+a1);
			System.out.println("Go to the bill counter");
				billing();
		}
   }
		
		
	public void billing(){
		System.out.println("Bill counter");
		Object a[]=a2.toArray();
		int sum=0;
		for(int i=0;i<a.length;i++)
		{ 
			sum+=((Integer) a[i]).intValue();
		}
		System.out.println("Total  price  is: "+sum);
		System.out.println(".............Thank You............");
		Date d =new Date();
		System.out.println(d);

	}
}
		    
	

		
	

	
	



