package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C://My_Projects//Selenium_IntelliJ//Selenium//Drivers//geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://qavbox.github.io/demo/webtable/");

        //To Get the Table Size
        int tableSize = driver.findElements(By.xpath("//table[@id='table02']")).size();

        //To Get the Table Text
        String tableData = driver.findElement(By.xpath("//table[@id='table02']")).getText();

        System.out.println(tableSize);
        System.out.println(tableData);
    }
}
