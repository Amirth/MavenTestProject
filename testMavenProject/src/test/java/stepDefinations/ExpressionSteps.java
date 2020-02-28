package stepDefinations;

import cucumber.api.java.en.Given;

public class ExpressionSteps 

{

	@Given("^I have (\\d+) Laptop$")
	public void i_have_Laptop(int num) throws Throwable
	{
	    System.out.println("Laptop" + num);
	}

	@Given("^I have a (\\d+\\.\\d+) CGPA$")
	public void i_have_a_CGPA(float Num) throws Throwable 
	{
	  System.out.println("CGPA is" + Num);  
	}

	@Given("^\"(.*?)\" is elder to \"(.*?)\" and \"(.*?)\"$")
	public void is_elder_to_and(String name1, String name2, String name3) throws Throwable
	{
	  System.out.println(name1+ "is elder to" +name2+ "and" + name3);  
	}
}
