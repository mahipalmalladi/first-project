package testproject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexcercises {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahee\\Work\\drivers\\windows\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22773/nz-vs-ind-1st-t20i-india-tour-of-new-zealand-2020");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")).size();
	int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
	for(int i=0; i<count-2; i++)	
		
	{
		String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int Integervalue = Integer.parseInt(value);//this is to change String into Integer value.
		sum=sum+Integervalue;
		
		
}
	String Extras = driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int Integerextras = Integer.parseInt(Extras); //this is to change String into Integer value.
	
	int TotalSum = sum+Integerextras;
	
	System.out.println(TotalSum);
	
	System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());

	}

}
