package POM.NG.CLASSES;

import POM.NG.CLASSES.LoginPageTest; 
import POM.PAGES.LoginPage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.PAGES.FlightFinder;

public class FlightFinderTest extends LoginPageTest{
	
	FlightFinder finder = new FlightFinder();
	
	//@BeforeTest
	
	//public void preRequirements(){
		
		//LoginPageTest log = new LoginPageTest();
		//log.getInputs();
	//}
	
	
	@Test
	
	public void getInputs(){
		LoginPage login = new LoginPage();
		login.NavigateToHomepage();
		login.pageVerificationlogin();
		login.setUserName("mercury");
		login.setPassword("mercury");
		login.Signin();
		login.pageVerificationhome();
		finder.Type();
		finder.passengers("4");
		finder.DepartingFrom("New York");
		finder.On("5","24");
		finder.ArrivingIn("Paris");
		finder.Returning();
		finder.ServiceClass();
		//finder.Airline("Unified Airlines");
		finder.Continue();
	}

}
