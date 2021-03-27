package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
//create the object of the javascriptexecutor, as we are type casting the driver to javascr to access the methods present in the JS(Interface)
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//from jsstring to java string by using the .toString() method
//		String title = js.executeScript("return document.title").toString();
//		System.out.println(title);
		JavaScriptUtil js = new JavaScriptUtil(driver);
		String gettitle = js.getTilteByJs();
		System.out.println(gettitle);
		//js.refreshBrowserByJs();
	//	js.generateAlert("This is login page");
		String getpageText = js.getInnerPageText();
		System.out.println(getpageText);
		
		//border
		//WebElement login = driver.findElement(By.xpath("//div[@class='col-sm-12 controls']/button[@id='btn-login']"));
	    //js.getBorderHiglight(login);
		
		//flash
		//WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		//js.flash(login);
		
		//js-click
		//js.clickElementByJS(login);
		
		//js-Scrolldown
//		js.scrollPageDown();
////		
////		//js-scrollup
//		js.scrollPageUp();
//		
		//scrollview -js
		WebElement eleStopscroll = driver.findElement(By.xpath("//h2[text()='Electronics & more Under ₹1,499']"));
		
		js.scrollIntoView(eleStopscroll);
		
		
		
	}
	
}
