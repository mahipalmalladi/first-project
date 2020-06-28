package testproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.id("FromTag"));
		from.sendKeys("hyd");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		
		WebElement desti = driver.findElement(By.id("ToTag"));
		desti.sendKeys("ncl");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();
		
		Select adult= new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("2");
		Select child = new Select(driver.findElement(By.id("Childrens")));		
		child.selectByIndex(2);
		Select infant = new Select(driver.findElement(By.id("Infants")));
		infant.selectByValue("1");
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("BA");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
	}

}
