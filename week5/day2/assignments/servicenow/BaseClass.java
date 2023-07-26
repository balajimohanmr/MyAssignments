package week5.day2.assignments.servicenow;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public ChromeDriver driver;
	@BeforeMethod
	public void precondition() {
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://dev107323.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Sakal2023#");
		driver.findElement(By.xpath("//button[text()]")).click();
	}
	@AfterMethod
	public void postCondition() throws InterruptedException {
		Thread.sleep(5000L);
		driver.close();
	}

}
