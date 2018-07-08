//PaidAdvisor.java   Author: Jazmine Butler


public class PaidAdvisor extends Person
{ 
	protected double overtimePayRate;
	protected double regularPayRate = 25; 
	protected double specialPayrate = 50; 
	protected int regularHours, overtimeHours, specialHours; 
	protected int totalHrs; 
	
	public PaidAdvisor(String first, String last, double rate, int regHours, int specialHrs, int overtimeHrs)
	{
		super(first, last); 
		rate = regularPayRate; 
		regHours = regularHours; 
		specialHrs = specialHours;
		overtimeHrs = overtimeHours; 
	}
	public void setRegHours(int regHours)
	{
		regHours = regularHours; 
	}
	public void setSpecialHours(int specialHrs)
	{
		specialHrs = specialHours; 
	}
	public int setTotalHours()
	{
		return totalHrs = specialHours + regularHours; 
	}
	public void setOvertimeHours(int overtimeHrs)
	{
		overtimeHrs = overtimeHours; 
		if(regularHours > 30)
		{
			overtimeHours = totalHrs - specialHours- regularHours; 
		}
	}
	public int calculatePay()
	{
		
	}
	public double getPayRate()
	{
		return regularPayRate; 
	}
	
	
	
	
	
	
}
