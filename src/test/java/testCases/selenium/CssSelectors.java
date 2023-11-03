package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectors {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver","C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        //Getting the element by Tag and ID
        driver.findElement(By.cssSelector("input#email")).sendKeys("www.karthickthe619@gmail.com");

        //Getting the element by Tag and Class
        driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi")).sendKeys("Msdhoni@07");

        driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();

        Thread.sleep(2000);

//        //Getting the element by Tag and Attribute
        driver.findElement(By.cssSelector("input[value='2']")).click();

        //Getting the element by Tag with Class and Attribute
        driver.findElement(By.cssSelector("input._8esa[name='sex']")).click();
    }

}
