import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\Chromedriver.exe");
		//C:\Users\Mahee\Work\drivers\windows\Chromedriver.exe
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.teacherspensions.co.uk/public/login.aspx");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
