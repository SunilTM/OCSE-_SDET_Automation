package Section1_And_2_Automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium\\All Browser Driver\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cowin.gov.in/");
	}
}

//FirefoxDriver is a specific class to launch Firefox browser