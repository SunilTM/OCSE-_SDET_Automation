package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentVirat {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("Virat kholi");

		// Thread.sleep(2000);

		driver.findElement(By.name("btnK")).click();

		// Thread.sleep(2000);
		String inventory = driver.findElement(By.id("result-stats")).getText();
		System.out.println(inventory);
		driver.close();
	}
}
