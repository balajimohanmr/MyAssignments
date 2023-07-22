package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlightBooking {
	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.partialLinkText("FLIGHTS")).click();
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>(windowHandle);
		driver.switchTo().window(windowList.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(windowList.get(0));
		driver.close();
	}

}
