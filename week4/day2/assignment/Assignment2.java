package week4.day2.assignment;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Assignment2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.nykaa.com/");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("Brands")))
				.moveToElement(driver.findElement(By.id("brandSearchBox"))).click().sendKeys("L'Oreal Paris").build()
				.perform();
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[contains(.,'Sort')]")).click();
		a.moveToElement(driver.findElement(By.xpath("//span[contains(.,'customer')]/ancestor::div/input"))).click()
				.build().perform();
		driver.findElement(By.linkText("Categories")).click();
		Thread.sleep(2000L);
		a.moveToElement(driver.findElement(By.linkText("Hair"))).perform();
		driver.findElement(By.linkText("Shampoo")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> al=new ArrayList<String>(windowHandles);
		driver.switchTo().window(al.get(1));
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		if (driver.findElement(By.xpath("//span[@class='filter-value']")).getText().contains("Color Protection")) System.out.println("Color Protection filter is applied");
		else System.out.println("Color protection filter is not applied yet");
		a.moveToElement(driver.findElement(By.xpath("//a[contains(.,\"L'Oreal Paris Colour Protect Shampoo\")]"))).click().build().perform();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> al1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(al1.get(2));
		new Select(driver.findElement(By.xpath("//select[@title='SIZE']"))).selectByVisibleText("180ml");
		System.out.println("MRP is : "+driver.findElement(By.xpath("//span[contains(.,'MRP')]/following-sibling::span")).getText());
		driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
		driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.css-acpm4k")));
		System.out.println("Grand total is : "+driver.findElements(By.cssSelector("div.footer-layout span")).get(0).getText());
		int grandTotal=Integer.parseInt(driver.findElements(By.cssSelector("div.footer-layout span")).get(0).getText().substring(1));
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//button[.='Proceed']")).click();
		driver.findElement(By.xpath("//button[.='Continue as guest']")).click();
		int priceDetails=Integer.parseInt(driver.findElement(By.xpath("//p[text()='Price Details']/../following-sibling::p")).getText().substring(1));
		System.out.println("Grand Total: "+grandTotal+" "+"Price Details :"+priceDetails);
		if (grandTotal==priceDetails) System.out.println("Grand total is same as in step 14");
		else System.out.println("Grand total is not same as in step 14");
		driver.quit();
		
	
	}

}
