package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C://My_Projects//Selenium_IntelliJ//Selenium//Drivers//geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        String text = driver.findElement(By.cssSelector("p")).getText();

        System.out.println(text);
    }
}
