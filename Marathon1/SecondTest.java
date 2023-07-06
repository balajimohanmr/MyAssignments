package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		driver.findElement(By.xpath("//div[normalize-space()='bags for boys']")).click();
		System.out.println("Total results in the page : "+driver.findElement(By.xpath("(//div[@class='sg-col-inner']/div/span)[1]")).getText().split("results")[0].split("over")[1].trim());
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span.a-dropdown-container")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		System.out.println("Info of the first resulting bag : \n"+"Name : "+driver.findElement(By.xpath("//div[@data-cel-widget='search_result_1']//h2")).getText()+"\nDiscounted Price : "+driver.findElement(By.xpath("//div[@data-cel-widget='search_result_1']//span[@class='a-price-whole']")).getText());
		System.out.println("Page of the title is : "+driver.getTitle());
		driver.close();
		
	}

}
