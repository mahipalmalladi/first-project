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
				"https://accounts.google.com/signin/v2/identifier?service=accountsettings&hl=en-GB&continue=https%3A%2F%2Fmyaccount.google.com%2Fintro%3Futm_source%3DOGB%26tab%3Dwk%26utm_medium%3Dapp&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div/footer/ul/li[1]/a")).click();
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window("childid");
		System.out.println(driver.getTitle());

	}

}
