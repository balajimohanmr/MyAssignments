package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://dev31913.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("q+NozS5Qe8!E");
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		Shadow sh = new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//div[@id='all']").click();
		sh.findElementByXPath("//span[.='Service Catalog']").click();
		driver.switchTo().frame(sh.findElementByXPath("//iframe[@id='gsft_main']"));
		driver.findElement(By.xpath("//h2[contains(.,'Mobiles')]/../..")).click();
		driver.findElement(By.linkText("iPhone 6s")).click();
		Thread.sleep(2000L);
		new Select(driver.findElement(By.xpath("(//div[contains(@class,'form-group')])[1]//select")))
				.selectByVisibleText("Gold");
		new Select(driver.findElement(By.xpath("(//div[contains(@class,'form-group')])[2]//select")))
				.selectByVisibleText("128");
		driver.findElement(By.xpath("//button[contains(.,'Order Now')]")).click();
		if (driver.findElement(By.xpath("//span[@aria-live=\"assertive\"]")).getText()
				.contains("Thank you, your request has been submitted"))
			System.out.println("Order has been placed successfully");
		else
			System.out.println("Order placement failed");
		System.out.println("Request number is : " + driver.findElement(By.id("requesturl")).getText());
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("./snaps/Marathon2-servicenow.png"));
	}

}
