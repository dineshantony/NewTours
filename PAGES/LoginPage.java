package POM.PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class LoginPage {
	
	
	
	public static WebDriver driver;
	private final String appurl = "http://newtours.demoaut.com";
	
	public void NavigateToHomepage(){
		
		driver =  new FirefoxDriver();
		driver.get(appurl);
	}
	
	public void setUserName(String username){
		
		driver.findElement(By.name("userName")).sendKeys(username);
		
	}
	
	public void setPassword(String password){
		
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void Signin(){
		
		driver.findElement(By.name("login")).click();
	}
	
	//public void closeBrowser(WebDriver driver){
		
		//driver.quit();
	//}
	
	public void pageVerificationlogin(){
		
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
	}
	
public void pageVerificationhome(){
		
		Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}
	

}

