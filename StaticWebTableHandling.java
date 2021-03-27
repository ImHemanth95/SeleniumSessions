package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticWebTableHandling {
	
	static WebDriver driver;
//static webtable
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//in the above xpath tr[] is getting changed every time
		
		
		///pending assignments
		String beforxpath  = "//*[@id=\"customers\"]/tbody/tr[";
		String afterxpath = "]/td[1]";
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colcount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		for(int i =2;i<=rowcount;i++) {
			String xpath = beforxpath + i + afterxpath;
			//System.out.println(xpath);
			String text = driver.findElement(By.xpath(xpath)).getText();
			System.out.println(text);
		}
		
	

	}

}
