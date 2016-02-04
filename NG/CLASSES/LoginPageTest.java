package POM.NG.CLASSES;

import java.sql.Driver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import POM.PAGES.LoginPage;

public class LoginPageTest{
	
	@Test
	
	public void getInputs(){
		
		LoginPage login = new LoginPage();
		login.NavigateToHomepage();
		login.pageVerificationlogin();
		login.setUserName("mercury");
		login.setPassword("mercury");
		login.Signin();
		login.pageVerificationhome();	
			
		}
		
	}
	

