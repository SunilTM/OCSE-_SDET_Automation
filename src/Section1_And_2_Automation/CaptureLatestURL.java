package Section1_And_2_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureLatestURL 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.cowin.gov.in");
		
		String latestUrl = driver.getCurrentUrl();
	}
}
