package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {
	
WebDriver driver;
	
	public JavaScriptUtil(WebDriver driver) {//constructor to access the driver unit
		this.driver=driver;
	}
	//javascript utils
	public String getTilteByJs() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("return document.title;").toString();
	}
	public void refreshBrowserByJs() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}
	public void generateAlert(String message) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('"+ message +"')");
	}
	public String getInnerPageText() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	//draw border
	public void getBorderHiglight(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].style.border = '3px solid red'",ele);
	}
	public void flash(WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 15; i++) {
			changeColor("rgb(0,200,0)", element);// 1
			changeColor(bgcolor, element);// 2
		}
	}
	private void changeColor(String color, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}
	public void clickElementByJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public void scrollPageDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public void scrollPageUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
	}
	public void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
