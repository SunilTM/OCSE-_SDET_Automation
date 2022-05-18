package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActiTimeListboxByUsingSelectclass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/open-source/demo/");

		driver.findElement(By.id("Form_submitRequest_FirstName")).sendKeys("Sunil");
		driver.findElement(By.id("Form_submitRequest_LastName")).sendKeys("M", Keys.TAB, "Qspider");
		// Dropdown for Industry
		WebElement List = driver.findElement(By.id("Form_submitRequest_Industry"));
		Select s = new Select(List);
		s.selectByVisibleText("Business Services / Consultancy - Non IT");

		driver.findElement(By.id("Form_submitRequest_JobTitle")).sendKeys("SoftwareEngineer", Keys.TAB,
				"Sunil123@gmail.com", Keys.TAB, "1234567890");
		WebElement List1 = driver.findElement(By.id("Form_submitRequest_No_of_Employees"));
		Select s1 = new Select(List1);
		s1.selectByVisibleText("51 - 75");
		// Dropdown for Country
		driver.findElement(By.id("Form_submitRequest_Country")).click();
		driver.findElement(By.xpath("//option[text()='India']")).click();
		// Dropdown for State
		driver.findElement(By.id("Form_submitRequest_State")).click();
		driver.findElement(By.xpath("//option[text()='Karnataka']")).click();
		// Submit
		driver.findElement(By.id("Form_submitRequest_action_submitRequest")).click();
		// Browser close
		driver.close();
	}

}
