package Section1_And_2_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenlinkinNewTab {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		// driver.manage().window().maximize();

		Actions act = new Actions(driver);
		WebElement gmail = driver.findElement(By.partialLinkText("Gmail"));
		act.contextClick(gmail).perform();

		Robot r = new Robot();
		// 1st Approch is:- "T" is shortcut key for new tab

		// r.keyPress(KeyEvent.VK_T);
		// r.keyRelease(KeyEvent.VK_T);

		// 2nd Approch is :-

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
