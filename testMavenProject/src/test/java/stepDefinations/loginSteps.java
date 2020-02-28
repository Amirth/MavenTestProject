package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class loginSteps 
{
	WebDriver driver;
    String driverPath="D:\\Selenium-New-Setup\\Chromedriver\\chromedriver.exe";
    
	@Given("^Open Chrome And Launch Login Page Application$")
	public void open_Chrome_And_Launch_Login_Page_Application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^User Enter Valid Username and Password$")
	public void user_Enter_Valid_Username_and_Password() throws Throwable
	{
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}

	@When("^Clicks on Login Button$")
	public void clicks_on_Login_Button() throws Throwable
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	
	@Then("^User should Navigate to HomePage$")
	public void user_should_Navigate_to_HomePage() throws Throwable
	{
	    boolean status=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
	    if(status)
	    {
	    System.out.println("Home Page Displayed");
	    }
	}
	
}
