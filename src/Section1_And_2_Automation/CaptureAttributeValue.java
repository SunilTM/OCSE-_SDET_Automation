package Section1_And_2_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAttributeValue {
	ChromeDriver driver;

	public static void main(String[] args) {

		CaptureAttributeValue cav = new CaptureAttributeValue();
		cav.launchBrowser();
		cav.CaptureAttributeVaues();
		cav.closeBrowser();
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		// driver.manage().window().maximize();
	}

	public void CaptureAttributeVaues() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin123");

		System.out.println(username.getAttribute("value"));
	}

	public void closeBrowser() {
		driver.close();
	}

}
