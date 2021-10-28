package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	    driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
	    
	}

	@Then("user Enters {string} and {string}")
	public void user_enters_and(String string, String string2) 
	{
	    driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys(string);
	    driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys(string2);
	}

	@Then("user click on signin button")
	public void user_click_on_signin_button() 
	{
	    
       driver.findElement(By.xpath("//*[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();	
	}

	@Then("verify user is able to login succesfully")
	public void verify_user_is_able_to_login_succesfully() 
	{
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='exehdJ'])[1]")));
		
		  WebElement ele=driver.findElement(By.xpath("(//*[@class='exehdJ'])[1]"));
		
		
	 
	   String name=ele.getText();
	   System.out.println(name);
	   String actualString="himanshu";
	   Boolean value=name.equals(actualString);
	   System.out.println(value);
	
	}

	
}
