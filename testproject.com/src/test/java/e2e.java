import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); 
		  Thread.sleep(2000L);
		  
		  driver.findElement(By.xpath("//a[@value='DEL']")).click();
		  Thread.sleep(2000L); driver.findElement(By.
		  xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		  
		  driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		  
		  if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
				
			{

				System.out.println("it is disabled");
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		  
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
		  
		  Select s4= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		  s4.selectByIndex(3);
		  
		  driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		  
		  driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		  
		  

	}

}
