package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By customerName = By.xpath("//select[@id='userSelect']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");

    By yourNameText = By.xpath("//label[normalize-space()='Your Name :']");




    public void selectCustomerNameFromDropdown(String cName)
    {
        selectByVisibleTextFromDropDown(customerName,cName);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(loginButton);
    }


    public String getYourNameText()
    {
        return  getTextFromElement(yourNameText);
    }
}
