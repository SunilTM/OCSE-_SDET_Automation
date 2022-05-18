package Section1_And_2_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMaximizeResizeRelocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

		// Thread.sleep(1000);
		// Maximization of browser
		driver.manage().window().maximize();
		// Thread.sleep(1000);

		// Resizeing of the browser
		driver.manage().window().setSize(new Dimension(300, 700));

		// Relocation of browser
		// Thread.sleep(1000);
		driver.manage().window().setPosition(new Point(400, 200));

		// Close Browser
		driver.close();

	}
}