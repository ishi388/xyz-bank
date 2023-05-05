package com.bank.testsuite;

import com.bank.pages.AccountPage;
import com.bank.pages.BankManagerLoginPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.HomePage;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage   = new BankManagerLoginPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();

    @Test

    public void bankManagerShouldAddCustomerSuccessfully()
    {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerTab();
        bankManagerLoginPage.enterFirstName("John");
        bankManagerLoginPage.enterLastName("Smith");
        bankManagerLoginPage.enterPostcode("NW90SD");
        bankManagerLoginPage.clickOnAddCustomer();
        Assert.assertEquals(bankManagerLoginPage.getPopUpText().substring(0,27),"Customer added successfully");
        bankManagerLoginPage.clickOnPopUp();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException
    {
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnOpenAccount();
        Thread.sleep(2000);
        bankManagerLoginPage.selectCustomerNameFromCustomersDropDown("Harry Potter");
        bankManagerLoginPage.selectPoundFromCurrencyDropdown("Pound");
        bankManagerLoginPage.clickOnProcessButton();
        Assert.assertEquals(bankManagerLoginPage.getPopUpText().substring(0,28),"Account created successfully");
        bankManagerLoginPage.clickOnPopUp();

    }

    @Test

    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException
    {
        homePage.clickOnCustomerLoginButton();
        Thread.sleep(5000);
        customerLoginPage.selectCustomerNameFromDropdown("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        //  System.out.println(customerLoginPage.getLogoutText());
        Assert.assertEquals(accountPage.getLogoutText(),"Logout");
        accountPage.clickOnLogoutButton();
        Assert.assertEquals(customerLoginPage.getYourNameText().substring(0,9),"Your Name");

    }

    @Test
    public void customerShouldDepositMoneySuccessfully()
    {
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectCustomerNameFromDropdown("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnDepositButton();
        accountPage.enterAmount("100");
        accountPage.clickOnDepositButtonAfterDeposit();
        Assert.assertEquals(accountPage.getDepositSuccessfulText(),"Deposit Successful");

    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully()
    {
        homePage.clickOnCustomerLoginButton();
        customerLoginPage.selectCustomerNameFromDropdown("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawlTab();
        accountPage.enterWithdrawlAmount("50");
        accountPage.clickOnWithdrawlButton();
        Assert.assertEquals(accountPage.getWithdrawlMessageText(),"Transaction successful");


    }






}
