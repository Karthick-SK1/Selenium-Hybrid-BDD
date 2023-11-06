package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class WindowsHandeling {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C://My_Projects//Selenium_IntelliJ//Selenium//Drivers//geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

        driver.findElement(By.id("newTabBtn")).click();

        String title = driver.getTitle();

        System.out.println(title);

        Set<String> windows = driver.getWindowHandles();

        for (String i : windows) {
            String pageTitle = driver.switchTo().window(i).getTitle();
            if (pageTitle.equals("Window Handles Practice - H Y R Tutorials")) {
                driver.close();
            }
        }
    }
}
