package Section1_And_2_Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturePriceofIphonexFromFlipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		// driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("iphone x", Keys.ENTER);

		driver.findElement(By.xpath("//div[starts-with(text(),'APPLE iPhone')]")).click();

		String mainId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {
			if (!mainId.equals(id)) {
				driver.switchTo().window(id);

				WebElement product = driver.findElement(By.xpath("//span[starts-with(text(),'APPLE iPhone X')]"));
				WebElement price = driver.findElement(By.xpath("//div[@class='CEmiEU']/div/div[contains(text(),'₹')]"));

				System.out.println(product.getText() + " price is :-" + price.getText());

			}
			driver.close();
		}
	}
}