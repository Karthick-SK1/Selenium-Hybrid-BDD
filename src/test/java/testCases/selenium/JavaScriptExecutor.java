package testCases.selenium;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/ul[1]/li[2]/a[1]"));

        //Using Flash
        JavaScriptUtil.Flash(element,driver,50);

        //Drawing Border
        JavaScriptUtil.drawBorder(driver,element);

        //Get the Title of Page
        System.out.println(JavaScriptUtil.getTitle(driver));

        //Clicks the Element
        JavaScriptUtil.clickJS(driver,element);

        //Generate Alert
        String message = "You have Navigated Successfully";
        JavaScriptUtil.generateAlertInfo(driver,message);
        driver.switchTo().alert().accept();

        //Refresh Page
        JavaScriptUtil.refreshPage(driver);

        //Encode Password
        String password = "admin";
        byte[] encodedPassword = Base64.encodeBase64(password.getBytes());
        System.out.println(encodedPassword);
    }
}
