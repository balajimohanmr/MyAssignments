package week5.day2.assignments.leaftap;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MergeLead extends BaseClass {
	@Test
	public void mergeLead() throws InterruptedException {
	
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//a[contains(@href,'IdFrom')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String pId = iterator.next();
		String cId1 = iterator.next();
		driver.switchTo().window(cId1);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div.x-grid3-scroller div.x-grid3-row:nth-child(1) a:nth-child(1)")).click();
		driver.switchTo().window(pId);
		driver.findElement(By.xpath("//a[contains(@href,'IdTo')]")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		Iterator<String> iterator1 = windowHandles1.iterator();
		iterator1.next();
		String cId2 = iterator1.next();
		driver.switchTo().window(cId2);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div.x-grid3-scroller div.x-grid3-row:nth-child(2) a:nth-child(1)")).click();
		driver.switchTo().window(pId);
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(30000);
		driver.switchTo().defaultContent();
		System.out.println("Title is : "+driver.getTitle());
	}

}
