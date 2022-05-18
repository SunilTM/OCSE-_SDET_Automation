package Section1_And_2_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDragHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\All Browser Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		// driver.manage().window().maximize();

		WebElement drag1 = driver.findElement(By.xpath("(//div[text()='Stockholm'])[2]"));
		WebElement drop1 = driver.findElement(By.xpath("//div[text()='Sweden']"));

		WebElement drag2 = driver.findElement(By.xpath("(//div[text()='Oslo'] )[2]"));
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Norway']"));

		WebElement drag3 = driver.findElement(By.xpath("(//div[text()='Washington'] )[2]"));
		WebElement drop3 = driver.findElement(By.xpath("//div[text()='United States']"));

		WebElement drag4 = driver.findElement(By.xpath("(//div[text()='Rome'] )[2]"));
		WebElement drop4 = driver.findElement(By.xpath("//div[text()='Italy']"));

		WebElement drag5 = driver.findElement(By.xpath("(//div[text()='Seoul'] )[2]"));
		WebElement drop5 = driver.findElement(By.xpath("//div[text()='South Korea']"));

		WebElement drag6 = driver.findElement(By.xpath("(//div[text()='Madrid'] )[2]"));
		WebElement drop6 = driver.findElement(By.xpath("//div[text()='Spain']"));

		WebElement drag7 = driver.findElement(By.xpath("(//div[text()='Copenhagen'] )[2]"));
		WebElement drop7 = driver.findElement(By.xpath("//div[text()='Denmark']"));

		Actions act = new Actions(driver);
		act.dragAndDrop(drag1, drop1).perform();
		act.dragAndDrop(drag2, drop2).perform();
		act.dragAndDrop(drag3, drop3).perform();
		act.dragAndDrop(drag4, drop4).perform();
		act.dragAndDrop(drag5, drop5).perform();
		act.dragAndDrop(drag6, drop6).perform();
		act.dragAndDrop(drag7, drop7).perform();
	}
}
