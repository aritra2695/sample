package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;

public class LoginPageStepDefination {
	
	LoginPage loginPage; 
	
	@BeforeSuite
	public void setUp()
	{
		loginPage = new LoginPage();
		loginPage.openLoginPage();


		System.out.println ("******Setup" + loginPage);

	}
	
	
	@Given("I am on login page")
	public void i_am_on_login_page() {
		System.out.println ("******i_am_on_login_page" + loginPage);

		String url = loginPage.CurrentURL();
		System.out.println ("******" + url);
		Assert.assertEquals(url.toString(), "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
	    
	}

	@Given("Enter username and password")
	public void enter_username_and_password() {
		loginPage.enterPassword("password123");
		loginPage.enterEmailID("abc@gmail.com");
		
	}

}
