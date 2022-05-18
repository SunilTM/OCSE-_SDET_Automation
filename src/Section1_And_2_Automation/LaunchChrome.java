package Section1_And_2_Automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome
{
	public static void main(String[] args) 
	{
		//step 1 :- Configure Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		
		// step 2 :- Launch Chrome Browser
		ChromeDriver driver = new ChromeDriver();
		
		// step 3 :- Open Application
		driver.get("https://www.cowin.gov.in/");
	}
}

//ChromeDriver is a specific class to launch chrome browser