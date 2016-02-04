package POM.NG.CLASSES;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.PAGES.SelectFlight;

public class SelectFlightTest extends FlightFinderTest{

	SelectFlight select = new SelectFlight();
	
	@BeforeTest
	
	public void preRequirements(){
		
		LoginPageTest log = new LoginPageTest();
		log.getInputs();
		
		FlightFinderTest flight = new FlightFinderTest();
		 flight.getInputs();
	}
	
	
	@Test
	
	public void getInputs(){
		
		select.Flight();
		select.Continue();
	}
}
