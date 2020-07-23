package testproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropdownUsingJavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		WebElement fromcity = driver.findElement(By.id("fromPlaceName"));
		fromcity.sendKeys("MAN");
		fromcity.sendKeys(Keys.ARROW_DOWN);
		// fromcity.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		System.out.println(fromcity.getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);
		int i = 0;
		while (!text.equalsIgnoreCase("MANGALURU")) {
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			
			if (i > 10) {

				break;

			}
		}
			if (i > 10) {
				System.out.println("Element not found");
			} else {
				System.out.println("Element found");
			}

		}

	}


