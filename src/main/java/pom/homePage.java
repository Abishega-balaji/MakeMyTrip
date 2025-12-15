package pom;

import base.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homePage extends baseClass {

    public By busIcon = By.xpath("(//span[@class='headerIconWrapper'])[6]");
    public By from = By.xpath("//label[@for='fromCity']");
    public By cityOne = By.xpath("//input[@title='From']");
    public By FromPlace = By.xpath("(//li[@role='option'])[1]");
    public By To = By.xpath("//label[@for='toCity']");
    public By cityTwo = By.xpath("//input[@title='To']");
    public By ToPlace = By.xpath("(//li[@role='option'])[1]");
    public By TDate = By.xpath("//input[@id='travelDate']");
    public By Date = By.xpath("(//div[@class='DayPicker-Day'])[17]");
    public By Search=By.xpath("//button[@type='button']");


    public void buses() throws InterruptedException {

        Thread.sleep(6000);
        WebElement AIalert = driver.findElement(By.xpath("(//div[@class='tp-dt-header-icon'])[2]"));
        WebElement loginAlertClose = driver.findElement(By.xpath("//span[@class='commonModal__close']"));
        click(AIalert);
        Thread.sleep(2000);

        click(loginAlertClose);
        Thread.sleep(2000);

        WebElement BusButton = driver.findElement(busIcon);
        click(BusButton);
        Thread.sleep(2000);

    }

    public void FromLocation(String fromLocation) throws InterruptedException {
        WebElement FromCity = driver.findElement(from);
        click(FromCity);
        Thread.sleep(2000);
        WebElement StartCity = driver.findElement(cityOne);
        sendkeys(StartCity,fromLocation);
        Thread.sleep(500);
        WebElement StartLocation = driver.findElement(FromPlace);
        click(StartLocation);
    }
    public void ToLocation(String toLocation) throws InterruptedException {
//    WebElement ToCity = driver.findElement(To);
//    click(ToCity);
        Thread.sleep(2000);
        WebElement EndCity = driver.findElement(cityTwo);
        click(EndCity);
        sendkeys(EndCity,toLocation);
        Thread.sleep(500);
        WebElement EndLocation = driver.findElement(ToPlace);
        click(EndLocation);
    }

    public void TravelDate() throws InterruptedException {
//    WebElement TravelDay = driver.findElement(TDate);
//    click(TravelDay);
        Thread.sleep(3000);
        WebElement travelDate = driver.findElement(Date);
        click(travelDate);
    }

    public void SearchButton(){

        WebElement searchButton = driver.findElement(Search);
        click(searchButton);

    }





}

