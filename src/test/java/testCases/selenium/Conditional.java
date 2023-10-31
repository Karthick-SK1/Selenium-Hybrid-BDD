package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conditional {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.gecko.driver", "C://My_Projects//Selenium_IntelliJ//Selenium//Drivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.apple.com/in/");

        Thread.sleep(2000);

        WebElement trueEventIsEnabled = driver.findElement(By.xpath("//a[normalize-space()='Watch the event']"));
        WebElement trueEventIsVisible = driver.findElement(By.xpath("//a[normalize-space()='Watch the event']"));

        if (trueEventIsVisible.isDisplayed() && trueEventIsEnabled.isEnabled()){
            System.out.println("Test is Passed");
        }
        else {
            System.out.println("Test is Failed");
        }

        driver.navigate().to("http://test.rubywatir.com/radios.php");
        driver.findElement(By.name("likeit")).click();
        WebElement radioWithName = driver.findElement(By.name("likeit"));

        if (radioWithName.isSelected()){
            System.out.println("Radio Button is Selected");
        }

        driver.close();
    }
}
