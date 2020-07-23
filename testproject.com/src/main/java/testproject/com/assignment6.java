package testproject.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
		//System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
		
		List<WebElement> secondRow = driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());

	}

}
