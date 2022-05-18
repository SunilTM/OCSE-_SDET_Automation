package Section1_And_2_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingHerokuapp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		// Alert Handling
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("My Own Alert Message");
		alt.accept();

		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
		driver.close();
	}
}
