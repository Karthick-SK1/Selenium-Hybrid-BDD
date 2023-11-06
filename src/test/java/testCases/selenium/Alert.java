package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.automationtesting.in/Alerts.html");

        //Alert with OK Button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
        driver.switchTo().alert().accept();
        System.out.println("Accept Alert is Completed");

        //Alert with Confirm Button
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
        driver.switchTo().alert().dismiss();
        String confirmedAlert = driver.findElement(By.id("demo")).getText();
        if (confirmedAlert.equals("You Pressed Cancel")) {
            System.out.println("Confirm Alert is Completed");
        }

        //Alert with Input Box
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
        driver.switchTo().alert().sendKeys("Karthick Shahina");
        driver.switchTo().alert().accept();

        String alertMessage = driver.findElement(By.id("demo1")).getText();
        System.out.println(alertMessage);
    }
}
