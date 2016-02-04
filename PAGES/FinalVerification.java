package POM.PAGES;

import POM.LoginPage;

public class FinalVerification extends LoginPage {
	
	String verify = "Your itinerary has been booked!";
	
	public void verify(){
		
		if(verify.equals("Your itinerary has been booked!"))
		{
			System.out.println("Your ticket(s) has been booked");
		}
		else
		{
			System.out.println("Your ticket(s) are not booked");
		}
	}

}
