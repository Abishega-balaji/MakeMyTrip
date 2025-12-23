package pom;

import base.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class passengerClass extends baseClass {

    public By Name=By.id("fname");
    public By Age=By.id("age");
    public By Gender=By.xpath("//div[@class='maleTab ']");
    public By Email=By.id("contactEmail");
    public By Mobile=By.id("mobileNumber");
    public By State=By.xpath("(//li[@class='dropdownListWpr__liItem '])");
    public By Confirmation=By.xpath("//span[@class='checkboxWpr']");
    public By PaymentContinue=By.xpath("//div[@class='paymentBtn whiteText latoBold font16 capText']//span");
    public By option=By.xpath("(//span[@class='sc-btzYZH fJUzix'])[2]");




    public void passengerName(String pName) throws InterruptedException {
    scrollDown(700);
    WebElement PassengerName = driver.findElement(Name);
    sendkeys(PassengerName,pName);
    Thread.sleep(500);
}
public void passengerAge(String pAge) throws InterruptedException {
    WebElement PassengerAge = driver.findElement(Age);
    sendkeys(PassengerAge,pAge);
    Thread.sleep(500);

}

public void passengerGender(){
    WebElement PassengerGender = driver.findElement(Gender);
    click(PassengerGender);
}

public void passengerMail(String pMail){

    WebElement ContactEmail = driver.findElement(Email);
    sendkeys(ContactEmail,pMail);
}

public void passengerMobile(String pMobile){
    WebElement ContactMobile = driver.findElement(Mobile);
    sendkeys(ContactMobile,pMobile);
}

public void passengerStateCheckbox(){
    scrollDown(1500);
//<------May be used if "State" is for other states"---------->
//    WebElement StateSelection = driver.findElement(State);
//    click(StateSelection);

    WebElement ConfirmationCheck = driver.findElement(Confirmation);
    click(ConfirmationCheck);

    scrollDown(500);

    WebElement options = driver.findElement(option);
    click(options);

    WebElement PaymentContinueButton = driver.findElement(PaymentContinue);
    click(PaymentContinueButton);

}



}
