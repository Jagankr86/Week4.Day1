package AssingmentWeek4Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame1");
		boolean enabled = driver.findElement(By.id("topic")).isEnabled();
		System.out.println(enabled);
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement findElement = driver.findElement(By.id("animals"));
		Select Sc = new Select(findElement);
		Sc.selectByIndex(2);
	}
}
