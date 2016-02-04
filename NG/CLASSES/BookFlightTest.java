package POM.NG.CLASSES;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.PAGES.BookFlight;

public class BookFlightTest {
	
	BookFlight booking = new BookFlight();
	
	
	@BeforeTest
	
	public void preRequirements(){
		
		LoginPageTest log = new LoginPageTest();
		log.getInputs();
		
		FlightFinderTest flight = new FlightFinderTest();
		 flight.getInputs();
		 
		 SelectFlightTest select = new SelectFlightTest();
		 select.getInputs();
	}
	
	
	
	@Test
	
	public void getInputs(){
		
		booking.PassengersDetail1("Antony", "Dinesh", "DBML");
		booking.PassengersDetail2("Sundar", "Singh", "HNML");
		booking.PassengersDetail3("Ganesh", "Kumar", "KSML");
		booking.PassengersDetail4("Joseph", "Ronald", "MOML");
		booking.CreditCard("BA", "12", "2010", "1234567890");
		booking.BillingAddress();
		booking.SecurePurchase();
	}

}
