package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_1 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		
		WebElement content = driver.findElement(By.className("menulink"));
	     driver.findElements(By.xpath("//ul[@class='submenu']/li/a"));
	     
	     moveToElementByActions(content);
	     clickOnElementByActions(By.xpath("//ul[@class='submenu']/li/a"),"COURSES");
	     
	}

	
	public static void moveToElementByActions(WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	public static void clickOnElementByActions(By list,String text) {
		//moveToElementByActions(WebElement element);
		List<WebElement> contextList = driver.findElements(list);
		Actions act = new Actions(driver);
		for(WebElement e:contextList) {
			String textResults = e.getText();
			System.out.println(textResults);
			if(textResults.equalsIgnoreCase(text))
			{
				act.click(e).perform();
			}
		}
	}
	}
		
		
	