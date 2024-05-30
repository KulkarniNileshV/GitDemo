package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{

	 public WebDriver driver;
	 
	@Given("Open FireFox and start facebook application")
	public void Open_FireFox_and_start_facebook_application()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Medha_Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wwww.facebook.com");
		System.out.println("User on facebook login page");
	}
	
    @When("User enter valid username and password")
	public void User_enter_valid_username_and_password()
	{
    	driver.findElement(By.id("email")).sendKeys("nileshvkulkarni");
   		driver.findElement(By.id("pass")).sendKeys("xyz123");
    	System.out.println("User enter valid username and password");
	}

    @Then("User should able to login page")
    public void User_should_able_to_login_page()
    {
    	driver.findElement(By.id("u_0_b")).click();
    	System.out.println("User should able to login page");
    }
	
}

