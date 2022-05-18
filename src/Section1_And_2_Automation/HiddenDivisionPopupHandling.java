package Section1_And_2_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopupHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		// driver.manage().window().maximize();

		// Login to ActiTime Appliction
		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);

		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("(//div[@class='checkbox inactive']/div)[1]")).click();
		driver.findElement(By.cssSelector("div.delete")).click();

		// Explicitly Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[contains(text(),'You are about to delete')]")));

		String msg = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(msg);

		driver.close();
	}

}
