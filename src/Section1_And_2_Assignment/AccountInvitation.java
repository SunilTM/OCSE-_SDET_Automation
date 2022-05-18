package Section1_And_2_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountInvitation {
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		AccountInvitation ai = new AccountInvitation();

		ai.launchBrowser();
		ai.getAccountInvetation();
		System.out.println("Account created and invitation sent Successfully");
		ai.closeBrowser();

	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		// driver.manage().window().maximize();

	}

	public void getAccountInvetation() throws InterruptedException {

		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("container_users")).click();
		driver.findElement(By.className("components_button_label")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createUserPanel_firstNameField")).sendKeys("Raja");
		driver.findElement(By.id("createUserPanel_middleNameField")).sendKeys("A");
		driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("C");
		driver.findElement(By.id("createUserPanel_emailField")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		Thread.sleep(2000);

		String s1 = driver.findElement(By.className("invitationInfoHeader")).getText();
		System.out.println(s1);
		String s2 = driver.findElement(By.className("invitationInfo")).getText();
		System.out.println(s2);
	}

	public void closeBrowser() {
		driver.close();
	}

}
