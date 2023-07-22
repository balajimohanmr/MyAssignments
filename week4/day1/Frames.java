package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(.,'Try it')]")).click();
		driver.switchTo().alert().accept();
		if (driver.findElement(By.id("demo")).getText().contains("OK"))
			System.out.println("You pressed OK!");
		else
			System.out.println("You pressed cancel");

	}

}
