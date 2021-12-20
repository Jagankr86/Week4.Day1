package AssingmentWeek4Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notificatios");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		
		WebElement findElement = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement findElement2 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		builder.keyDown(Keys.CONTROL).click(findElement).click(findElement2).keyUp(Keys.CONTROL).perform();
	}

}
