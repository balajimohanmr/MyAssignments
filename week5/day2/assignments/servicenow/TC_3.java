package week5.day2.assignments.servicenow;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class TC_3 extends BaseClass{
	@Test
	public void deleteIncident() throws InterruptedException {
		Shadow sh=new Shadow(driver);
		sh.setImplicitWait(30);
		sh.findElementByXPath("//div[text()='All']").click();
		sh.findElementByXPath("//span[text()='Incidents']").click();
		driver.switchTo().frame(sh.findElementByXPath("//iframe[@id='gsft_main']"));
		String incNum="INC0010012";
		driver.findElement(By.cssSelector("div.input-group input")).sendKeys(incNum,Keys.ENTER);
		driver.findElement(By.xpath("//a[starts-with(text(),'INC')]")).click();
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.findElement(By.cssSelector("div.modal-body.container-fluid button:nth-child(2)")).click();
		Thread.sleep(5000L);
		driver.findElement(By.cssSelector("div.input-group input")).sendKeys(incNum,Keys.ENTER);
		int check=driver.findElements(By.xpath("//a[starts-with(text(),'INC')]")).size();
		if (check==0) System.out.println("instance is successfully deleted");
		else System.out.println("instance is not deleted yet");
	}

}
