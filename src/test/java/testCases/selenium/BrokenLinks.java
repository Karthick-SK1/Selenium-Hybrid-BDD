package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demoqa.com/broken");

        WebElement link = driver.findElement(By.linkText("Click Here for Broken Link"));
        System.out.println(link);

            String url = link.getAttribute("href");
            URL urlLink = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlLink.openConnection();
            Thread.sleep(2000);
            connection.connect();
            int responseCode = connection.getResponseCode();

            if (responseCode>=400){
                System.out.println("The link "+url + " is Broken "+ responseCode );
            }
            else {
                System.out.println("The link "+url + " is Valid "+ responseCode );
            }
        }
    }

