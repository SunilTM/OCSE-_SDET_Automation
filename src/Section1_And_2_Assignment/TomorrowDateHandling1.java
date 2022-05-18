package Section1_And_2_Assignment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TomorrowDateHandling1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		// driver.manage().window().maximize();

		driver.findElement(By.id("datepicker")).click();

		String todaysxpath = "//a[contains(@class,'ui-state-highlight')]";
		//
		// String weeks = "/../../following-sibling::tr";
		// String days = "/../following-sibling::td";
		//
		// List<WebElement> allWeeks = driver.findElements(By.xpath(todaysxpath +
		// weeks));
		// List<WebElement> allDays = driver.findElements(By.xpath(todaysxpath + days));

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, 1);
		Date tomorrowsDate = cal.getTime();

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String modifiedDate = sdf.format(tomorrowsDate);

		driver.findElement(By.id("datepicker")).sendKeys(modifiedDate, Keys.ESCAPE);
	}
}
