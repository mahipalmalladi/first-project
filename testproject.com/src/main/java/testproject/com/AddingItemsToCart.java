package testproject.com;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingItemsToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Explicit wait declaration
		WebDriverWait w = new WebDriverWait(driver,5);
		
		
		int j = 0;
		String[] itemsNeeded = { "Brocolli", "Cucumber", "Beetroot", "Carrot", "Brinjal" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(3000);

		addItems(driver,itemsNeeded);
		AddingItemsToCart cart = new AddingItemsToCart();
		cart.addItems(driver, itemsNeeded);
	
	driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	//Explicit wait
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));
	
	driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
	driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
	//Explicit wait
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
	System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		int j = 0;

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			// Broccoli -1kg (we need to remove the spaces to identify the item)

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();

			// Convert Array into Array list
			// check whether you extracted information is presented in the array list or not
			List<String> itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {
					break;
				}
			}

		}

	}
}
