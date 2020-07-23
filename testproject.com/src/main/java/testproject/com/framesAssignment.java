package testproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Nested Frames")).click();
		// System.out.println(driver.findElements(By.tagName("frame")).size());

		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");

		System.out.println(driver.findElement(By.id("content")).getText());

	}

}
