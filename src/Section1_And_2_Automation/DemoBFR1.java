package Section1_And_2_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBFR1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.spicejet.com/");
		driver.navigate().to("https://www.spicejet.com/");
		// Thread.sleep(2000);

		// driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");
		// Thread.sleep(2000);

		Navigation nav = driver.navigate();

		// back
		nav.back();
		// Thread.sleep(2000);

		// forward
		nav.forward();
		// Thread.sleep(2000);

		// refresh
		nav.refresh();

		// close Browser
		driver.close();
	}
}
