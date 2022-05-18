package Section1_And_2_Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchAllImages {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		// Thread.sleep(2000);
		List<WebElement> allimage = driver.findElements(By.xpath("//img"));

		int count = 0;
		for (WebElement i : allimage) {
			System.out.println(i.getText());
			count++;
		}
		System.out.println("Total Images are :" + count);
		driver.close();
	}

}
