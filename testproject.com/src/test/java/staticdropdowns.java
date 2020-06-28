import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
//C:\Users\Mahee\Work\drivers\windows\Chromedriver.exe
WebDriver driver = new ChromeDriver();
driver.get("https://www.southalltravel.co.uk/");
Select s= new Select(driver.findElement(By.id("AdultCnt")));
//s.selectByValue("4");
//s.selectByIndex(3);
s.selectByVisibleText("2");
Select s1= new Select(driver.findElement(By.id("Childcnt")));
//s.selectByValue("4");
s1.selectByIndex(3);
//s.selectByVisibleText("2");
Select s2= new Select(driver.findElement(By.id("InfantCnt")));
//s2.selectByValue("2");
s2.selectByIndex(7);
//s.selectByVisibleText("2");



//driver.wait();
//driver.close();



	}

}
