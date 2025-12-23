package stepDefinition;

import base.baseClass;
import io.cucumber.java.en.*;
import pom.busPage;
import pom.homePage;
import pom.passengerClass;

import java.io.IOException;

public class stepClass extends baseClass {

    homePage HomePage=new homePage();
    busPage BusPage=new busPage();
    passengerClass PassengerClass=new passengerClass();

    @Given("user enter the url")
    public void user_enter_the_url() {
        launch();
        url("https://www.makemytrip.com/");
        maximize();
        zoomOut(driver,0.7);
    }


    @Then("clicking bus icon")
    public void clicking_bus_icon() throws InterruptedException {
        HomePage.buses();

    }


    @Given("enter the from location {string}")
    public void enterTheFromLocation(String arg0) throws InterruptedException {

        HomePage.FromLocation(arg0);
    }

    @Then("enter the to location {string}")
    public void enterTheToLocation(String arg0) throws InterruptedException {

        HomePage.ToLocation(arg0);


    }

    @Then("enter the travel date")
    public void enterTheTravelDate() throws InterruptedException, IOException {
        HomePage.TravelDate();
        screenShot("TravelDetails");

    }

    @Then("click the search button")
    public void clickTheSearchButton() {

        HomePage.SearchButton();
    }

    @Given("click the price button")
    public void clickThePriceButton() throws InterruptedException {
        BusPage.ACButton();
        BusPage.SleeperButton();
//        BusPage.TimerButton();
//        Thread.sleep(3000);

        BusPage.PriceButton();

    }

    @Then("select the cheapest bus")
    public void selectTheCheapestBus() throws InterruptedException {
        BusPage.CheapBusButton();

    }

    @Then("select the seat")
    public void selectTheSeat() throws InterruptedException {
        BusPage.SeatSelection();

    }

    @Then("select the boarding point")
    public void selectTheBoardingPoint() {
        BusPage.BoardingPoint();

    }

    @And("select the drop point")
    public void selectTheDropPoint() throws InterruptedException, IOException {
        BusPage.DropPoint();
        screenShot("SeatSelection");

    }

    @Then("click the continue button")
    public void clickTheContinueButton() {
        BusPage.ContinueButton();

    }

    @Given("enter the passenger name {string}")
    public void enterThePassengerName(String arg0) throws InterruptedException {
        PassengerClass.passengerName(arg0);
    }

    @Then("enter the passenger age {string}")
    public void enterThePassengerAge(String arg0) throws InterruptedException {
        PassengerClass.passengerAge(arg0);
        
    }


    @Then("select the gender")
    public void selectTheGender() {
        PassengerClass.passengerGender();
    }


    @Then("enter the passenger Email {string}")
    public void enterThePassengerEmail(String arg0) {
        PassengerClass.passengerMail(arg0);
        
    }

    @Then("enter the passenger mobile number {string}")
    public void enterThePassengerMobileNumber(String arg0) throws IOException {
        PassengerClass.passengerMobile(arg0);
        screenShot("PassengerDetails");
    }

    @Then("select the state and click the checkbox")
    public void selectTheStateAndClickTheCheckbox() throws InterruptedException, IOException {
        PassengerClass.passengerStateCheckbox();
        Thread.sleep(2000);
        screenShot("paymentPage");

    }

}
