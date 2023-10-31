package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginPage {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C://My_Projects//Selenium_IntelliJ//Selenium//Drivers//geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        //Test Steps
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
        //Entering email id
        driver.findElement(By.name("Email")).sendKeys("test@gmail.com");
        //Entering Password
        driver.findElement(By.name("Password")).sendKeys("Allahh@007");
        //Clicking Login Button
        driver.findElement(By.cssSelector("button[type='submit'].button-1.login-button")).click();
        Thread.sleep(2000);
        //getting the title of the page and asserting it
        String title = driver.getTitle();
        System.out.println("Title of the Page is " + title);
        //Closing the browser
        driver.close();
    }
}
