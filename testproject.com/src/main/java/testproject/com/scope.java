package testproject.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// Req 1: Count all the links in the page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Req 2: count all the links in the footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// Req 3: Count all the links in first column in the footer
		WebElement columndriver1 = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver1.findElements(By.tagName("a")).size());
		int columndriver1size = columndriver1.findElements(By.tagName("a")).size();

		// Req 4: Find all the link in first column and click on each link.
		for (int i = 1; i < columndriver1size; i++) {
			String clickonElement = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver1.findElements(By.tagName("a")).get(i).sendKeys(clickonElement);
		}
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
