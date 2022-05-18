package Section1_And_2_Automation;

import org.openqa.selenium.opera.OperaDriver;

public class LaunchOpera {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver", "D:\\Selinium\\All Browser Driver\\operadriver.exe");
		
		OperaDriver driver = new OperaDriver();
		
		driver.get("https://www.cowin.gov.in/");
	}

}

//OperaDriver is a specific class to launch Opera browser