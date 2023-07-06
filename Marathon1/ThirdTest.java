package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.xpath("//div[normalize-space()='Movie Library']")).click();
		Thread.sleep(2000);
		new Select(driver.findElement(By.xpath("//select[@name='city']"))).selectByVisibleText("Chennai");
		new Select(driver.findElement(By.xpath("//select[@name='genre']"))).selectByVisibleText("ANIMATION");
		new Select(driver.findElement(By.xpath("//select[@name='lang']"))).selectByVisibleText("ENGLISH");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.movie-list div")).click();
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(2000);
		new Select(driver.findElement(By.id("cinemaName"))).selectByIndex(1);
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Balaji Rajamohan");
		new Select(driver.findElement(By.name("timings"))).selectByIndex(0);
		driver.findElement(By.name("noOfTickets")).sendKeys("2");
		driver.findElement(By.xpath("//pvr-datepicker")).click();
		driver.findElement(By.xpath("//span[not(contains(@class,'disabled')) and contains(@class,'day-unit')]")).click();
		driver.findElement(By.name("email")).sendKeys("test.test@gmail.com");
		driver.findElement(By.name("mobile")).sendKeys("1234556780");
		new Select(driver.findElement(By.name("food"))).selectByIndex(0);
		driver.findElement(By.name("comment")).sendKeys("No Thanks");
		driver.findElement(By.xpath("//span[text()='Copy To Self']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		driver.findElement(By.cssSelector("button.swal2-close")).click();
		System.out.println("Title of the page is : "+driver.getTitle());
		
		
	}

}
