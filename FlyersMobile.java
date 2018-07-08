//CPSC Assignment 2 Flyers Mobile App
//Jazmine Butler

import java.util.Scanner;
import java.text.NumberFormat; 

public class FlyersMobile {
//Mobile App used to make orders
	
	public static void main(String[] args)
	{
		// 
		Scanner scan= new Scanner(System.in);  
		boolean delivery = false;
		boolean pickup = true;
		boolean answer = pickup || delivery;  
		int quantity1, quantity2, zipcode = 0;
		double burger = 4.50;
		double drink = 1.50;
		double total, sub1, sub2,subtotal,tax;
		
		final double TAXRATE = 0.05; //5% sales tax
		
		//Convert integer to show currency
		NumberFormat dollar = NumberFormat.getCurrencyInstance();
		
		//Ask for pickup or delivery
		System.out.println("Will the order be pickup or delivery");
		answer = scan.nextBoolean(); 
		
		System.out.println("You chose" + answer);
		
		if(answer == delivery)
			{System.out.println("Enter your zipcode:");
			zipcode = scan.nextInt();
			
			{if(zipcode > 60451 || zipcode < 60441)
				System.out.println("Delivery Not Available");
			}
			
			{if(zipcode == 60451 || zipcode == 60441)
				System.out.println("Delivery with Extra Cost");
			}
		
				System.out.println("Delivery Available"); 
			}
		System.out.println("How many burgers?");
		quantity1= scan.nextInt();
		sub1= quantity1* burger; 
		
		System.out.println("How many drinks?"); 
		quantity2 = scan.nextInt();
		sub2= quantity2 * drink; 
		
		subtotal = sub1 + sub2;
		tax = TAXRATE * subtotal;
		total = subtotal + tax; 
		//for delivery fees
		if(answer == delivery && (zipcode == 60441 || zipcode == 60451))
			total+= 7; 
		if(answer == delivery && (zipcode > 60441 || zipcode < 60451))
			total+= 5;
		System.out.println("Subtotal:" + dollar.format(subtotal)); 
		System.out.println("Tax:" + dollar.format(tax)); 
		System.out.println("Total: " + dollar.format(total)); 
		
		
	}

}
