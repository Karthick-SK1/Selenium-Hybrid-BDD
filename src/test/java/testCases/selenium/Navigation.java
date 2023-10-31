package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        //Opening First Page
        driver.get("https://www.google.com/");
        //Navigating to Second Page
        driver.navigate().to("https://www.apple.com/in/");
        //Redirecting again to First Page
        driver.navigate().back();
        //Again Navigating to Second Page to make Sure it is in the buffer
        driver.navigate().forward();
        String currentUrl = driver.getCurrentUrl();
        String text = driver.findElement(By.cssSelector("section[class='section section-macbook-pro'] h3[class='headline']")).getText();
        //Closing the Browser
        driver.close();
        //Validations
        if (currentUrl.equals("https://www.apple.com/in/") && text.equals("MacBook Pro") ){
            System.out.println("Test is Passed");
        }
        else {
            System.out.println("Test is Failed");
        }
    }
}
