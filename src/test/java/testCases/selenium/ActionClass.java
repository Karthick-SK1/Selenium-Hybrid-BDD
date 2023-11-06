package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\geckodriver.exe");

        //Headless Execution
//        FirefoxOptions options = new FirefoxOptions();
//        options.setHeadless(true);

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.flipkart.com/");

        driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();

        Actions action = new Actions(driver);

       WebElement account =  driver.findElement(By.xpath("//a[@title='Sign in']"));

       WebElement profile = driver.findElement(By.xpath("//a[@title='My Profile']"));

        action.moveToElement(account).build().perform();

        action.click(profile).build().perform();

        String title = driver.getTitle();

        System.out.println("Title of the Page is "+ title);

        //Right Click (Context Click)
        driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement clickableElement = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        action.contextClick(clickableElement).build().perform();
        WebElement deleteButton =  driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[5]"));
        action.moveToElement(deleteButton).build().perform();
        action.click(deleteButton).build().perform();
        String text = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        if (text.equals("clicked: delete")){
            System.out.println("Test Passed");
        }

        //Drag and Drop
        driver.navigate().to("https://demoqa.com/droppable");
        WebElement dragBox = driver.findElement(By.id("draggable"));
        WebElement dropBox = driver.findElement(By.id("droppable"));
        action.clickAndHold(dragBox).moveToElement(dropBox).release().build().perform();
        String dropStatus = driver.findElement(By.cssSelector("p")).getText();

        System.out.println("Successfully "+ dropStatus);

        //Slider
        driver.navigate().to("https://demoqa.com/slider");
        WebElement slider = driver.findElement(By.xpath("//input[@class='range-slider range-slider--primary']"));
        WebElement target = driver.findElement(By.xpath("//input[@value='25']"));
        action.moveToElement(target).dragAndDropBy(slider,300,0).build().perform();
        System.out.println("Slider slided");

        //Resize
        driver.navigate().to("https://demoqa.com/resizable");
        WebElement resizableElement = driver.findElement(By.cssSelector("div#resizable"));
        action.dragAndDropBy(resizableElement,300,0).build().perform();
    }
}
