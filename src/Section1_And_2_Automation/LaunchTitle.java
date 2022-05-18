package Section1_And_2_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTitle 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.matrimony.com/");
		
		// Capture Title of current web page
		
		String title = driver.getTitle();
		
		System.out.println("Title is :" + title);
	}
}
