package steps; 

import org.openqa.selenium.By;

import base.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Steps extends  Base {
	
	@Given("^I am in partyrentalltd\\.com website\\.$")
	public void i_am_in_partyrentalltd_com_website() throws Throwable {
	 driver = getDriver();
	 driver.get(url);
	   
	}

	@Given("^then I click to log in/register button$")
	public void then_I_click_to_log_in_register_button() throws Throwable {
		driver.findElement(By.xpath("//*[@class='account']")).click();
	  
	   
	}

	@When("^as a register user I put valid email and password$")
	public void as_a_register_user_I_put_valid_email_and_password() throws Throwable {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("chowdhuryshagorit@gmail.com");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Beauty28red"); 
	}

	@When("^I click log in\\.$")
	public void i_click_log_in() throws Throwable {
	 driver.findElement(By.xpath("//*[@class='loginSubmit']")).click(); 
	    
	}

	@Then("^its takes me to the home page$")
	public void its_takes_me_to_the_home_page() throws Throwable {
		String title = driver.getTitle();
		Assert.assertEquals("Home - Party Rental Ltd.11", title);
	  
	   
	}

	@Then("^I loged in successfully\\.$")
	public void i_loged_in_successfully() throws Throwable {
	  
	   
	}


}
