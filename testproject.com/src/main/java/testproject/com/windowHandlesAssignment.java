package testproject.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandlesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='example']/a")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		driver.switchTo().window(parentid);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());

	}

}
