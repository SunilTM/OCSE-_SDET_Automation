package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");

		driver.findElement(By.xpath("(//div[@class='fixedNav']/div[2]//a)[1]")).click();

		driver.switchTo().frame(0);
		WebElement frameF1 = driver.findElement(By.xpath("(//ul[@title='Packages']/li/a)[1]"));
		frameF1.click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement frame2 = driver.findElement(By.xpath("(//span[contains(text(),'WebDriver')])[1]"));
		frame2.click();

		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		WebElement frame3 = driver.findElement(By.xpath("//h2[@class='title']"));
		System.out.println(frame3.getText());

		driver.switchTo().defaultContent();
		driver.close();
	}

}
