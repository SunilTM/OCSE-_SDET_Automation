package Section1_And_2_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAutoSuggestionofIndaiTime {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.timeanddate.com/worldclock/");

		// driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.className("picker-city__input")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		List<WebElement> bn = driver.findElements(By.className("po"));

		for (WebElement j : bn) {
			System.out.println(j.getText());
		}
		driver.close();
	}

}
