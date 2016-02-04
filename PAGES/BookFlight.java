package POM.PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BookFlight extends LoginPage{
	
	public void PassengersDetail1(String firstname, String lastname, String meal){
		
		driver.findElement(By.name("passFirst0")).sendKeys(firstname);
		driver.findElement(By.name("passLast0")).sendKeys(lastname);
		Select s1 = new Select(driver.findElement(By.name("pass.0.meal")));
		s1.selectByValue(meal);
		
	}
	public void PassengersDetail2(String firstname, String lastname, String meal){
		
		
		driver.findElement(By.name("passFirst1")).sendKeys(firstname);
		driver.findElement(By.name("passLast1")).sendKeys(lastname);
		Select s2 = new Select(driver.findElement(By.name("pass.1.meal")));
		s2.selectByValue(meal);
		
	}
	public void PassengersDetail3(String firstname, String lastname, String meal){
		
		
		driver.findElement(By.name("passFirst2")).sendKeys(firstname);
		driver.findElement(By.name("passLast2")).sendKeys(lastname);
		Select s3 = new Select(driver.findElement(By.name("pass.2.meal")));
		s3.selectByValue(meal);
		
	}
	public void PassengersDetail4(String firstname, String lastname, String meal){
		
		
		driver.findElement(By.name("passFirst3")).sendKeys(firstname);
		driver.findElement(By.name("passLast3")).sendKeys(lastname);
		Select s4 = new Select(driver.findElement(By.name("pass.3.meal")));
		s4.selectByValue(meal);
		
		}
	
	public void CreditCard(String cardtype, String expirymonth, String expiryyear, String cardnumber){
		
		Select s1 = new Select(driver.findElement(By.name("creditCard")));
		s1.selectByValue(cardtype);
		driver.findElement(By.name("creditnumber")).sendKeys(cardnumber);
		
		//Select s2 = new Select(driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[6]/td/table/tbody/tr[2]/td[3]/select[1]")));
		//s2.selectByValue(expirymonth);
		
		Select s3 = new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		s3.selectByValue(expiryyear);
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("ANTONY");
		driver.findElement(By.name("cc_mid_name")).sendKeys("ALOY");
		driver.findElement(By.name("cc_last_name")).sendKeys("DINESH");
		
		}
	
	public void BillingAddress(){
		
		driver.findElement(By.name("billAddress1")).click();
		driver.findElement(By.name("billAddress1")).sendKeys("Pallikaranai");
	}
	
	public void SecurePurchase(){
		
		driver.findElement(By.name("buyFlights")).click();
	}

}

