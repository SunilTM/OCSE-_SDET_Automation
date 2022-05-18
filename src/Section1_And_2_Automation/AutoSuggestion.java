package Section1_And_2_Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

		// driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Selenium");
		// Thread.sleep(2000);

		List<WebElement> wb = driver.findElements(By.xpath("//ul[@class=\"erkvQe\"]/li"));

		for (WebElement lo : wb) {
			String item = lo.getText();

			if (item.contains("tutorial")) {
				lo.click();
				break;
			}
		}

		driver.close();
	}

}
