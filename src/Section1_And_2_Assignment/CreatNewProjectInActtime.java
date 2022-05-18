package Section1_And_2_Assignment;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatNewProjectInActtime {

	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {

		Random r = new Random();
		int num = r.nextInt(1000);
		String ProjectName = "URI";
		ProjectName = ProjectName + num;

		CreatNewProjectInActtime pn = new CreatNewProjectInActtime();
		pn.launchBrowser();

		// login to application
		pn.loginToApp();

		// wait for homepage
		Thread.sleep(3000);

		String actPN = pn.CreateNewProject(ProjectName);
		System.out.println(actPN.equals(ProjectName) ? "Project create Successfully" : "Project creation failed");

		// close Browser
		pn.closeBrowser();
	}

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
	}

	public void loginToApp() {
		// Login Webpage Application
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.className("pwdfield")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}

	public String CreateNewProject(String newProject) throws InterruptedException {

		// Click on Task link
		driver.findElement(By.id("container_tasks")).click();

		// Wait for app
		Thread.sleep(2000);

		// Navigate to create new project
		driver.findElement(By.cssSelector("div.title.ellipsis")).click();
		driver.findElement(By.className("createNewProject")).click();

		// wait for new project pop-up page
		Thread.sleep(2000);

		// Enter project details
		driver.findElement(By.className("projectNameField")).sendKeys(newProject);
		driver.findElement(By.className("emptySelection")).click();
		driver.findElement(By.xpath("//div[@class='searchItemList']/div[2]")).click();
		driver.findElement(By.cssSelector("[placeholder='Add Project Description']")).sendKeys("non-strike");
		driver.findElement(By.xpath("//div[text()='Create Project']")).click();

		// Wait for creating project
		Thread.sleep(3000);

		// Validate Project
		String actPN = driver.findElement(By.cssSelector("div.titleEditButtonContainer>div.title")).getText();

		return actPN;
	}

	public void closeBrowser() {
		driver.close();
	}
}