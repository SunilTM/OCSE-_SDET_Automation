package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureRatingReview {

	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String productName = "APPLE iPhone X (Silver, 256 GB)";

		CaptureRatingReview crr = new CaptureRatingReview();

		crr.launchBrowser();
		crr.getProductRatingReview();
		crr.closeBrowser();

	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		// driver.manage().window().maximize();
	}

	public void getProductRatingReview() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("IphoneX");

		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// Thread.sleep(2000);
		String RevRat = driver
				.findElement(By.xpath("//div[ text()='APPLE iPhone X (Silver, 256 GB)']/../div[2]/span[2]")).getText();

		System.out.println("Review and rating is : " + RevRat);

	}

	public void closeBrowser() {
		driver.close();
	}
}
