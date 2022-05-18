package Section1_And_2_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAttributeTitle {
	ChromeDriver driver;

	public static void main(String[] args) {

		CaptureAttributeTitle cat = new CaptureAttributeTitle();
		cat.launchBrowser();
		cat.CaptureAttributeTitle();
		cat.closeBrowser();
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");
		// driver.manage().window().maximize();
	}

	public void CaptureAttributeTitle() {
		WebElement username = driver.findElement(By.id("keepLoggedInCheckBox"));

		System.out.println(username.getAttribute("title"));
	}

	public void closeBrowser() {
		driver.close();
	}
}
