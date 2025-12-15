package base;

import com.google.common.io.Files;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class baseClass {

    public static WebDriver driver;


    public static void launch(){

        driver=new ChromeDriver();
    }

    public static void url(String url){
        driver.get(url);

    }
    public static void maximize(){

        driver.manage().window().maximize();

    }

    public static void zoomOut(WebDriver driver, double zoomLevel) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='" + zoomLevel + "'");
    }

    public static void click(WebElement clic){

        clic.click();
    }

    public static void sendkeys(WebElement sndkys,String text){
        sndkys.sendKeys(text);

    }
    public void scrollDown(int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
    }
    public void screenShot(String img) throws IOException {

        TakesScreenshot ts=(TakesScreenshot)driver;
        File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
        File imgpath= new File("C:\\Users\\abish\\eclipse-workspace\\DecemberTask\\target\\screenShot\\"+img+".jpg");
        Files.copy(screenshotAs, imgpath);


    }


}
