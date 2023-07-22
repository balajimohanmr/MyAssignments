package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://buythevalue.in/");
		driver.findElement(By.xpath("(//div[@class='top-product']//a)[1]")).click();		
		driver.findElement(By.id("wk_zipcode")).sendKeys("625001");
		driver.findElement(By.cssSelector("input.btn")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		driver.findElement(By.xpath("(//a[@href='/cart'])[3]")).click();
		driver.findElement(By.id("checkout")).click();
		driver.switchTo().alert().accept();
		
	}

}
