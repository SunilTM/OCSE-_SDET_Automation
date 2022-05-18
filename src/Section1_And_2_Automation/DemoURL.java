package Section1_And_2_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoURL {
	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		URL url = new URL("https://www.spicejet.com/");
		driver.navigate().to(url);
	}
}
