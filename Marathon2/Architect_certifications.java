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

import io.github.sukgu.Shadow;

public class Architect_certifications {
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
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
		sh.setImplicitWait(10);
		sh.findElementByXPath("//span[contains(.,'Learning')]").click();
		Actions a = new Actions(driver);
		a.moveToElement(sh.findElementByXPath("//a[contains(@href,'trail')]")).perform();
		sh.findElementByXPath("//a[.='Salesforce Certification']").click();
		driver.findElement(By.xpath("//a[contains(.,'Architect')]")).click();
		System.out.println("Text summary of salesforce architect : \n");
		System.out.println(driver.findElement(By.xpath("(//h1[.='Salesforce Architect']/following-sibling::div)[1]")).getText().split("The Salesforce Certified Technical Architect (CTA)")[0]);
		List<WebElement> archCerts= driver.findElements(By.xpath("//h1[.='Salesforce Architect Credentials']/../following-sibling::div //div[@class='credentials-card_title']/a"));
		Thread.sleep(2000L);
		System.out.println("Following are the list of Salesforce Architect Certifications :\n");
		for (WebElement archCert:archCerts) {
			System.out.println(archCert.getText());
		}
		driver.findElement(By.linkText("Application Architect")).click();
		List<WebElement> appArchCerts= driver.findElements(By.cssSelector("div.credentials-card_title a"));
		Thread.sleep(2000L);
		System.out.println("Following are the list of application architech certifications :\n");
		for (WebElement appArchCert : appArchCerts) {
			System.out.println(appArchCert.getText());
		}
		driver.executeScript("window.scrollBy(0,700)");
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("./snaps/Marathon2-Architectcertsa.png"));
		driver.executeScript("window.scrollBy(0,1250)");
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("./snaps/Marathon2-Architectcertsb.png"));
	}

}
