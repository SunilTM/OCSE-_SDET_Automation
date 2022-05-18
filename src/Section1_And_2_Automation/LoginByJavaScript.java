package Section1_And_2_Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByJavaScript {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("document.getElementById('username').value='admin';");
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager';");
		jse.executeScript("document.getElementById('loginButton').click();");

	}
}
