package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableExamplesSteps
{
	WebDriver driver;
    String driverPath="D:\\Selenium-New-Setup\\Chromedriver\\chromedriver.exe";
	
	@Given("^proceed to orange Application$")
	public void proceed_to_orange_Application() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");  
	}

	@When("^User enters username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password); 
	}

	@When("^user clicks login button$")
	public void user_clicks_login_button() throws Throwable
	{
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^login page redirect to home page$")
	public void login_page_redirect_to_home_page() throws Throwable
	{
		boolean status=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
	    if(status)
	    {
	    System.out.println("Home Page Displayed");
	    }
	}
}
