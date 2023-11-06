package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class DropDown {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        WebElement dropDown = driver.findElement(By.id("course"));

        Select select = new Select(dropDown);

        List<WebElement> dropDownList = select.getOptions();

        List lists = new ArrayList<>();

        for (WebElement e : dropDownList){
            lists.add(e.getText());
        }
        Collections.sort(lists);
        System.out.println("Drop Down Options are "+lists);

    }
}