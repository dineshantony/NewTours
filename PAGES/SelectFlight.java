package POM.PAGES;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectFlight extends LoginPage{
	
		public void Flight(){
		
		WebElement radiobutton = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[5]/td[1]"));
		
		if(!radiobutton.isSelected()){
			
			radiobutton.click();
		}
		
	}
		
		public void Continue(){
			
			driver.findElement(By.name("reserveFlights")).click();
		}

}
