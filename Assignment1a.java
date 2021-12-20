package AssingmentWeek4Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1a {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List <String> handle = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handle.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(handle.get(0));
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		List <String> handle1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(handle1.get(1));
		System.out.println(driver.getTitle());
		System.out.println(handle1.size());
		driver.close();
		driver.switchTo().window(handle1.get(2));
		System.out.println(driver.getTitle());
		driver.close();		
		driver.switchTo().window(handle1.get(0));
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List <String> handle2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(handle2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(handle2.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(handle2.get(0));
		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
		Thread.sleep(5000);
		Set<String> windowHandles3 = driver.getWindowHandles();
		List <String> handle3 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(handle3.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(handle3.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(handle3.get(0));
		System.out.println(driver.getTitle());
	}
}