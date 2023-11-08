package testCases.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtil {

    /**
     * This Method will Flash the element number of times
     * @author karthick Sha
     * @param element
     * @param driver
     */
    public static void Flash(WebElement element, WebDriver driver,int times){
        String bgColor = element.getCssValue("backgroundColor");
        for (int i = 0;i<times;i++){
       ChangeColor(driver,element,"#000000");
       ChangeColor(driver,element,bgColor);
        }
    }

    /**
     * This Method wilL Change the color the Background Color of the Element
     * @author karthick Sha
     * @param driver
     * @param element
     * @param color
     */
    public static void ChangeColor(WebDriver driver,WebElement element,String color){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor = '" + color + "'",element);

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
        }
    }

    /**
     * This Method will Draw Border around the Element
     * @author karthick Sha
     * @param driver
     * @param element
     */
    public static void drawBorder(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'",element);
    }

    /**
     * To Get the Title of the Page
     * @author Karthick Sha
     * @param driver
     * @return
     */
    public static String getTitle(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String title = js.executeScript("return document.title").toString();
        return title;
    }

    /**
     * To Click on the Element
     * @author Karthick Sha
     * @param driver
     * @param element
     */
    public static void clickJS(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",element);
    }

    /**
     * To Generate Alert with Message
     * @author Karthick Sha
     * @param driver
     * @param message
     */
    public static void generateAlertInfo(WebDriver driver,String message){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('"+message+"')");
    }

    /**
     * To Refresh the Current Page
     * @author Karthick Sha
     * @param driver
     */
    public static void refreshPage(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("history.go(0)");
    }

    /**
     * To Scroll into the Given Element
     * @author Karthick Sha
     * @param driver
     * @param element
     */
    public static void scrollIntoView(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments.[0].scrollIntoView(true);",element);
    }
}
