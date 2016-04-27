package com;


import java.io.IOException;
import java.util.Scanner;

public class ShoppingCart {
	int no_item;
	String item_name;
	int ch;
	double total;
	double price;
	double discount;
	
	Scanner sc=new Scanner(System.in);
	
	public void shopping() throws IOException{
		
		
		System.out.println("=========WELCOME TO FOODY BAZAR=========");
		System.out.println("----------------------------------------");
		
		System.out.println(".........CATEGORIES...........");
		System.out.println("        1.Vegetables");
		System.out.println("        2.Fruits");
		System.out.println("        3.Dairy Products");
		System.out.println("        4.Chocolates");
		
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

	 void chocolates() {
		 
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
		    System.out.println("Added to cart");
		    System.out.println("Total price is:"+dairymilk_total+"rs");
		    break;
		    
		    case 2: System.out.println("You have selected perk");
		    price=10;
		    System.out.println("Enter number of chocolates");
		    int perk=sc.nextInt();
		    int perk_total=(int) (price*perk);
		    System.out.println("Added to cart");
		    System.out.println("Total price is:"+perk_total+"rs");
		    break;
		    
		    case 3: System.out.println("You have selected 5 star");
		    price=15;
		    System.out.println("Enter number of chocolates");
		    int star=sc.nextInt();
		    int star_total=(int) (price*star);
		    System.out.println("Added to cart");
		    System.out.println("Total price is:"+star_total+"rs");
		    break;
		    
		    case 4: System.out.println("You have selected Munch");
		    price=5;
		    System.out.println("Enter number of chocolates");
		    int munch=sc.nextInt();
		    int munch_total=(int) (price*munch);
		    System.out.println("Added to cart");
		    System.out.println("Total price is:"+munch_total+"rs");
		    break;
		    }
			
			}
	

     void dairy() {
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
    System.out.println("Added to cart");
    System.out.println("Total price is:"+milk_total+"rs");
    break;
    
    case 2: System.out.println("You have selected curd");
    price=15;
    System.out.println("Enter number of kgs");
    int curd=sc.nextInt();
    int curd_total=(int) (price*curd);
    System.out.println("Added to cart");
    System.out.println("Total price is:"+curd_total+"rs");
    break;
    
    case 3: System.out.println("You have selected paneer");
    price=100;
    System.out.println("Enter number of kgs");
    int paneer=sc.nextInt();
    int paneer_total=(int) (price*paneer);
    System.out.println("Added to cart");
    System.out.println("Total price is:"+paneer_total+"rs");
    break;
		
	}
	}

    void fruit() {
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
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+apple_total+"rs");
	    break;
	    
	    case 2: System.out.println("You have selected orange");
	    price=10;
	    System.out.println("Enter number of kgs");
	    int orange=sc.nextInt();
	    int orange_total=(int) (price*orange);
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+orange_total+"rs");
	    break;
	    
	    case 3: System.out.println("You have selected banana");
	    price=30;
	    System.out.println("Enter number of dozens");
	    int banana=sc.nextInt();
	    int banana_total=(int) (price*banana);
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+banana_total+"rs");
	    break;
	    
	    case 4: System.out.println("You have selected grapes");
	    price=60;
	    System.out.println("Enter number of kgs");
	    int grapes=sc.nextInt();
	    int grapes_total=(int) (price*grapes);
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+grapes_total+"rs");
	    break;
	    }
		
		}
		
		
	

	 void veg() throws IOException {
		
		System.out.println("\nVEGGIES        PRICE/KG         ");
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
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+brinjal_total+"rs");
	    break;
	    
	    case 2: System.out.println("You have selected cabbage");
	    price=15;
	    System.out.println("Enter number of kgs");
	    int cabbage=sc.nextInt();
	    int cabbage_total=(int) (price*cabbage);
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+cabbage_total+"rs");
	    break;
	    
	    case 3: System.out.println("You have selected tomato");
	    price=15;
	    System.out.println("Enter number of kgs");
	    int tomato=sc.nextInt();
	    int tomato_total=(int) (price*tomato);
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+tomato_total+"rs");
	    break;
	    
	    case 4: System.out.println("You have selected carrot");
	    price=45;
	    System.out.println("Enter number of kgs");
	    int carrot=sc.nextInt();
	    int carrot_total=(int) (price*carrot);
	    System.out.println("Added to cart");
	    System.out.println("Total price is:"+carrot_total+"rs");
	    break;
	    }
	 
		System.out.println("Do you want to continue shopping: y/n");
		String ans=sc.next();
		 if(ans.equals("y")){
			shopping();
		 }else{
			 System.out.println("====Move to the billing counter====");
			 
		 }
		
	 }
/*public static void main(String[] args) throws IOException {
			ShoppingCart sh=new ShoppingCart();
			sh.shopping();
			
			
		}*/
		
	}
	
	



