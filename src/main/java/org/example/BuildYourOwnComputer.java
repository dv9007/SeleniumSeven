package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils {

    private By _processorField = By.xpath("//option[@data-attr-value=\"2\"]");
    private By _ramField = By.xpath("//option[@value=\"5\"]");
    private By _hddField = By.xpath("//label[@for=\"product_attribute_3_6\"]");
    private By _osField = By.xpath("//label[@for=\"product_attribute_4_9\"]");
    private By _softwareMicrosoftOfficeField = By.xpath("//input[@id=\"product_attribute_5_10\"]");
    private By _softwareAcrobatReaderField = By.xpath("//input[@id=\"product_attribute_5_11\"]");
    private By _softwareTotalCommanderField = By.xpath("//input[@id=\"product_attribute_5_12\"]");
    private By _addToBasketButton = By.xpath("//button[@id=\"add-to-cart-button-1\"]");
    private By _shoppingCartButton = By.className("cart-label");
    private By _emailAFriendButton = By.className("email-a-friend-button");

    public void selectOptionsToBuildTheComputer(){
        //Select "2.5 GHz Intel Pentium Dual-Core E2200 [+$1500]" option under processor
        clickButton(_processorField);

        //Select "8GB [+$60.00]" option under RAM
        clickButton(_ramField);

        //Select "320 GB" radio option under HDD
        clickButton(_hddField);

        //Select "Vista Premium [+$60.00]" option under OS
        clickButton(_osField);

        //Select all three options under software
        //"Microsoft Office [+$50.00]"
        clickButton(_softwareMicrosoftOfficeField);
        //"Acrobat Reader [+$10.00]"
        clickButton(_softwareAcrobatReaderField);
        //"Total Commander [+$5.00]"
        clickButton(_softwareTotalCommanderField);
    }

    public void addProductToBasket(){
        //Click on add to basket button
        clickButton(_addToBasketButton);
    }

    public void clickOnShoppingCartButton(){
        //Click on shopping cart button
        clickButton(_shoppingCartButton);
    }

    public void clickOnEmailAFriendButton(){
        //Click on email a friend option at the bottom
        clickButton(_emailAFriendButton);
    }

}

