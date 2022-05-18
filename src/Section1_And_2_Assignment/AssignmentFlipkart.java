package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkart {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		// Thread.sleep(4000);
		driver.findElement(By.cssSelector("Button._2KpZ6l._2doB4z")).click();
		// Thread.sleep(4000);
		driver.findElement(By.cssSelector("[placeholder ='Search for products, brands and more']")).sendKeys("IphoneX");
		// Thread.sleep(4000);
		driver.findElement(By.cssSelector("button.L0Z3Pu")).click();
		String title = driver.getTitle();
		System.out.println("Title is: " + title);

		driver.close();
	}
}
