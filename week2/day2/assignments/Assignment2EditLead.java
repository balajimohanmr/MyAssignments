package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//div[@id='findLeads']//*[@name='firstName']")).sendKeys("Aadhi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a")).click();
		System.out.println("Title of the page is :"+driver.getTitle());
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		String changedName="Amazon";
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(changedName);
		driver.findElement(By.name("submitButton")).click();
		if (driver.findElement(By.id("viewLead_companyName_sp")).getText().contains(changedName)) System.out.println("It is confirmed that the changed name appears after update ..\nThe Changed company name is: "+changedName);
		else System.out.println("Changed name does not appear after update ");
		//driver.close();
	}

}
