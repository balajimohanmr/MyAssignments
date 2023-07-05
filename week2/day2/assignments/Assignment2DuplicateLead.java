package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000L);
		String firstNameOfFirstLead=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).getText();
		String lastNameOfFirstLead=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[4]")).getText();
		System.out.println("Name of the first resulting lead is :"+firstNameOfFirstLead+" "+lastNameOfFirstLead);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		if(driver.getTitle().contains("Duplicate Lead")) System.out.println("Title of the page that appears after clicking Duplicate Lead contains the following string: \"Duplicate Lead\"");
		else System.out.println("Incorrect title ");
		driver.findElement(By.name("submitButton")).click();
		if (driver.findElement(By.id("viewLead_firstName_sp")).getText().equals(firstNameOfFirstLead)&&driver.findElement(By.id("viewLead_lastName_sp")).getText().equals(lastNameOfFirstLead)) {
			System.out.println("Duplicate Lead's name is same as the captured name :" + firstNameOfFirstLead+" "+lastNameOfFirstLead);
		}
		else System.out.println("Duplicate Lead's name is not same as the captured name ");
		
	}

}
