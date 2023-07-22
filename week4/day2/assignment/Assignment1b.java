package week4.day2.assignment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment1b {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		//Click and Confirm new Window Opens
		driver.findElement(By.xpath("//button[.='Open']")).sendKeys(Keys.CONTROL,Keys.ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
	    if (windowHandles.size()==2) System.out.println("New window has opened");
	    //Close all windows except Primary
	    driver.findElement(By.xpath("//button[contains(.,'Close')]")).sendKeys(Keys.CONTROL,Keys.ENTER);
	    Set<String> windowHandles1 = driver.getWindowHandles();
	    Iterator<String> iterator = windowHandles1.iterator();
	    String pId=iterator.next();
	    while (iterator.hasNext()) {
	    	driver.switchTo().window(iterator.next());
	    	driver.close();
	    }
	    // Find the number of opened tabs
	    driver.switchTo().window(pId);
	    driver.findElement(By.xpath("//button[contains(.,'Multiple')]")).sendKeys(Keys.CONTROL,Keys.ENTER);
	    Set<String> windowHandles2 = driver.getWindowHandles();
	    System.out.println("The numbers of opened tabs are : "+windowHandles2.size());
	    //Wait for 2 new tabs to open
	    driver.findElement(By.xpath("//button[contains(.,'delay')]")).sendKeys(Keys.CONTROL,Keys.ENTER);
	    
	    
		
		
	}

}
