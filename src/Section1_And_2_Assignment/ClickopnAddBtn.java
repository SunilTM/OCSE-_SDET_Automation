
package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickopnAddBtn {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String productName = "APPLE iPhone X (Silver, 64 GB)";

		ClickopnAddBtn cab = new ClickopnAddBtn();

		cab.launchBrowser();
		cab.getProductAddBtn(productName);
		// cab.closeBrowser();

	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	public void getProductAddBtn(String ProductName) throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("IphoneX");
		// Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();

	}

	public void closeBrowser() {
		driver.close();
	}

}
