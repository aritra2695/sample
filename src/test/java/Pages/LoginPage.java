package Pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BaseClass {
	

	
	By emailID = By.name("email");
	By password = By.name("password");
	
	

	public void enterEmailID(String email)
	{
		//driver.findElement(emailID).sendKeys(email);
		
		WebElement mailID = driver.findElement(emailID);
		mailID.sendKeys(email);
		
	}
	

	public void enterPassword(String passwords) {
		// TODO Auto-generated method stub
		WebElement enterPassword = driver.findElement(password);
		enterPassword.sendKeys(passwords);	
		System.out.println("COMPLETED");
	}



	public String CurrentURL() {
		
		return super.driver.getCurrentUrl();
	}


	
	
}
