package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://stackoverflow.com/questions/37408657/selenium-find-element-by-visible-text");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[9]/div[1]/div[1]"));
        //Scroll by Element
        js.executeScript("arguments[0].scrollIntoView();",element);
        Thread.sleep(2000);

        //Scroll by Pixel
        js.executeScript("window.scrollBy(0,5000)","");
        Thread.sleep(3000);
        driver.close();
    }
}
