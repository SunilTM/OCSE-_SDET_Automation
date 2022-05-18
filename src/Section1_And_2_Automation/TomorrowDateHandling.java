package Section1_And_2_Automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomorrowDateHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		// driver.manage().window().maximize();

		driver.findElement(By.id("datepicker")).click();

		String todaysxpath = "//a[contains(@class,'ui-state-highlight')]";

		String weeks = "/../../following-sibling::tr";
		String days = "/../following-sibling::td";

		List<WebElement> allWeeks = driver.findElements(By.xpath(todaysxpath + weeks));
		List<WebElement> allDays = driver.findElements(By.xpath(todaysxpath + days));

		if (allDays.size() > 0) {
			// handle tomorrows date in same week
			driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]/../following-sibling::td[1]/a"))
					.click();
		} else if (allDays.size() == 0) {
			// handle tomorrows date in next week
			driver.findElement(
					By.xpath("//a[contains(@class,'ui-state-highlight')]/../../following-sibling::tr[1]/td[1]/a"))
					.click();
		} else if (allWeeks.size() == 0) {
			// handle tomorrow in next month
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.linkText("1")).click();
		}
		// driver.close();
	}
}