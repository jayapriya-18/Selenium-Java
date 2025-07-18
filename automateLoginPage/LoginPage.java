package automateLoginPage;

//import necessary files to launch the browser

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {
	public static void main(String[] args) {
		
		//using guest mode to avoid the data breaches pop-up msg in the web page
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the SauceDemo.com
		driver.get("https://www.saucedemo.com/v1");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Locate the Username by using "id" locator and also send the username value "standard_user"
		WebElement element = driver.findElement(By.id("user-name"));
		element.sendKeys("standard_user");
		
		//Locate the Password by using "id" locator and also send the password value"secret_sauce
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		//Locate the login button using "id locator" and also click the login button
		driver.findElement(By.id("login-button")).click();
		
		//Successfully logged into the web page
		System.out.println("Successfully logged into the account");
	}

}
