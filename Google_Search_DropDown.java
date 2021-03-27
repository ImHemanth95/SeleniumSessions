package SeleniumSession;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Search_DropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("tester");
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='sbl1']//span"));
		for(WebElement e:ele){
			String text = e.getText();
			System.out.println(text);
			if(text.equals("tester jobs")) {
				e.click();
			}
		}
		

	}

}
