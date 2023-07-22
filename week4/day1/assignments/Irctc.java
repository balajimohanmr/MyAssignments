package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//p-autocomplete[@id='origin']//input")).sendKeys("MS",Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//p-autocomplete[@id='destination']//input")).sendKeys("CAPE",Keys.ARROW_DOWN,Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//td[contains(.,'Refresh')]")).click();
		driver.findElement(By.xpath("//td[contains(.,'WL')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'Book Now')]")).click();
		driver.findElement(By.xpath("//span[text()='No']/..")).click();
	}

}
