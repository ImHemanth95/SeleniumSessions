package SeleniumSession;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageList {
	static WebDriver driver;

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	     By image = By.tagName("img");
	     //By src = By.tagName("src");
	     
	      List<String> imglist = getEleAttributeList(image,"alt");
	     List<String> srclist =getEleAttributeList(image,"src");
	     System.out.println(imglist.size());
	     System.out.println(srclist.size());
	     
//	     List<WebElement> imagelist = driver.findElements(By.tagName("img"));
//	     System.out.println("total images:"+imagelist.size());
//	     //for images there we dont have text names
//	     for(WebElement e:imagelist) {
//	    	String attrImg=  e.getAttribute("alt");
//	    	String attrImgSrc = e.getAttribute("src");
//	    	System.out.println(attrImg);
//	    	System.out.println(attrImgSrc);
//	     }
	     
		
}
	public static List<WebElement> getElements(By locator) {//to define the generic utilitys
	   	 return driver.findElements(locator);
	   }
		
	public static List<String> getEleAttributeList(By locator, String attrName) {
		List<String> attrlist = new ArrayList<String>();
	    List<WebElement> elelist = getElements(locator);
		for(WebElement e:elelist) {
			attrlist.add(e.getAttribute(attrName));
			System.out.println(attrlist);
		}
		return attrlist;
		
	}

}
