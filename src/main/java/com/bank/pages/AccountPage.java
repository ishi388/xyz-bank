package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By logoutText = By.xpath("//button[normalize-space()='Logout']");
    By logoutButton = By.xpath("//button[normalize-space()='Logout']");
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    By amount = By.xpath("//input[@placeholder='amount']");
    By depositButton = By.xpath("//button[@type='submit']");
    By depositSuccessfulText= By.xpath("//span[@class='error ng-binding']");
    By withdrawlTab = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawlAmount = By.xpath("//input[@placeholder='amount']");
    By withdrawlButton = By.xpath("//button[normalize-space()='Withdraw']");
    By withdrawlMessageText = By.xpath("//span[@class='error ng-binding']");



    public String getLogoutText()
    {
        return getTextFromElement(logoutText);
    }

    public void clickOnLogoutButton()
    {
        clickOnElement(logoutButton);
    }
    public void clickOnDepositButton()
    {
        clickOnElement(depositTab);
    }

    public void enterAmount(String amount1)
    {
        sendTextToElement(amount,amount1);
    }
    public void clickOnDepositButtonAfterDeposit()
    {
        clickOnElement(depositButton);
    }

    public String getDepositSuccessfulText()
    {
        return getTextFromElement(depositSuccessfulText);
    }

    public void clickOnWithdrawlTab()
    {
        clickOnElement(withdrawlTab);
    }
    public void enterWithdrawlAmount(String wAmount)
    {
        sendTextToElement(withdrawlAmount,wAmount);
    }
    public void clickOnWithdrawlButton()
    {
        clickOnElement(withdrawlButton);
    }
    public String getWithdrawlMessageText()
    {
        return getTextFromElement(withdrawlMessageText);
    }
}
