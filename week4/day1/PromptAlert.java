package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//h5[contains(.,'Prompt')]/following-sibling::button")).click();
		driver.switchTo().alert().sendKeys("Balaji");
		driver.switchTo().alert().dismiss();
	}

}
