	package SeleniumSession;
	import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class SelectDeselectJqurey {
		static WebDriver driver;
       public static void main(String[] args) throws InterruptedException {
			     WebDriverManager.chromedriver().setup();
			       driver = new ChromeDriver();
			       driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");//in this url we have only 15 dorpdwon values but we have 45 values
			       driver.manage().window().maximize();
			       driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			       driver.findElement(By.id("justAnInputBox")).click();
			       Thread.sleep(2000);
			      // By jqcs = By.cssSelector(".comboTreeItemTitle");
			       // test case 3 - now to select all the options
			     //  selectjquerydrop(jqcs,"All");
			       //Select(jqcs,"All");
			      // selectmethod(".comboTreeItemTitle", 14 );
			       selectmethodbasedonText(".comboTreeItemTitle", "ALL");
			       
			}
       
       
       public static void selectmethod(String locator, int value) throws InterruptedException {
    	   List<WebElement> listofdropdown = driver.findElements(By.cssSelector(locator));
    	   for(int i=0;i<listofdropdown.size();i++)
    	   {
    		  if(i<=value) {
    			  listofdropdown.get(i).click();
    		  }else {
    			  break;
    		  }
    	   }
    	   for(int j=14; j>=0; j--) {
    		   listofdropdown.get(j).click();
    	   }
    	   
       }
       
       public static void selectmethodbasedonText(String locator, String dropdownText) throws InterruptedException {
    	   List<WebElement> listofdropdown = driver.findElements(By.cssSelector(locator));
    	    for(int i=0;i<listofdropdown.size();i++)
    	   {
    		  if(listofdropdown.get(i).getText().equalsIgnoreCase(dropdownText)) {
    			  listofdropdown.get(i).click();
    		  }
    	   }
    	   for(int j=0;j<listofdropdown.size();j++)
    	   {
    		  if(listofdropdown.get(j).getText().equalsIgnoreCase(dropdownText)) {
    			  listofdropdown.get(j).click();
    		  }
    	   }
    	   
       }
       
       
       
       
       
       
       
       
       
			  //String... value now represent sthat it can take string array values for multiple selection
			  public static void selectjquerydrop(By locator, String... value) {
			  List<WebElement> listdata = driver.findElements(locator);
			    String text = null;
			   
			         for(int i=0;i<listdata.size();i++) {
			         text= listdata.get(i).getText();
			          System.out.println(text);
			         }
			    
			        //to iterate the value's that is prvided or fetched from weblements now
			        for(int j=0;j<value.length;j++) {
			          //why value of [j] means, here the value is string array and hence it should be value[j]//string array
			          if(text.equals(value[j])) {
			            listdata.get(j).click();
			            break;//break the inner loop
			          }
			        }
			      }
			  
			    public static void Select(By locator,String value) {
			    List<WebElement> listdata1 = driver.findElements(locator);
			    selectjquerydrop(locator,value);
			   // Select deselect = Select(locator, value);
			    for(int i=0;i<listdata1.size();i++) {
			      if(value.equalsIgnoreCase("all")){
			        selectjquerydrop(locator,value);
			       // deselect.deselectByValue(value);
			        break;
			      }
			      }
			    //return deselect;
			  }
			}
