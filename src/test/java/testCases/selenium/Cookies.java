package testCases.selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Cookies {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies.size());//size of the Cookies
        for(Cookie cookie:cookies){
            System.out.println(cookie.getName() + " "+ cookie.getValue());
            System.out.println("Cookies before Deleting"+cookies.size()+"Cookie : "+cookie.getName()+cookie.getValue());
        }
        //Deleting Cookies
        driver.manage().deleteAllCookies();
        Set<Cookie> cookiesAfterDelete = driver.manage().getCookies();
        System.out.println("Cookies size after Deleting "+cookiesAfterDelete.size());

        //Add a Cookie
        Cookie newCookie = new Cookie("MyCookie123","123456789");
        driver.manage().addCookie(newCookie);
        Set<Cookie> newCookies = driver.manage().getCookies();
        for (Cookie singleCookie : newCookies) {
            System.out.println(singleCookie.getName() + ": "+singleCookie.getValue());
        }
        driver.quit();
    }
}
