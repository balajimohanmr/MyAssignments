package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {
	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("oneplus 9 pro",Keys.ENTER).build().perform();
		int priceFirstProduct= Integer.parseInt(driver.findElement(By.cssSelector("span.a-price-whole")).getText().replace(",", ""));
		System.out.println("Number of customer reviews for the first product is :"+ driver.findElement(By.xpath("//a[contains(@href,'Review')]/span")).getText());
		driver.findElement(By.xpath("//h2/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> al=new ArrayList<String>(windowHandles);
		driver.switchTo().window(al.get(1));
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File ("./snaps/firstProductAmazon.png"));
		driver.findElement(By.id("add-to-cart-button")).click();
		int cartSubtotal=Integer.parseInt(new WebDriverWait(driver,Duration.ofSeconds(5000L)).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("attach-accessory-cart-subtotal")))).getText().replaceAll("\\D+([0-9]+)\\D+([0-9]+).+", "$1$2"));
		if (priceFirstProduct==cartSubtotal) System.out.println("Cart subtotal  is correct");
		else System.out.println("Cart subtotal is wrong");
		driver.quit();
		
	}

}
