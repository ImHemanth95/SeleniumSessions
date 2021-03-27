package SeleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {//constructor to access the driver unit
		this.driver=driver;
	}
	//single element
	public WebElement getElement(By locator) {
		return driver.findElement(locator);//its returning the webelement
	}
	//getting elements
		public  List<WebElement> getElements(By locator) {//to define the generic utilitys
	   	 return driver.findElements(locator);
	   }
	String username = "superuser";
	String password = "General19";
		
	public void doSendkeys(By locator,String value) {
		getElement(locator).sendKeys(value);
}
	public  void doactionsbySendKeys(By locator,String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	public  void doActionClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	public  void doActionsMovetoele(By locator) {
		Actions act  = new Actions(driver);
		act.moveToElement(getElement(locator)).perform();
	}
	public  void doActionsMoveToElementAndClick(By locator) {
		doActionsMovetoele(locator);
		getElement(locator).click();
	}
	//getting the text of the elements from the array list
    public  List<String> getTextEle(By locator) {
   	 List<String> eletextlist = new ArrayList<String>();
   	 //here we are getting the list of webelemtbs that is list
   	 //then we are iterating through out the link and gettting text
   	 //but if we want to get the list of text printed in the form of arraylist then we need to store in the arraylist
   	 //by adding it into the array list of the list that we get from the list
   	 List<WebElement> elelist = getElements(locator);
   	 for(WebElement e:elelist) {
   		 if(!e.getText().isEmpty()) {
   		 eletextlist.add(e.getText());
   		 }
      }
   	 return eletextlist;
}
    //dropdown utils
    
    //it requrires the webelement that is why u need to pass the element,so passing the getelemtt itself
    public  void selectByIndexes(By locator,int index) {
    	Select select = new Select(getElement(locator));
    	select.selectByIndex(index);	
    	}
  //it requrires the webelement that is why u need to pass the element,so passing the getelemtt itself
    	public  void selectByText(By locator,String text) {
    	Select select = new Select(getElement(locator));
    	select.selectByVisibleText(text);
    	}
   //it requrires the webelement that is why u need to pass the element,so passing the getelemtt itself
    	public  void selectByvalue(By locator,String value) {
    	Select select = new Select(getElement(locator));
    	select.selectByValue(value);
    	}
    	//javascript utils
    	public String getTilteByJs() {
    		JavascriptExecutor js = (JavascriptExecutor)driver;
    		return js.executeScript("return document.title;").toString();
    	}
    	//WebDriverwait utils------------------------------------------
    	public  WebElement waitForElementPresent(By locator,int timeout) {
    		WebDriverWait wait = new WebDriverWait(driver,timeout);
    		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    		
    	}
    	public Alert waitForAlertPresent(int timeout) {
    		WebDriverWait wait = new WebDriverWait(driver,10);
    		return wait.until(ExpectedConditions.alertIsPresent());
    	}
    	public String getAlertText(int timeout) {
    		return waitForAlertPresent(timeout).getText();
    	}
    	public void acceptAlert(int timeout) {
    		waitForAlertPresent(timeout);
    	}
    	public void dismissAlert(int timeout) {
    		waitForAlertPresent(timeout).dismiss();
    	}
    	public  String waitForTitleContains(int timeout,String title) {
    		WebDriverWait wait = new WebDriverWait(driver,timeout);
    		wait.until(ExpectedConditions.titleContains(title));
    		//wait.until(ExpectedConditions.titleIs(title));
    		return driver.getTitle();
    	}
    	public  boolean waitForUrl(int timeout,String url) {
    		WebDriverWait wait = new WebDriverWait(driver,timeout);
    		return wait.until(ExpectedConditions.urlContains(url));
    	}
       public  void waitForFrameAndSwitchToIT(String idORName,int timeout) {
	   WebDriverWait wait = new WebDriverWait(driver,timeout);
	   wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idORName));
    }
       public void waitForFrameAndSwitchToITELE(WebElement frameElement ,int timeout) {
   		WebDriverWait wait = new WebDriverWait(driver,timeout);
   		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
   	}
       /*
  	   An expectation for checking that all elements present on the web page that match the locator are visible.
       Visibility means that the elements are not only displayed but also have a height and width that is greater than 0. 
  	 */
  	public  List<WebElement> waitforVisiblityofEle(By locator,int timeout) {
  		WebDriverWait wait = new WebDriverWait(driver,10);
  		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
  	}
  	public List<WebElement> waitforPresenceOfEle(By locator,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}
  	public  WebElement waitforElementTobeClickable(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver,timeout);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	public void clickWhenReady(By locator, int timeout) {
		waitforElementTobeClickable(locator,timeout).click();
	}
    	//this is used to select the drpdown without the select class
    	public  void doselectdropdownwithoutselect(By locator,String value) {
    		List<WebElement> elelist = getElements(locator);
    		 for(WebElement e:elelist) {
    		    	if(e.getText().equals(value)) {
    		    	e.click();
    		    	break;
    		    	}
    		 }
    	}
	}

