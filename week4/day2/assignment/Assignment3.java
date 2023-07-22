package week4.day2.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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

public class Assignment3 {
	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		Actions a = new Actions (driver);
		a.moveToElement( driver.findElement(By.xpath("//li[contains(.,\"Men's Fashion\")]"))).perform();
		a.moveToElement( driver.findElement(By.xpath("//a[contains(.,\"Sports Shoes\")]"))).click().build().perform();
		System.out.println("Total number of sports shoes is: "+ driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText());
	    driver.findElement(By.xpath("//div[text()='Training Shoes']/..")).click();
	    driver.findElement(By.xpath("//span[text()='Sort by:']/..")).click();
	    Thread.sleep(1000L);
	    driver.findElement(By.xpath("//li[contains(.,'Low To High')]")).click();
	    Thread.sleep(2000L);
	    List<WebElement> prices = driver.findElements(By.xpath("//span[@display-price]"));
	    int min=0;int flag=0;
	    for (WebElement price:prices) {
	    	int displayPrice=Integer.parseInt(price.getAttribute("display-price"));
	    	System.out.println(displayPrice);
	    	if (displayPrice>min) {
	    		flag=1;
	    		min=displayPrice;
	    	}
	    	else {
	    		flag=0;
	    		break;
	    	}
	    }
	    if (flag==1) System.out.println("Displayed items are sorted correctly (Price Low to High) ");
	    else System.out.println("Displayed items are not sorted (Price Low to High) ");
  
	    a.dragAndDropBy(driver.findElement(By.cssSelector("a.left-handle")), 270,0).perform();
	    Thread.sleep(2000L);
	    driver.findElement(By.xpath("//label[contains(.,'White &')]")).click();
	    System.out.println("Following filters are applied :\n");
	    Thread.sleep(2000L);
	    for (WebElement filter : driver.findElements(By.xpath("//div[@class='filters-top-selected']//a")) ) {
	    	System.out.println(filter.getText());
	    }
	    a.moveToElement(driver.findElement(By.cssSelector("div.product-tuple-image"))).perform();
	    a.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"))).click().build().perform();
	    System.out.println("Price and discount of the shoe is :"+driver.findElement(By.xpath("//span[@class=\"percent-desc \"]/..")).getText());
	    FileUtils.copyFile(driver.findElement(By.cssSelector("div.modal-wrapper")).getScreenshotAs(OutputType.FILE), new File ("./snaps/Week3_Assignment3.png"));
	    driver.findElement(By.cssSelector("div.close i")).click();
	    driver.close();
	    
	}

}
