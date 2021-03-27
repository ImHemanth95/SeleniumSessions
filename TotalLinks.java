package SeleniumSession;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
     driver.get("https://www.amazon.in/");
     By link =By.tagName("a");
     //list of weblements
     List<WebElement> Linkslist = getElements(link);
     //list is used becuause every time the list wil be dynamic in nature so we will use the list
     System.out.println("Total lenght="+Linkslist.size());
     List<String> LinksTextList = getTextEle(link);
     for(String e:LinksTextList) {
    	 System.out.println(e);
     }
     
//     for(int i =0;i<Linkslist.size();i++) {
//    	String linktext = Linkslist.get(i).getText();
//    	if(!linktext.isEmpty()) {//use the ! not equal to isempty method to avoid the blank values
//    		System.out.println(i+"-->"+linktext);
//    	}
//    	for(WebElement e:Linkslist) {
//    		String hrefval = e.getAttribute("href");
//    		System.out.println(hrefval);
//    	}
     }

     public static List<WebElement> getElements(By locator) {//to define the generic utilitys
    	 return driver.findElements(locator);
    }
     public static List<String> getTextEle(By locator) {
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
}


