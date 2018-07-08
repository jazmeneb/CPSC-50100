//Superclass of PaidAdvisor

public class Person 
{
	private String firstname; //store the first name
	private String lastname; //store the last name
	public Person()			// Default constructor
	{
		firstname = ""; 
		lastname = ""; 
	}	
	public Person(String first, String last)
	{ 
		setName(first, last); 
	}
	public String toString()
	{
		return (firstname +" " + lastname);
	}
	public void setName(String first, String last)
	{
		firstname = first;
		lastname = last; 
				
	}
	public String getFirstName()
	{
		return firstname;
	}
	public String getLastName()
	{
		return lastname; 
	}
}
	1
