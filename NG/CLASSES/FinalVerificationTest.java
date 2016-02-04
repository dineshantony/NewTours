package POM.NG.CLASSES;

import org.testng.annotations.Test;

import POM.PAGES.FinalVerification;

public class FinalVerificationTest {
	
	FinalVerification verification = new FinalVerification();
	
	@Test
	
	public void verify(){
		
		verification.verify();
	}
			

}
