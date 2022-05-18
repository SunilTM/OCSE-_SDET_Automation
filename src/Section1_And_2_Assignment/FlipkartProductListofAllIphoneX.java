package Section1_And_2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductListofAllIphoneX {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("Iphone X", Keys.ENTER);

		List<WebElement> pro = driver.findElements(By.xpath("//div[starts-with(text(),'APPLE iPhone')]"));
		int count = 0;
		for (WebElement i : pro) {
			String productName = i.getText();

			String price = driver
					.findElement(
							By.xpath("//div[text()='" + productName + "']/../../div[2]//div[starts-with(text(),'₹')]"))
					.getText();
			System.out.println(productName + "----> " + price);
			count++;
		}
		System.out.println("Total Products present :-" + count);
		driver.close();
	}
}
