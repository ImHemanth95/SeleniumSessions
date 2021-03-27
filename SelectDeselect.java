//package SeleniumSession;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.Test;
//public class SelectDeselect {
// protected static WebDriver driver;
// protected static WebDriverWait wait;
// public static void clickElement(String xpath) {
//  try {
//   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
//   wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
//   driver.findElement(By.xpath(xpath)).click();
//  } catch(Exception e) {
//   System.out.println("Error while clicking "+xpath);
//  }
// }
// public static void fncSelectAndDeselectDD(String locator, String... value) {
//  List<WebElement> listOfDD = driver.findElements(By.xpath(locator));
//  if (!value[0].equalsIgnoreCase("all")) {
//   for (int i = 0; i < listOfDD.size(); i++) {
//    String ddText = listOfDD.get(i).getText();
//    for (int j = 0; j < value.length; j++) {
//     if (ddText.equals(value[j])) {
//      listOfDD.get(i).click();
//      break;
//     }
//    }
//   }
//  } else {
//   for (WebElement element : listOfDD) {
//    element.click();
//   }
//  }
// }
// 