package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassicCRMPRO_Assignment {
	   static WebDriver driver;
public static void main(String[] args) {
		// Assignment date - 18-03-2021

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.manage().window().maximize();
		driver.getTitle();
		List<WebElement> listlanguages = driver.findElements(By.xpath("//ul[@class='list-unstyled']/li"));
	     System.out.println("Your language list size is="+listlanguages.size());
	     System.out.println("This is your list of language available in this url="+driver.getCurrentUrl());
	     for(WebElement e:listlanguages) {
	    	 String linkText = e.getText();
	    	 System.out.println(linkText);
	    	 }
         }

	}

