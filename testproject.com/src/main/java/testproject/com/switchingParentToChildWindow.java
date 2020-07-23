package testproject.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class switchingParentToChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(
				"https://support.google.com/accounts/answer/2917834?visit_id=637289772388345810-3277509337&p=signin_privatebrowsing&hl=en-GB&rd=1");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[2]/header/div[4]/div[1]/div/div/div[2]/span/a/span")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[@class='WpHeLc']")).click();
		System.out.println(driver.getTitle());

	}

}
