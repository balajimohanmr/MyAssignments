package Marathon3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_001_Chrome extends BaseClass_Marathon3{
	@BeforeSuite
	public void setValues() {
		excelSheetName="Marathon3_TC_1_data";
	}
	@Test(dataProvider="sendData")
	public void doTC_001_Chrome(String question, String details ) throws InterruptedException {
		
		driver.findElement(By.xpath("//one-app-launcher-modal//input")).sendKeys("Content");
		driver.findElement(By.xpath("//p[.='Content']")).click();
		WebElement chatter=driver.findElement(By.xpath("//span[text()='Chatter']/.."));
		driver.executeScript("arguments[0].click()", chatter);
		Thread.sleep(2000L);
		System.out.println("Title of the page is "+driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Chatter"),"Title is wrong");
		driver.findElement(By.linkText("Question")).click();
		driver.findElement(By.cssSelector("textarea.cuf-questionTitleField.textarea")).sendKeys(question);
		driver.findElement(By.cssSelector("div.questionbody.input-field p")).sendKeys(details);
		driver.findElement(By.xpath("//button[text()='Ask']")).click();
		Thread.sleep(2000L);
		Assert.assertEquals(driver.findElements(By.cssSelector("div.cuf-questionTitle")).get(0).getText(), question) ;
		
	}

}
