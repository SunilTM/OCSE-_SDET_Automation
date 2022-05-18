package Section1_And_2_Automation;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "D:\\Selinium\\All Browser Driver\\msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.cowin.gov.in/");
	}
}

//EdgeDriver is a specific class to launch microsoft Edge browser