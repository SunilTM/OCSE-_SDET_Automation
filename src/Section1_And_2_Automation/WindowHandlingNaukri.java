package Section1_And_2_Automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlingNaukri {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		// driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(4));

		// keep main browser open & close child browser
		String mainID = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {
			if (!mainID.equals(id)) {
				driver.switchTo().window(id);
				driver.close();
			}
		}
	}
}
