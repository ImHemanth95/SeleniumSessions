package SeleniumSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;

import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowHandles_ListWise_2 {
	static WebDriver driver;
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");//parent page
		driver.manage().window().maximize();
	    //child window
       WebElement ele1= driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
       WebElement ele2 = driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));//2nd child page
       WebElement ele3 = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));//3rd child page
       WebElement ele4 =driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']"));
      
       
       ele1.click();
       Set<String> handle= driver.getWindowHandles();
       List<String> handlelist= new ArrayList<String>(handle);
       String parentWindowID = handlelist.get(0);
       String childWindowID1 = handlelist.get(1);
       driver.switchTo().window(childWindowID1);
       System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   driver.close();
	   
	   //back to parent window
	   driver.switchTo().window(parentWindowID);
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   
	   ele2.click();
       String childWindowID2 = handlelist.get(2);
       driver.switchTo().window(childWindowID2);
       System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   driver.close();
	   
	 //back to parent window
	   driver.switchTo().window(parentWindowID);
	   System.out.println(driver.getCurrentUrl());
	   System.out.println(driver.getTitle());
	   
}
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
//	   ele2.click();
//	   Set<String> handle1= driver.getWindowHandles();
//       List<String> handlelist1= new ArrayList<String>(handle1);
//       String childWindowID2 = handlelist1.get(2);
//       driver.switchTo().window(childWindowID2);
//       System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   driver.close();
//	   
//	   //back to parent window
//	   driver.switchTo().window(parentWindowID);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
	   
	   

       
////       Set<String> handles1 = driver.getWindowHandles();
////	   List<String> handlelist1 = new ArrayList<String>(handles1);
////	   String parentWindowID = handlelist1.get(0);
////	   String childWindowID1 = handlelist1.get(1);
////	   String childWindowID2 = handlelist1.get(2);
////	   String childWindowID3 = handlelist1.get(3);
////	   String childWindowID4 = handlelist1.get(4);
//       
//       //for weblement 1
//	   
//	   ele1.click();
//	   Set<String> handles1 = driver.getWindowHandles();
//	   List<String> handlelist1 = new ArrayList<String>(handles1);
//	   String parentWindowID = handlelist1.get(0);
//	   String childWindowID1 = handlelist1.get(1);
//	   driver.switchTo().window(childWindowID1);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   driver.close();
//	   
//	   //now from child1 to parent window
//	   driver.switchTo().window(parentWindowID);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   
//	   //now we need to traverse to child2 window
//       ele2.click();
//       driver.switchTo().window(childWindowID1);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   driver.close();
//	   
//	    //now from child1 to parent window
//	   driver.switchTo().window(parentWindowID);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   
//	   ele3.click();
//       driver.switchTo().window(childWindowID3);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   driver.close();
//	   
//	 //now from child1 to parent window
//	   driver.switchTo().window(parentWindowID);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   
//	   
//	   ele4.click();
//       driver.switchTo().window(childWindowID4);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   driver.close();
//	   
//	   //now from child1 to parent window
//	   driver.switchTo().window(parentWindowID);
//	   System.out.println(driver.getCurrentUrl());
//	   System.out.println(driver.getTitle());
//	   driver.quit();
//	   
//	 }
//  }
	 