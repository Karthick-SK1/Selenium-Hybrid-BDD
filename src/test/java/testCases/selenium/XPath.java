package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath {

    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy")).click();

        Thread.sleep(2000);

        //Getting the element by Relative Xpath
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Ben");

        //Getting the element by Absolute Xpath
        driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Stokes");

        //Getting the element by Relative Xpath using Operator
        driver.findElement(By.xpath("//input[@name='reg_email__'or @id='u_1x_g_pz']")).sendKeys("BenStokes@gmail.com");


        driver.findElement(By.xpath("//*[contains(@name,'reg_passwd__')]")).click();

        //Getting the element for Dynamic Xpath
        driver.findElement(By.xpath("//*[contains(@name,'reg_passwd__')]")).sendKeys("Ben123");

    }
}
