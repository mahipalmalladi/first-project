//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropdowns {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
			
		{

			System.out.println("it is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		  //Radio button
		  //driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  //Dynamic dropdown
		  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		  Thread.sleep(2000L);
		  
		  driver.findElement(By.xpath("//a[@value='MAA']")).click();
		  Thread.sleep(2000L); driver.findElement(By.
		  xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		  
		  //Date selection 
		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		  
		  // Main Dropdown 
		  driver.findElement(By.id("divpaxinfo")).click(); 
		  // Selenium waits 
		  Thread.sleep(2000L); 
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  
		  // Child Dropdowns 
		  Select s1= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		  s1.selectByValue("5"); Select s2= new
		  Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		  s2.selectByValue("2"); Select s3= new
		  Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		  s3.selectByValue("1");
		  
		  
		  //Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		  //s.selectByValue("INR"); 
		  Select s4= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		  s4.selectByIndex(3);
		  
		  //Select check Box and count check boxes.
		  Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		  //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		  //this will returns False because check box is not selected yet.
		  
		  driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		  //System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); 
		  //this should be printed True that mean check box is selected.
		  Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		  System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		  // this will print total number of check boxes.
		  
		  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		  System.out.println(driver.getTitle()); //driver.quit();
		  
		 

	}

}
