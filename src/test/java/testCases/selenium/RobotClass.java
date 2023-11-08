package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClass {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.edureka.co/");
        driver.manage().window().maximize();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.id("search-input"));
        searchBox.sendKeys("Selenium");
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyPress(KeyEvent.VK_ENTER);
        String text = driver.findElement(By.tagName("h1")).getText();

        if (text.equals("Selenium Certification Training Course")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

    }
}
