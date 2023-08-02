package Marathon3;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC_002_Edge extends BaseClass_Marathon3 {
	@BeforeSuite
	public void setValues() {
		excelSheetName="Marathon3_TC_2_data";
	}
	
	@Test(dataProvider="sendData")
	public void doTC_002_Edge(String oppName, String amount) throws InterruptedException {
		
		driver.findElement(By.xpath("//a[.='Sales']")).click();
	
	
		
		WebElement viewAllKeyDeals = driver.findElement(By.xpath("//a[.='View All Key Deals']"));
		driver.executeScript("arguments[0].click()", viewAllKeyDeals);
		
		driver.findElement(By.xpath("//a[.='New']")).click();
		driver.findElement(By.xpath("//div[@data-target-selection-name=\"sfdc:RecordField.Opportunity.Name\"]//input")).sendKeys(oppName);
		driver.findElement(By.xpath("//label[.='Type']/..//button")).click();
		driver.findElement(By.xpath("//span[text()='New Customer']/..")).click();
		driver.findElement(By.xpath("//label[.='Lead Source']/..//button")).click();
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		driver.findElement(By.xpath("//label[text()='Amount']/following-sibling::div/input")).sendKeys(amount);
		driver.findElement(By.xpath("//label[text()='Close Date']/..//input")).click();
		driver.findElement(By.xpath("//td[@class=\"slds-is-today\"]/following-sibling::td[2]")).click();
		driver.findElement(By.xpath("//label[text()='Stage']/..//button")).click();
		driver.findElement(By.xpath("//records-lwc-detail-panel//span[text()='Needs Analysis']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Campaign Source')]/..//input")).click();
		driver.findElement(By.xpath("//span[.='Bootcamp']")).click();
		driver.findElement(By.xpath("//records-lwc-detail-panel//button[.='Save']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//h1//lightning-formatted-text")).getText(),oppName);
		System.out.println("Verfiied using Assert statement that the "+oppName+ " opportunity is created");
		
		
		
	}

}
