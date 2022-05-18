package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLastCheckbox {

	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		FirstLastCheckbox flc = new FirstLastCheckbox();

		flc.launchBrowser();
		flc.getAddcompairbtn();
		// flc.closeBrowser();

	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	public void getAddcompairbtn() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("IphoneX");
		driver.findElement(By.cssSelector("button[type='submit']")).click();

		// Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Add to Compare'])[last()]")).click();

	}

	public void closeBrowser() {
		driver.close();
	}

}
