package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000L);
		String id =driver.findElements(By.xpath("//table[@class='x-grid3-row-table']//a")).get(0).getText();
		System.out.println("Lead ID of the first resulting Lead is :"+id);
		driver.findElements(By.xpath("//table[@class='x-grid3-row-table']//a")).get(0).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(id);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000L);
		if (driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText().contains("No records to display")) System.out.println("\"No records to display\" is displyed.Successful deletion is confirmed ");
		else System.out.println("Deletion is unsuccesful");
		driver.close();
		
		
	}

}
