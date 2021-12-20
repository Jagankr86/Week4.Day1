package AssingmentWeek4Day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNowFrames {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev108339.service-now.com/navpage.do");
		driver.manage().window().maximize();
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Jagankr@86");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//div[text()='Incidents'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//b[text()='All']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
		driver.switchTo().defaultContent();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handel = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handel.get(1));
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='glide_ref_item_link'])[1]")).click();
		driver.switchTo().window(handel.get(0));
		driver.switchTo().frame(0);
		driver.findElement(By.id("incident.short_description")).sendKeys("Hi");
		String text = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("hi how r u"+text);
		driver.findElement(By.xpath("(//button[text()='Submit'])[2]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(text,Keys.ENTER);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./test.png");
		FileUtils.copyFile(screenshotAs, dest);		
	}
}
