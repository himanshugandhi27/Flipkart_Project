package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class loginFlipkart 
{
	
	WebDriver driver=null;
	
	 @Given("user launch the {string}")
	 public void user_launch_the(String string) 
	 {
	   	 
// launch the browser
		        System.setProperty("webdriver.chrome.driver","C:/Users/cheetah gandhi/eclipse-workspace/Cucumberjava/src/test/resources/Driver/chromedriver.exe");
				driver= new ChromeDriver();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				System.out.println(string);
				driver.get(string);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  
	}

	@Then("user click on sign in button")
	public void user_click_on_sign_in_button()
	{
	    
	    
	}

	@Then("user Enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
	    
	}

	@Then("user click on signin button")
	public void user_click_on_signin_button() 
	{
	    
	
	}

	@Then("verify user is able to login succesfully")
	public void verify_user_is_able_to_login_succesfully() 
	{
	   
	
	}

	
}
