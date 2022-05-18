package Section1_And_2_Automation;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderHandling {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone x", Keys.ENTER);
		WebElement sliderstart = driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[1]"));

		Actions act = new Actions(driver);
		act.dragAndDropBy(sliderstart, 80, 0).perform();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[contains(@class,'FdLqY')])[2]")));

		WebElement sliderend = driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[2]"));

		act.dragAndDropBy(sliderend, -40, 0).perform();

		driver.close();
	}
}