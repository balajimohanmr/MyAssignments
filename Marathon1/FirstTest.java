package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com/");
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'ui-state-default')])[2]")).click();
		driver.findElement(By.linkText("Search")).click();
		System.out.println("Name of the first resulting bus is : "+driver.findElement(By.xpath("(//div[@class='search-column1']/h2)[1]")).getText());
		driver.findElement(By.id("Bustypes4")).click();
		System.out.println("First resulting bus seat count is : "+driver.findElement(By.xpath("(//div[@class='search-column2-col1']/p)[1]")).getText());
		driver.findElement(By.xpath("//a[contains(.,'Select Seat')]")).click();
		driver.findElement(By.xpath("(//div[@class='seats']//li[not(contains(@class,'unavailable'))]/a)[1]")).click();
		System.out.println("Seats selected : "+driver.findElement(By.id("seatnos")).getText() + "/n"+"Total fare : "+driver.findElement(By.id("ticketfare")).getText() );
		new Select(driver.findElement(By.id("boardingpoint_id"))).selectByIndex(1);
		new Select(driver.findElement(By.id("droppingpoint_id"))).selectByIndex(1);
		System.out.println("Title of the page is :"+driver.getTitle());
		driver.close();
		

	}
	

}
