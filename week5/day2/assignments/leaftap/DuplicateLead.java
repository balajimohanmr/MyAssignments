package week5.day2.assignments.leaftap;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{
	@Test
	public void duplicateLead() {
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("balaji");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rajamohan");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("balaji");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("To find bugs");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test.test@gmail.com");
		Select s3 = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		s3.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Duplicate")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("wipro");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("billa");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		
		// createLeadForm_primaryEmail
	}

}
