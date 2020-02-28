package stepDefinations;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableHeader
{
	WebDriver driver;
    String driverPath="D:\\Selenium-New-Setup\\Chromedriver\\chromedriver.exe";
    @Given("^Go To Application with login page$")
    public void go_To_Application_with_login_page() throws Throwable
    {
    	System.setProperty("webdriver.chrome.driver",driverPath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login"); 
    }

    @When("^Enter below details$")
    public void enter_below_details(DataTable dataTable) throws Throwable 
    {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
       List<Map<String,String>> keyValuePair=dataTable.asMaps(String.class,String.class);
       String userName=keyValuePair.get(0).get("Username");
       String password=keyValuePair.get(0).get("Password");
       driver.findElement(By.id("txtUsername")).sendKeys(userName);
	   driver.findElement(By.id("txtPassword")).sendKeys(password);
    }

    @When("^click Login Button$")
    public void click_Login_Button() throws Throwable
    {
    	driver.findElement(By.id("btnLogin")).click();  
    }

    @Then("^current page redirect to home page$")
    public void current_page_redirect_to_home_page() throws Throwable
    {
    	boolean status=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
	    if(status)
	    {
	    System.out.println("Home Page Displayed");
	    } 
    }
}
