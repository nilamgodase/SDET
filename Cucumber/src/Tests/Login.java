package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	WebDriver driver = null;
	@Given("^A user is on store\\.demoqa\\.com$")
	public void a_user_is_on_store_demoqa_com() throws Throwable {
	 ChromeOptions options = new ChromeOptions();
	// options.addArguments("--disable-notifications");
	 options.addArguments("--no-sandbox");
	 driver=new ChromeDriver(options);
	 driver.get("http://store.demoqa.com");
	 }
	
	@When("^user clicked on MyAccount link$")
	public void user_clicked_on_MyAccount_link() throws Throwable 
	{
	  driver.findElement(By.className("woocommerce-store-notice__dismiss-link\n")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.linkText("My Account")).click(); 	
	}

	@Then("^user is taken to Login Page$")
	public void user_is_taken_to_Login_Page() throws Throwable 
	{
	}

	@When("^user enters a valid name and password$")
	public void user_enters_a_valid_name_and_password() throws Throwable {
		WebElement loginField=driver.findElement(By.id("username"));
		   loginField.sendKeys("LearnCucumber");
		   WebElement PasswordField=driver.findElement(By.id("password"));
		   PasswordField.sendKeys("TestPassword123@");
		  driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@Then("^user is able to login successfully$")
	public void user_is_able_to_login_successfully() throws Throwable {
	   
	}


}

