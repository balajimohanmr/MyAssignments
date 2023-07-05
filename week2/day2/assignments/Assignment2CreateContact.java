package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("balaji");
		driver.findElement(By.id("lastNameField")).sendKeys("rajamohan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("balaji1");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("balaji2");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("EEE");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hello");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("balajimohanmr@gmail.com");
		new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"))).selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Note");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title of the page is: "+driver.getTitle());
	}

}
