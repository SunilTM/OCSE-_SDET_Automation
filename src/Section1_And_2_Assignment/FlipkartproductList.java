package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartproductList {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		// driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("IphoneX", Keys.ENTER);
		// Thread.sleep(2000);

		String s = driver.findElement(By.xpath("//div[contains(text(),'APPLE iPhone X (Silver, 256 GB)')]")).getText();
		System.out.print("Product is :- " + s);

		String s1 = driver.findElement(By
				.xpath("//div[contains(text(),'APPLE iPhone X (Silver, 256 GB)')]/../following-sibling::div[1]/div[1]"))
				.getText();
		System.out.print("  price is:- " + s1);
	}
}
