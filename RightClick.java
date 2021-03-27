package SeleniumSession;

import java.util.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement rightele =driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act =  new Actions(driver);
		act.contextClick(rightele).perform();
		By RightClickOption = By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span");
		
		rightclickmethod(RightClickOption,"Edit");
		alertpopInRigtClick();
		act.contextClick(rightele).perform();
		rightclickmethod(RightClickOption,"Cut");
		alertpopInRigtClick();
		act.contextClick(rightele).perform();
		rightclickmethod(RightClickOption,"Copy");
		alertpopInRigtClick();
		act.contextClick(rightele).perform();
		rightclickmethod(RightClickOption,"Paste");
		alertpopInRigtClick();
		act.contextClick(rightele).perform();
		rightclickmethod(RightClickOption,"Delete");
		alertpopInRigtClick();
		act.contextClick(rightele).perform();
		rightclickmethod(RightClickOption,"Quit");
		alertpopInRigtClick();
		driver.quit();

		}
	public static void rightclickmethod(By locator,String value) {
		List<WebElement> options = driver.findElements(locator);
		for(WebElement e:options ) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
		
	}
	public static void alertpopInRigtClick() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
	    System.out.println(text);
	    alert.accept();
	}

}
