package SeleniumSession;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DropDownAllOptionsHandle {
	static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Indsty = By.id("Form_submitForm_Industry");
	    By country = By.id("Form_submitForm_Country");
	    
//	    Select selec_ind =  new Select(driver.findElement(Indsty));
//	    List<WebElement> listIndu = selec_ind.getOptions();
//	    for(WebElement e:listIndu) {
//	    	String text = e.getText();
//	    	System.out.println(text);
//	    	if(text.equals("Education")) {
//	    		e.click();
//	    		break;
//	    	}
	    doselectdropdownvalue(country,"India");
	    doselectdropdownvalue(Indsty,"Aerospace");
	    
	    }

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doselectdropdownvalue(By locator, String value) {
		Select selec_ind =  new Select(getElement(locator));
	    List<WebElement> optionslist = selec_ind.getOptions();
	    for(WebElement e:optionslist) {
	    	String text = e.getText();
	    	System.out.println(text);
	    	if(text.equals(value)) {
	    		e.click();
	    		break;
	    	}
	    	}
	}
	}


