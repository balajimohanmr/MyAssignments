package Marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.sukgu.Shadow;

public class Admin_certifications {
	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException {
		ChromeOptions ch = new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ch);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[contains(.,'Mobile Publisher')]/ancestor::h2/../following-sibling::div/button")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it =windowHandles.iterator();
		String pId=it.next();
		String cId=it.next();
		driver.switchTo().window(cId);
		driver.findElement(By.xpath("//button[.='Confirm']")).click();
		Shadow sh = new Shadow(driver);
		sh.findElementByXPath("//span[contains(.,'Learning')]").click();
		Actions a = new Actions(driver);
		a.moveToElement(sh.findElementByXPath("//a[contains(@href,'trail')]")).perform();
		sh.findElementByXPath("//a[.='Salesforce Certification']").click();
		driver.findElements(By.xpath("//div[@class='credentials-card_title']/a")).get(0).click();
		System.out.println(driver.getTitle());
		driver.executeScript("window.scrollBy(0,2750)");
		System.out.println("Following are the available administrator ceritifications : \n");
		List<WebElement> certs= driver.findElements(By.cssSelector("div.slds-p-around_large  div.credentials-card_title a"));
		Thread.sleep(2000L);
		for (WebElement cert:certs) {
			System.out.println(cert.getText());
		}
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("./snaps/Marathon2-admincerts.png"));
		
	}

}
