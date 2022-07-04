package com.parabank.webpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

    protected final String PAGE_URL = "https://parabank.parasoft.com/parabank/index.htm";

    protected final String PAGE_TITLE = "ParaBank | Welcome | Online Banking";

    protected String username = "username";
    protected String password = "password";

    @FindBy(css = ".admin")
    WebElement adminImgBtn;
    @FindBy(css = ".logo")
    WebElement homePageLogoBtn;
    @FindBy(xpath = "(//a[.='About Us'])[1]")
    WebElement aboutUsBtn;
    @FindBy(xpath = "(//a[.='Services'])[1]")
    WebElement servicesBtn;
    @FindBy(xpath = "(//a[.='Products'])[1]")
    WebElement productsBtn;
    @FindBy(xpath = "(//a[.='Locations'])[1]")
    WebElement locationsBtn;
    @FindBy(css = "a[href='admin.htm']")
    WebElement adminPageBtn;
    @FindBy(name = "username")
    WebElement usernameField;
    @FindBy(name = "password")
    WebElement passwordField;
    @FindBy(css = "*[value='Log In']")
    WebElement loginBtn;
    @FindBy(linkText = "Forgot login info?")
    WebElement forgotInfoBtn;
    @FindBy(linkText = "Register")
    WebElement registerBtn;
    @FindBy(xpath = "(//a[@href='/parabank/index.htm'])[2]")
    WebElement homePageIconBtn;
    @FindBy(xpath = "(//a[@href='about.htm'])[2]")
    WebElement aboutUsIconBtn;
    @FindBy(xpath = "(//a[@href='contact.htm'])[1]")
    WebElement contactUsIconBtn;
    @FindBy(linkText = "Withdraw Funds")
    WebElement withdrawFundsBtn;
    @FindBy(linkText = "Transfer Funds")
    WebElement atmTransferFundsBtn;
    @FindBy(linkText = "Check Balances")
    WebElement checkBalancesBtn;
    @FindBy(linkText = "Make Deposits")
    WebElement makeDepositsBtn;
    @FindBy(linkText = "Bill Pay")
    WebElement billPayBtn;
    @FindBy(linkText = "Account History")
    WebElement accountHistoryBtn;
    @FindBy(xpath = "(//*[@href='services/bank?_wadl&_type=xml'])[3]")
    WebElement onlineTransferFundsBtn;

    public void clickAdminImgBtn() {
        adminImgBtn.click();
    }

    public void clickHomePageBtn() {
        homePageLogoBtn.click();
    }

    public void clickAboutUsBtn() {
        aboutUsBtn.click();
    }

    public void clickServicesBtn() {
        servicesBtn.click();
    }

    public void clickProductsBtn() {
        productsBtn.click();
    }

    public void clickLocationsBtn() {
        locationsBtn.click();
    }

    public void clickAdminPageBtn() {
        adminPageBtn.click();
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void clickForgotInfoBtn() {
        forgotInfoBtn.click();
    }

    public void clickRegisterBtn() {
        registerBtn.click();
    }

    public void clickHomePageIconBtn() {
        homePageIconBtn.click();
    }

    public void clickAboutUsIconBtn() {
        aboutUsIconBtn.click();
    }

    public void clickContactUsIconBtn() {
        contactUsIconBtn.click();
    }

    public void setUsernameField() {
        usernameField.sendKeys(username);
    }

    public void setPasswordField() {
        passwordField.sendKeys(password);
    }


}



