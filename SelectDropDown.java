package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By Indsty = By.id("Form_submitForm_Industry");
	    By country = By.id("Form_submitForm_Country");
	    
//	    //create and new oject of the class - select
//	    Select select_indust = new Select(driver.findElement(country));//webelemet u need to pass as the argument
//	    //select.selectByIndex(5);//select by index
//	    //select.selectByVisibleText("Andorra");
//	    select_indust.selectByValue("Afghanistan");
//	    
//	    Select select_country = new Select(driver.findElement(Indsty));
//	    select_country.selectByIndex(2);
	    selectByIndexes(Indsty,5);
	    selectByIndexes(country,5);
	    selectByText(Indsty,"Aerospace");
	    selectByText(country,"India");
	    
	    
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
public static void selectByIndexes(By locator,int index) {
Select select = new Select(getElement(locator));//it requrires the webelement that is why u need to pass the element,so passing the getelemtt itself
select.selectByIndex(index);	
}
public static void selectByText(By locator,String text) {
Select select = new Select(getElement(locator));//it requrires the webelement that is why u need to pass the element,so passing the getelemtt itself
select.selectByVisibleText(text);
}
public static void selectByvalue(By locator,String value) {
Select select = new Select(getElement(locator));//it requrires the webelement that is why u need to pass the element,so passing the getelemtt itself
select.selectByValue(value);

}
}
