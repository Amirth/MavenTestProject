package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDef 

{
    WebDriver driver;
    String driverPath="D:\\Selenium-New-Setup\\Chromedriver\\chromedriver.exe";
    WebElement search;
	@Given("^User Entering Google Search google\\.com$")
	public void user_Entering_Google_Search_google_com() throws Throwable
	{
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	}

	@When("^User Typing Search Term \"(.*?)\"$")
	public void user_Typing_Search_Term(String searchIn) throws Throwable
	{
	   search=driver.findElement(By.xpath("//input[@name='q']"));
	   search.sendKeys(searchIn);
	}

	@When("^Enter return Key$")
	public void enter_return_Key() throws Throwable 
	{
	    search.sendKeys(Keys.RETURN);
	}

	@Then("^User checking the Search Result$")
	public void user_checking_the_Search_Result() throws Throwable
	{
	    boolean status=driver.findElement(By.partialLinkText("selen")).isDisplayed();
	    if(status)
	    {
	    	System.out.println("Search Displayed");
	    }
	}
}
