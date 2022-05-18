package Section_3_Automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\STUDY MATERIAL\\CRM Project\\VTIGER\\Vtiger.properties");

		Properties pobj = new Properties();
		pobj.load(fis);

		String URL = pobj.getProperty("URL");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		String browser = pobj.getProperty("browser");

		System.out.println("URL : " + URL);
		System.out.println("Username : " + username);
		System.out.println("Password :" + password);
		System.out.println("browser : " + browser);

		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(username);
		driver.findElement(By.name("user_password")).sendKeys(password);
		driver.findElement(By.id("SubmitButton")).click();
	}

}
