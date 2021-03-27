package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");//in this url we have only 15 dorpdwon values but we have 45 values
	     driver.findElement(By.id("justAnInputBox")).click();
	     Thread.sleep(2000);
	     By jqcs = By.cssSelector(".comboTreeItemTitle");
	     //test case1 - single selection
	     //selectjquerydrop(jqcs,"choice 1");
	     
	     //test case2 - multiple selection
	     //selectjquerydrop(jqcs,"choice 1","choice 2","choice 3");
	     
	     // test case 3 - now to select all the options
	     selectjquerydrop(jqcs,"All");
	     
	     //null if we pass --- we get the null pointer exception
	     selectjquerydrop(jqcs,null);
	     
	     
}
	//String... value now represent sthat it can take string array values for multiple selection
	public static void selectjquerydrop(By locator, String... value) {
	
		List<WebElement> listdata = driver.findElements(locator);
		
		if(!value[0].equalsIgnoreCase("all")) {
         for(int i=0;i<listdata.size();i++) {
	    	String text= listdata.get(i).getText();
	    	System.out.println(text);
	    	//to iterate the value's that is prvided or fetched from weblements now
	    	for(int j=0;j<value.length;j++) {
	    		//why value of [j] means, here the value is string array and hence it should be value[j]//string array
	    		if(text.equals(value[j])) {
	    			listdata.get(i).click();
	    			break;//break the inner loop
	    		}
	    	}
	    	
	   }
	    	 
	}//if(!value[0] condition is true where the value is equal to all or ALL then you need to execute this else statement and then try select all
			
			else {
				try {
				for(WebElement e :listdata) {
					e.click();
				}
			}
				catch(Exception e){
					
				}
			
		} 
}
}

	


