package pom;

import base.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class busPage extends baseClass {

    public By Price=By.xpath("(//div[@role='button'])[3]");
    public By CheapBus=By.xpath("//button[@class='BusCard_primaryBtn__iiHt1 ']");
    public By Seat=By.xpath("//img[@src='/bus-mmt-next/_next/image?url=%2Fbus-mmt-next%2FSleeper_Available.png&w=64&q=75']");
    public By Pickup=By.xpath("(//div[@class='makeFlex PickUpDropSelection_pickDropItem__YQFG2 '])[1]");
    public By Drop=By.xpath("(//div[@class='PickUpDropSelection_pickDropContainer__VSr2j'])[2]//div[@class='makeFlex PickUpDropSelection_pickDropItem__YQFG2 ']");
    public By Continue=By.xpath("(//button[@class='Button_button__gV4kP Button_primary__AcOJE undefined'])[2]");
    public By AC=By.xpath("(//div[@class='FilterTabs_tabSection__DfwGX '])[1]");
    public By Sleeper=By.xpath("//span[@class='sleeperIcon appendRight5']");
    public By PickUpTime=By.xpath("(//ul[@class='FilterTabs_tabCtr__q44wV FilterTabs_micro__avWY_'])[1]//li");


    public void ACButton(){
        WebElement AcButton = driver.findElement(AC);
        click(AcButton);
    }

    public void SleeperButton(){
        WebElement Sleeperbutton = driver.findElement(Sleeper);
        click(Sleeperbutton);
    }

    public void TimerButton() throws InterruptedException {

        WebElement PickUpTimeButton = driver.findElement(PickUpTime);
        click(PickUpTimeButton);
        Thread.sleep(1000);
        scrollDown(100);


    }


    public void PriceButton() throws InterruptedException {
        WebElement priceRate = driver.findElement(Price);
        Thread.sleep(3000);
        scrollDown(-7000);
        click(priceRate);

    }

    public void CheapBusButton() throws InterruptedException {
        Thread.sleep(2000);
        WebElement cheapBusButton = driver.findElement(CheapBus);
        click(cheapBusButton);
        scrollDown(6000);

    }

    public void SeatSelection() throws InterruptedException {

        Thread.sleep(2000);
        scrollDown(8000);
        WebElement seatSelection = driver.findElement(Seat);
        click(seatSelection);

    }

    public void BoardingPoint(){
        WebElement PickUpPoint = driver.findElement(Pickup);
        click(PickUpPoint);

    }

    public void DropPoint() throws InterruptedException {
        Thread.sleep(500);
        WebElement DroppingPoint = driver.findElement(Drop);
        click(DroppingPoint);
        Thread.sleep(500);
    }

    public void ContinueButton(){
        WebElement ContinueClickButton = driver.findElement(Continue);
        click(ContinueClickButton);
    }




}
