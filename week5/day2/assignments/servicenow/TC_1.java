package week5.day2.assignments.servicenow;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class TC_1 extends BaseClass{
	public String incNum;
	@Test
	public void createNewIncident() {
		
		Shadow sh=new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Incidents']").click();
		driver.switchTo().frame(sh.findElementByXPath("//iframe[@id='gsft_main']"));
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//div[contains(.,'description')]/following-sibling::div//input[@mandatory]")).sendKeys("I have no idea what I am doing ");
		String incNum= driver.findElement(By.id("incident.number")).getAttribute("value");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.findElement(By.cssSelector("div.input-group input")).sendKeys(incNum,Keys.ENTER);
		//verification
		if (driver.findElement(By.xpath("//a[starts-with(text(),'INC')]")).getText().equals(incNum)) System.out.println("It is confirmed that the instance number: " +incNum+ " is created ");
		else System.out.println("Instance is not created");
	}
	

}
