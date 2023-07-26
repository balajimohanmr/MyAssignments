package week5.day2.assignments.servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class TC_2 extends BaseClass{
	@Test
	public void updateExistingIncidents() {
		Shadow sh=new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Incidents']").click();
		driver.switchTo().frame(sh.findElementByXPath("//iframe[@id='gsft_main']"));
		driver.findElement(By.cssSelector("div.input-group input")).sendKeys("INC0010012",Keys.ENTER);
		driver.findElement(By.xpath("//a[starts-with(text(),'INC')]")).click();
		new Select(driver.findElement(By.id("incident.urgency"))).selectByIndex(0);
		new Select(driver.findElement(By.id("incident.state"))).selectByValue("2");
		driver.findElement(By.xpath("//button[text()='Update']")).click();
		driver.findElement(By.xpath("//a[starts-with(text(),'INC')]")).click();
		System.out.println("Incident state is: "+new Select(driver.findElement(By.id("incident.state"))).getFirstSelectedOption().getText());
	}

}
