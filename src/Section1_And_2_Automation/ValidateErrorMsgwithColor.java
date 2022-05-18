package Section1_And_2_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateErrorMsgwithColor {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		ValidateErrorMsgwithColor vemc = new ValidateErrorMsgwithColor();
		vemc.launchBrowser();
		vemc.ValidateErrorMsgwitColor();
		vemc.closeBrowser();
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		// driver.manage().window().maximize();
	}

	public void ValidateErrorMsgwitColor() throws InterruptedException {
		driver.findElement(By.id("loginButton")).click();
		// Thread.sleep(2000);

		WebElement error = driver.findElement(By.className("errormsg"));
		String actualError = error.getText();

		if (actualError.equals("Username or Password is invalid. Please try again.")) {
			System.out.println("Error validation Pass");
		} else {
			System.out.println("Error validation Fail");
		}
		String actualColorCode = error.getCssValue("color");
		System.out.println(actualColorCode);

	}

	public void closeBrowser() {
		driver.close();
	}

}
