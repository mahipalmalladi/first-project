package testproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/" );
		
		WebElement source = driver.findElement(By.id("fromCity"));
		source.click();
		WebElement source2 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		source2.sendKeys("MUM");
		Thread.sleep(2000);
		source2.sendKeys(Keys.ARROW_DOWN);
		source2.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("toCity")).click();
		WebElement desti = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		
		desti.click();
		desti.sendKeys("HYD");
		Thread.sleep(2000);
		desti.sendKeys(Keys.ARROW_DOWN);
		desti.sendKeys(Keys.ENTER);
		
		
				}

}
