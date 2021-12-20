package AssingmentWeek4Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1b {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys("jagan");
		alert2.accept();
		driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();
		driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
	}
}