package Section1_And_2_Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandlingActiTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://demo.actitime.com/login.do");

		// driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin", Keys.TAB, "manager", Keys.ENTER);

		driver.findElement(By.cssSelector("div.popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Work")).click();

		driver.findElement(By.className("i")).click();
		driver.findElement(By.id("name")).sendKeys("Office");
		driver.findElement(By.xpath("//td[@class='formbuttonpane']/input[2]")).click();

		// Alert Handling
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
}
