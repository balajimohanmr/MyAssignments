package Marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Parameters;

import week6.day2.ReadExcel;

public class BaseClass_Marathon3 {
	public RemoteWebDriver driver;
	public String excelSheetName;
	
	@Parameters({"un","pw","url","browser","implicitwait"})
	@BeforeMethod
	public void preCondition(String un, String pw, String url,String browser,String impWait) throws InterruptedException {
		if (browser.contains("chrome")) {
			ChromeOptions ch = new ChromeOptions();
			ch.addArguments("--disable-notifications");
			
			driver = new ChromeDriver(ch);
		}
		else if (browser.contains("edge")) {
			EdgeOptions ed = new EdgeOptions();
			ed.addArguments("--disable-notifications");
			
			driver = new EdgeDriver(ed);
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(impWait)));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000L);
		driver.findElement(By.id("password")).sendKeys(pw);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//button[contains(.,'Launcher')]")).click();
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[text()='View All']")))).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
	
	@DataProvider()
	public String[][] sendData() throws IOException {
		return ReadExcel_Marathon3.readExcel(excelSheetName);

	}

}
