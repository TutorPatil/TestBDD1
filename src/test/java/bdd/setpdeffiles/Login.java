package bdd.setpdeffiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./src/test/Utilities/chromedriver.exe");		
		driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		driver=null;
	}
	
	
	
	@Given("I launch the actitime application")
	public void i_launch_the_actitime_application() {
		driver.get("https://demo.actitime.com");
	  
	}

	@When("I enter {string} as username and {string} as password")
	public void i_enter_as_username_and_as_password(String string, String string2) {
			driver.findElement(By.id("username")).sendKeys("admin");
		    driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@And("Click on Login Button")
	public void click_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
	  
	}

	@Then("The user should login successfully and the logout link should be displayed.")
	public void the_user_should_login_successfully_and_the_logout_link_should_be_displayed() {
		boolean isDislayed = driver.findElement(By.id("logoutLink")).isDisplayed();
		Assert.assertTrue(isDislayed," User could not login  to Actitime...");
	  
	}



}
