package POM.PAGES;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder extends LoginPage {
	
	public void Type(){
		
		WebElement radiobutton = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		
		if(!radiobutton.isSelected()){
			
			radiobutton.click();
		}
	}
	
	public void passengers(String x){
		
		Select s = new Select(driver.findElement(By.name("passCount")));
		s.selectByValue(x);
	}
	
	public void DepartingFrom(String x){
		
		Select s = new Select(driver.findElement(By.name("fromPort")));
		s.selectByValue(x);
	}
	
	public void On(String x1, String x2){
		
		Select s1 = new Select(driver.findElement(By.name("fromMonth")));
		s1.selectByValue(x1);
		Select s2 = new Select(driver.findElement(By.name("fromDay")));
		s2.selectByValue(x2);
		
	}
	
	public void ArrivingIn(String x){
		
		Select s = new Select(driver.findElement(By.name("toPort")));
		s.selectByValue(x);
	}
	
	public void Returning(){
		
		WebElement element = driver.findElement(By.name("toMonth"));
		if(element.isEnabled()){
			System.out.println("Month functionality is wrong as Returning should be disabled for oneway trip");
		}
		
		WebElement element1 = driver.findElement(By.name("toDay"));
		if(element1.isEnabled()){
			System.out.println("Date functionality is wrong as Returning should be disabled for oneway trip");
		}
		
	}
	
	public void ServiceClass(){
		
		WebElement radiobutton = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]"));
		
		if(!radiobutton.isSelected()){
			
			radiobutton.click();
		}
	}
	
	public void Airline(String x){
		
		Select s = new Select(driver.findElement(By.name("airline")));
		s.selectByValue(x);
		
	}
	
	public void Continue(){
		
		driver.findElement(By.name("findFlights")).click();
	}

}
