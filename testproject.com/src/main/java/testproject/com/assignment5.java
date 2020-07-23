package testproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// 1. Select any check box
		WebElement selectedValue = driver.findElement(By.id("checkBoxOption1"));
		selectedValue.click();

		// 2. grab the label
		String labelName = driver.findElement(By.xpath("//div[@id='checkbox-example']//label[1]")).getText();
		System.out.println(labelName);

		// 3. select option in dropdown. here option selection must come from step 2
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(dropDown);
		s.selectByVisibleText(labelName);

		// 4. Enter text grabbed from step 2 in edit box
		driver.findElement(By.id("name")).sendKeys(labelName);
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());

		// 5. click alert and verify if the text from step 2 is present in the pop up
		// message
		String text = driver.switchTo().alert().getText();
		if (text.contains(labelName)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}

}
