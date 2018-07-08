//GradingApp.java			Author:Jazmine Butler
//
//Creates a grading app for an instructor to enter scores 
// and calculate the final grade using the Grade Class

 import java.util.ArrayList;  
 import java.util.Scanner; 

public class GradingApp 
{

	public static void main(String[] args) {
		int finalscore; 
		int totalexamscore = 0; 
		int total_assign_score = 0; 
		
		Scanner scan = new Scanner(System.in); 
		
		//Using ArrayList to create list for exam and assignment scores	
				ArrayList<Integer> examscore = new ArrayList<Integer> (); 
				
				examscore.add(scan.nextInt()); 
				examscore.add(scan.nextInt());
				examscore.add(scan.nextInt());
				examscore.add(scan.nextInt());
				
				ArrayList<Integer> assign_score = new ArrayList<Integer> ();
				
				assign_score.add(scan.nextInt());
				assign_score.add(scan.nextInt());
				assign_score.add(scan.nextInt());
				assign_score.add(scan.nextInt());
		
		for(int index = 0; index <= examscore.size(); index++)
			{
			totalexamscore += examscore.get(index); 
			}
		System.out.println("Your final exam score is:" + totalexamscore);
		
		for(int index = 0; index <= assign_score.size(); index++)
		{
		total_assign_score += assign_score.get(index); 
		}
			
		System.out.println("Your total score is:" + total_assign_score);	
			
		finalscore = totalexamscore + total_assign_score; 
		
		System.out.print("Your final score is" + finalscore);
		
		if(finalscore >= 450)
			{
			System.out.println("Your final grade is 'A'");
			}
		if(finalscore >= 400)
			{
			System.out.println("Your final grade is 'B'");
			}
		if(finalscore >= 350)
			{
			System.out.println("Your final grade is 'C'");
			}
		if(finalscore >= 300)
			{
			System.out.println("Your final grade is 'D'");
			}
		else
		{
			System.out.println("Your final grade is 'F'");
		}
		
		
		
	}

}

