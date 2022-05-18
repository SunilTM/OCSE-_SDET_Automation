package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='✕']")).click();

		driver.findElement(By.name("q")).sendKeys("IphoneX");
		// Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Popularity')]")).click();
		// Thread.sleep(1000);
		String s = driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(s);
		driver.close();
	}
}
