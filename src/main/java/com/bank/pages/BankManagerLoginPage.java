package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By firstNameField = By.xpath("//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");
    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");
    By customersList = By.id("userSelect");
    By currencyList = By.xpath("//select[@id='currency']");
    By processButton = By.xpath("//button[normalize-space()='Process']");

    public void clickOnAddCustomerTab()
    {
        clickOnElement(addCustomerTab);
    }

    public void enterFirstName(String fName)
    {
        sendTextToElement(firstNameField,fName);
    }

    public void enterLastName(String lName)
    {
        sendTextToElement(lastNameField,lName);
    }

    public void enterPostcode(String pCode)
    {
        sendTextToElement(postCodeField,pCode);
    }


    public void clickOnAddCustomer()
    {
        clickOnElement(addCustomerButton);
    }

    public void clickOnPopUp()
    {
        switchToAlert();
        acceptAlert();
    }

    public String getPopUpText()
    {
        return getTextFromAlert();
    }

    public void clickOnOpenAccount(){
        clickOnElement(openAccountTab);
    }

    public void selectCustomerNameFromCustomersDropDown(String cName) throws InterruptedException
    {
        Thread.sleep(2000);
        // waitUntilVisibilityOfElementLocated(customersList,10);
        selectByVisibleTextFromDropDown(customersList,cName);
    }

    public void selectPoundFromCurrencyDropdown(String currency)
    {
        waitUntilVisibilityOfElementLocated(currencyList,10);
        selectByVisibleTextFromDropDown(currencyList,currency);
    }

    public void clickOnProcessButton()
    {
        clickOnElement(processButton);
    }
}
