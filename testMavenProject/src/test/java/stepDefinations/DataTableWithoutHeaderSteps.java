package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableWithoutHeaderSteps
{
	WebDriver driver;
    String driverPath="D:\\Selenium-New-Setup\\Chromedriver\\chromedriver.exe";
	@Given("^Launch Application with login page$")
	public void launch_Application_with_login_page() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); 
	}

	@When("^Enter below credentails$")
	public void enter_below_credentails(DataTable dataTable) throws Throwable
	{
		List<String>credentails=dataTable.asList(String.class);
		String Username=credentails.get(0);
		String Password=credentails.get(1);
		
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
	    driver.findElement(By.id("txtPassword")).sendKeys(Password);   
	    
	}

	@When("^click on Login Button$")
	public void click_on_Login_Button() throws Throwable
	{
		driver.findElement(By.id("btnLogin")).click(); 
	}

	@Then("^home page have to be appear$")
	public void home_page_have_to_be_appear() throws Throwable
    {
		boolean status=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
	    if(status)
	    {
	    System.out.println("Home Page Displayed");
	    }
	}
}
