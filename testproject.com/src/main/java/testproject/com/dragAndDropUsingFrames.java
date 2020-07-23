package testproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropUsingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();

		// using index, for that we need find how many frames are present.
		// System.out.println(driver.findElements(By.tagName("iframe")).size());
		// driver.switchTo().frame(0);

		// using webelement
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();

		// coming out of frames and getting the titles. When it is inside the frame it
		// won't perform any action outside the frame.
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());

	}

}
