package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C://My_Projects//Selenium_IntelliJ//Selenium//Drivers//geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

        driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();

        String currentMonth = null;
        for (int i = 0; i <= 2; i++) {
            driver.findElement(By.cssSelector("a[title='Next']")).click();
            currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            if (currentMonth.equals("January")) {
                break;
            }
        }
        System.out.println("Successfully Navigated to " + currentMonth);
    }
}
