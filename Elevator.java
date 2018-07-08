//Elevator. java          Author:Jazmine Butler


import java.util.Scanner; 
import java.util.ArrayList; 

public class Elevator {
	
	
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	String selection, currentfloor = "B"; 
	
	ArrayList<String> floorlevel = new ArrayList<String> (); 
	int floor = 0; 
	
	floorlevel.add("B"); 
	floorlevel.add("1");
	floorlevel.add("2");
	
	//Starts the elevator in the basement B
	System.out.println("The elevator is on" + " " + floorlevel.get(0)); 
	
	//Person pushes button
	System.out.println("Choose a floor (B,1, or 2)"); 
	selection = scan.nextLine(); 
	if(currentfloor.equalsIgnoreCase("B") && selection.equals("1")) 
		{
		System.out.println("The elevator is going up");
		floor = floor + 1;
				
		System.out.println("The elevator is open");	
		System.out.println("The elevator is closed");
		currentfloor = "1"; 
		
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	if(currentfloor.equals("1") && selection.equals("2"))
		{
		System.out.println("The elevator is going up");
		floor = floor + 1;
				
		System.out.println("The elevator is open");	
		System.out.println("The elevator is closed");
		currentfloor = "2";
		
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	if(currentfloor.equals("1") && selection.equalsIgnoreCase("B"))
		{
		System.out.println("The elevator is going down"); 
		floor = floor - 1;
				
		System.out.println("The elevator is open");	
		System.out.println("The elevator is closed");
		currentfloor.equalsIgnoreCase("B"); 
		
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	
	if(currentfloor.equals("2") && selection.equals("1")) 
		{
		System.out.println("The elevator is going down"); 
		floor = floor - 1;
				
		System.out.println("The elevtor is open");	
		System.out.println("The elevator is closed");
		currentfloor.equalsIgnoreCase("B");
	
		System.out.println("Choose a floor (B,1, or 2)"); 
		selection = scan.nextLine();
		}
	if(currentfloor.equals("2") && selection.equalsIgnoreCase("B")) 
		{
			System.out.println("The elevator is going down"); 
			floor = floor - 2;
					
			System.out.println("The elevator is open");	
			System.out.println("The elevator is closed");
			currentfloor.equalsIgnoreCase("B"); 	
		
			System.out.println("Choose a floor (B,1, or 2)"); 
			selection = scan.nextLine();
		}
		
	
	}
		
		

}


