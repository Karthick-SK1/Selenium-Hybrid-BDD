package testCases.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class UploadAndDownload {

    public static void main(String[] args) throws Exception {

        System.setProperty("webdriver.chrome.driver", "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Uplaod Files

        driver.get("https://demo.automationtesting.in/FileUpload.html");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement element = driver.findElement(By.xpath("//*[@id='input-4']"));

        String imageFilePath = "C:\\My_Projects\\Selenium_IntelliJ\\Selenium\\Images\\sampleFile.jpeg";

        element.sendKeys(imageFilePath);

        String filename = driver.findElement(By.xpath("//div[@class='file-footer-caption']")).getAttribute("title");

        if (filename.equals("sampleFile.jpeg")) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        //Download Files

        driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
        driver.findElement(By.id("pdfbox")).sendKeys("Hello My Name is Shahina Dingulu");
        driver.findElement(By.id("createPdf")).click();
        driver.findElement(By.id("pdf-link-to-download")).click();

        String path = "C://Users/wwwka/Downloads/info.pdf";
        File file = new File(path);
        if (file.exists()) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
