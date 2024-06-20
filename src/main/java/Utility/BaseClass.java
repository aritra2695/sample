package Utility;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	
	
	public BaseClass() {
		driver = WebDriverManager.chromedriver().create();
	}
	
	public void openLoginPage()
	{
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
	}
	


}
