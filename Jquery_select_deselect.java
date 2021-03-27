//package SeleniumSession;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Jquery_select_deselect {
//	static WebDriver driver;
//	
//
//	public static void main(String[] args) throws InterruptedException {
//		 WebDriverManager.chromedriver().setup();
//	     driver = new ChromeDriver();
//	     driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");//in this url we have only 15 dorpdwon values but we have 45 values
//	     driver.manage().window().maximize();
//	     driver.findElement(By.id("justAnInputBox")).click();
//	     Thread.sleep(2000);
//	     By jqcs = By.cssSelector(".comboTreeItemTitle");
//	     selectDrop(jqcs,"choice 1");
//	     
//	     
//	}
//	public static  List<WebElement> getElements(By locator) {//to define the generic utilitys
//	   	 return driver.findElements(locator);
//	   }
//	public static Select selectDrop(By locator,String value) {
//		List<WebElement> listdata1 = driver.findElements(locator);
//		for(WebElement e:listdata1) {
//			e.click();
//		}
//		for(int i=0;i<listdata1.size();) {
//		Select deselect = selectDrop(locator, value);
//		deselect.deselectByValue(value);
//				break;
//			}
//		return deselect;
//	
//	}
//}
//
//
//
//
//
//		
