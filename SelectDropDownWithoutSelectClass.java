package SeleniumSession;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDownWithoutSelectClass {
	static WebDriver driver;
	
	public static void main(String[] args) {
		//select the value from the dropdown with using the select class
		//1st inspect the element by xpath or css selector
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//By Indsty = By.id("Form_submitForm_Industry");
	    //By country = By.id("Form_submitForm_Country");
	    By Indusoptions = By.cssSelector("select#Form_submitForm_Industry option");
	    
	    doselectdropdownwithoutselect(Indusoptions,"Travel");
	}
	public  List<WebElement> getElements(By locator) {//to define the generic utilitys
	   	 return driver.findElements(locator);
	}
	    
	    //List<WebElement> listinds = driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));//xpath
	   // List<WebElement> listind2 = driver.findElements(By.cssSelector("select#Form_submitForm_Industry option"));//css-selector
	    
	   
	public static void doselectdropdownwithoutselect(By locator,String value) {
		List<WebElement> elelist = driver.findElements(locator);
		
		 for(WebElement e:elelist) {
		    	if(e.getText().equals(value)) {
		    	e.click();
		    	break;
		    	}
		 }
	}
	
	}

	


	    
		
	


