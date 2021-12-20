package AssingmentWeek4Day1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement findElement = driver.findElement(By.id("Click"));
		File screenshotAs = findElement.getScreenshotAs(OutputType.FILE);
		File dest = new File("./test.png");
		FileUtils.copyFile(screenshotAs, dest);
		driver.switchTo().defaultContent();
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		System.out.println(findElements.size());
	}
}
