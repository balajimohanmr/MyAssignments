package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
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
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Important note");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		// createLeadForm_primaryEmail
	}

}
