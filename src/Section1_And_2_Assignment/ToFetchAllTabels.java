package Section1_And_2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAllTabels {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		// Thread.sleep(2000);

		List<WebElement> allTabels = driver.findElements(By.xpath("//tabel"));

		int count = 0;

		for (WebElement i : allTabels) {
			System.out.println(i.getText());
		}
		System.out.println("Total tabels are :" + count);
		driver.close();

	}
}
