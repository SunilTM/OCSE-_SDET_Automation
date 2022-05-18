package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IrctcChairmanName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.com/about.html");
		driver.manage().window().maximize();

		// Mouse Over on About Us link

		WebElement aboutus = driver
				.findElement(By.xpath("//div[@class='collapse navbar-collapse']//a[text()='About Us']"));
		Actions act = new Actions(driver);
		act.moveToElement(aboutus).perform();

		// driver.findElement(By.xpath("//div[(@class='container
		// clearfix')]/nav/div/ul/li[1]")).click();
		driver.findElement(By.xpath("//div[(@class='container clearfix')]/nav/div/ul/li[1]/ul/li[2]/a")).click();

		WebElement s = driver
				.findElement(By.xpath("//td[text()='Chairman & Managing Director (Additional Charge) ']/../td[2]"));
		System.out.println("IRCTC Chairman & Managing Director is:- " + s.getText());

		driver.close();
	}
}