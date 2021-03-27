package SeleniumSession;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleLangLinks {
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.co.in/?gws_rd=ssl");
	     List<WebElement> listlang = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
	     System.out.println(listlang.size());
	     for(WebElement e:listlang) {
	    	 String linkText = e.getText();
	    	 System.out.println(linkText);
	    	 if(linkText.equals("ಕನ್ನಡ")) {
	    		 e.click();
    		 break;
	    	 }
	    	 
	     }
	   }

}
