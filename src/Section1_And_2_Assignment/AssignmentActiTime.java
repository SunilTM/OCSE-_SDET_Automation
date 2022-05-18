package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		driver.manage().window().maximize();

		// Enter username
		driver.findElement(By.className("textField")).sendKeys("admin");

		// Enter password
		driver.findElement(By.className("pwdfield")).sendKeys("manager");

		// click on login
		driver.findElement(By.id("loginButton")).click();

		// Thread.sleep(1000);

		String latesturl = driver.getCurrentUrl();
		System.out.println("Latest URL :" + latesturl);
		String title = driver.getTitle();
		System.out.println("Title is: " + title);

		driver.close();

	}
}
