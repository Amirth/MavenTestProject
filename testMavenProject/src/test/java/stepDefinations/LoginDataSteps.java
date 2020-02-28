package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDataSteps
{
	WebDriver driver;
    String driverPath="D:\\Selenium-New-Setup\\Chromedriver\\chromedriver.exe";
	@Given("^Launch Login Page Application$")
	public void launch_Login_Page_Application() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); 
	}

	@When("^User Enter Valid credentails \"(.*?)\" and \"(.*?)\"$")
	public void user_Enter_Valid_credentails_and(String Username, String Password) throws Throwable 
	{
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
	    driver.findElement(By.id("txtPassword")).sendKeys(Password);
	}

	@When("^user click on Login Button$")
	public void user_click_on_Login_Button() throws Throwable
	{
		driver.findElement(By.id("btnLogin")).click(); 
	}

	@Then("^login page redirect to HomePage$")
	public void login_page_redirect_to_HomePage() throws Throwable
	{
		boolean status=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
	    if(status)
	    {
	    System.out.println("Home Page Displayed");
	    }  
	}

}
