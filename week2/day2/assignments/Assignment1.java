package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("firstname");
		driver.findElement(By.name("lastname")).sendKeys("lastname");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567891");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("1");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("Jan");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1955");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	
	}

}
