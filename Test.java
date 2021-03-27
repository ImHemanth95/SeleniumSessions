package SeleniumSession;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Test{

			static WebDriver driver;
			public static void main(String[] args) throws InterruptedException {
				Test myStore = new Test();
					myStore.inti_driver("chrome");
					myStore.launchUrl("http://automationpractice.com/index.php");
					driver.manage().window().maximize();
					
					By searchField = By.xpath("//input[@id ='search_query_top']");
					By dressList   = By.xpath("//div[@class= 'ac_results']//ul//li");
					
					myStore.getElement(searchField).sendKeys("Dress");
					Thread.sleep(2000);
					
					List<WebElement>diffDress = myStore.getElements(dressList);
					   for (int i=0; i<diffDress.size();i++) {
						  String text = diffDress.get(i).getText();
						  System.out.println(text);
						  
						  if (text.contains("Summer Dresses > Printed Chiffon ")) {
							  diffDress.get(i).click();
							  break;
						  } 
					   }
					  String currentUrl= myStore.getCurrentUrl();
					  System.out.println(currentUrl);
				
				}

				public WebDriver inti_driver(String browserName) {
					switch (browserName) {
					case "chrome":
						WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						break;
						
					case "edge":
						WebDriverManager.edgedriver().setup();
						driver = new EdgeDriver();
						break;

					default:
						System.out.println("Please pass correct browsername");
						break;
					}
					return driver;
				}
				
				public void launchUrl(String url) {
					driver.get(url);
				}
				
				public WebElement getElement(By locator) {
					return driver.findElement(locator);
				}
				
				public List<WebElement> getElements(By locator) {
					return driver.findElements(locator);
				}
				public String getCurrentUrl() {
					return driver.getCurrentUrl();
				}
				
				
				
				
			
			}
			
			

