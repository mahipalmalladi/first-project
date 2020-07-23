package testproject.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		//boolean month = driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class='datepicker-switch']"))
				//.getText().contains("August");
		
		while (!driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class='datepicker-switch']"))
				.getText().contains("August")) {			
			driver.findElement(By.cssSelector("[class = 'datepicker-days'] [class='next']")).click();
		}

		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		System.out.println(count);
		//WebElement subdriver = driver.findElement(By.className("day"));
		for (int i = 1; i < count; i++) {
			String text = dates.get(i).getText();
			if (text.equalsIgnoreCase("15")) {
				dates.get(i).click();
				break;
			}

		}
	}

}
