package week4.day2.assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source = driver.findElement(By.id("form:drag_content"));
		WebElement dest =driver.findElement(By.id("form:drop_content"));
		Actions a = new Actions (driver);
		a.dragAndDrop(source, dest).perform();
		File ss = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File ("./snaps/dragAndDrop.png"));
		
		
		
	}

}
