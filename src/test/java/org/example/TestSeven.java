package org.example;

import org.testng.annotations.Test;

public class TestSeven extends BaseTest {

    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationSuccessPage registrationSuccessPage = new RegistrationSuccessPage();
    BuildYourOwnComputer buildYourOwnComputerPage = new BuildYourOwnComputer();
    //  ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();

    //  EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();

    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {

        //Click on register button
        homePage.clickOnRegistrationButton();

        //Verify user is on registration page
        registrationPage.verifyUserIsOnRegistrationPage();

        //Enter user registration details
        registrationPage.userEntersRegistrationDetails();

        //Verify user registered successfully
        registrationSuccessPage.verifyUserRegisteredSuccessfully();
    }

    @Test
    public void userShouldBeAbleToAddAProductToBasket() {

        //Click on the Build your own computer
        homePage.buildYourOwnComputerOnHomePage();

        //Select correct options to build the computer
        buildYourOwnComputerPage.selectOptionsToBuildTheComputer();

        //Click on add to basket button
        buildYourOwnComputerPage.addProductToBasket();

        //Click on shopping cart button
        buildYourOwnComputerPage.clickOnShoppingCartButton();

        //Check if the product has been added to the basket by verifying product name "build your own computer"
        //   shoppingCartPage.buildYourOwnComputerInShoppingCart();
    }

    @Test
    public void userShouldBeAbleToChangeTheCurrencyToEuro() {

        //Verify if build your own computer price is display in Dollar (Assert Point)
        homePage.verifyDollarSignOnHomePage();

        //Change the Dollar into Euro sign
        homePage.changeDollarIntoEuroSign();

        //Verify if build your own computer price is display in Euro (Assert Point)
        homePage.verifyEuroSignOnHomePage();
    }

    @Test
    public void registerUserShouldBeAbleToReferAProductToAFriend() {

        //User need to register or be logged in

        //Click on register button
        homePage.clickOnRegistrationButton();

        //Verify user is on registration page
        registrationPage.verifyUserIsOnRegistrationPage();

        //Enter user registration details
        registrationPage.userEntersRegistrationDetails();

        //Click on continue button
        registrationSuccessPage.clickOnContinueButton();

        //Click on build your own computer product on homepage
        homePage.buildYourOwnComputerOnHomePage();

        //Click on email a friend option at the bottom
        buildYourOwnComputerPage.clickOnEmailAFriendButton();

        //Enter friend's email and a personal message
        emailAFriendPage.userEnterFriendsEmailAndPersonalMessage();

        //Click on send email button
        emailAFriendPage.clickOnSendEmailButton();

        //Verify the message "Your message has been sent." (Assert Point)
        EmailAFriendPage.verifyUserSentEmailSuccessfully();
    }

    @Test
    public void onlyRegisteredUserShouldBeAbleToVote() {

        //Verify that user is not able to vote without being registered
        homePage.verifyIfNonRegisteredUserIsAbleToVote();

        //User need to register
        //Click on register button
        homePage.clickOnRegistrationButton();

        //Verify user is on registration page
        registrationPage.verifyUserIsOnRegistrationPage();

        //Enter user registration details
        registrationPage.userEntersRegistrationDetails();

        //Verify user registered successfully
        registrationSuccessPage.verifyUserRegisteredSuccessfully();

        //Click on continue button
        registrationSuccessPage.clickOnContinueButton();

        //Verify registered user is able to vote
        homePage.verifyRegisteredUserIsAbleToVote();
    }


//*********************************************************************************************************************

    @Test
    public void getProductListFromHomePage(){

        //Verify the product titles on the Home Page
        homePage.getProductTitles();
    }

    @Test
    public void verifyHomePageContains(){

        //Verify elements (Register, Login, Wishlist and Welcome to our store) contains on Home Page
        homePage.verifyHomePageContains();
    }

    @Test
    public void verifyUserIsNotAbleToVoteWithoutSelectingAnOption(){

        //Click on the Vote Button on the Home Page
        homePage.voteButton();

        //Verify the message in Alert "Please select an answer" (Assert Point)
        homePage.handleVoteAlert();
    }

    @Test
    public void verifyUserIsAbleToNavigateToFacebookPage(){

        //User should be able to click on Facebook icon, and verify that new window has been opened and handled.
        homePage.facebookPageWindowHandle();

        //Then navigate back to main page and verify that user is now on Home Page
        homePage.verifyUserIsOnHomePage();
    }

    @Test
    public void verifyThatUserIsAbleToSearchGivenProductSuccessfully(){

        //On Home Page click on search bar and enter product name to search and verify user is on that product page (Parameterised  Method)
        homePage.enterProductNameToSearch("Nike");

        //Verify that all the product listed contains either Nike or Apple (Same as URL) (Assert Point)
        homePage.verifyProductListedContainsProductNameRequested();
    }

    @Test
    public void verifyThatUserCommentHasSuccessfullyBeenAddedToCommentsList(){

        //On Home Page click under News and nopCommerce new release!, click on Details Button
        homePage.clickOnDetailsButton();

        //Verify that user is on the nopcommerce new release page (Assert Point - verify URL)
        nopCommerceNewReleasePage.verifyURL();

        //Verify the title of the page "nopCommerce new release!" (Assert Point - verify Title)
        nopCommerceNewReleasePage.verifyPageTitle();

        //Enter Title
        nopCommerceNewReleasePage.enterTitle();

        //Enter Comment
        nopCommerceNewReleasePage.enterComment();

        //Click on New Comment Button
        nopCommerceNewReleasePage.clickOnCommentButton();

        //Verify comment added message "News comment is successfully added." (Assert Point - verify Message)
        nopCommerceNewReleasePage.verifyCommentAddedMessage();

        //Verify that user's comment has been added to the comments list and been displayed last on the list (Assert Point - Comment has been added to the list and is showing last on the list)
        nopCommerceNewReleasePage.verifyCommentHasBeenAddedToTheCommentListAndListedLast();

    }

    @Test
    public void verifyThatProductListIsInZToAFormat (){

        //---THIS TEST CASE SHOULD FAIL---\\

        //Click on computer on Home Page
        homePage.computerButton();

        //Click on Desktops
        computersPage.desktopButton();

        //Under sort by functionality, select "Name Z-A" option
        desktopsPage.clickOnSortByZToAOption();

        //Verify that all the products are listed in Z-A format (Assert Point)
        desktopsPage.verifyProductListedInZToAFormat();

    }

}



























//package org.example;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.testng.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//public class TestSeven extends BaseTest{
//
//
//    private static ChromeDriver driver;
//
//    public static void main(String[] args) {
//
//
//
//        clickButton(By.xpath("//a[@class='ico-register']"));
//
//        //select male and female
//        driver.findElement(By.xpath("//input[@id='gender-female']"));
//        clickButton(By.xpath("//label[@for='gender-male']"));
//
//
//        typeText(By.xpath("//input[@id='FirstName']"), "darshak");
//        typeText(By.xpath("//input[@id='LastName']"), "goyani");
//
//
//        //select day of birth
//        Select birthday = new Select(driver.findElement(By.name("DateOfBirthDay")));
//        birthday.selectByIndex(11);
//
//        //select month of birth
//          Select birthMonth = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
//         birthMonth.selectByVisibleText("6");
//
//        //select year of the birth
//        Select birthyear = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
//        birthyear.selectByVisibleText("1976");
//
//        typeText(By.xpath("//input[@id='Email']"), "darshak2@gmail.com");
//        typeText(By.xpath("//input[@id='Password']"), "test123");
//        typeText(By.xpath("//input[@id='ConfirmPassword']"), "test123");
//
//        clickButton(By.xpath("//button[@id='register-button']"));
//
//    }
//
//
//    @Test
//    public void userShouldBeAbleToRegisterSuccessfully() {
//
//
//        clickButton(By.className("ico-register"));
//        //    driver.findElement(By.className("ico-register"));
//        //select male and female
//        //  driver.findElement(By.xpath("//input[@id='gender-female']"));
//        clickButton(By.xpath("//label[@for='gender-male']"));
//
//
//        typeText(By.xpath("//input[@id='FirstName']"), "darshak");
//        typeText(By.xpath("//input[@id='LastName']"), "goyani");
//
//
//
//        typeText(By.xpath("//input[@id='Email']"),"darshak31@gmail.com");
//        typeText(By.xpath("//input[@id='Password']"),"test123");
//        typeText(By.xpath("//input[@id='ConfirmPassword']"),"test123");
//
//        clickButton(By.xpath("//button[@id='register-button']"));
//
//        String ExpectedMessage = "Your registration completed";
//        String ActualMessage = driver.findElement(By.className("result")).getText();
//        Assert.assertEquals(ActualMessage,ExpectedMessage,"Registration not successful");}
//
//
//    @Test
//    public void userShouldBeAbleToSelectCurrencyInEuro(){
//
//
//        //click on currency
//        clickButton(By.xpath("//select[@id='customerCurrency']"));
//
//        //Select currency
//        Select currency = new Select(driver.findElement(By.id("customerCurrency")));
//        currency.selectByVisibleText("Euro");
//
//        //scroll down on homepage and build own computer to check the price
//        clickButton(By.xpath("//a[normalize-space()='Build your own computer']"));
//
//        //user should be able to see 'euro' in front of the price
//        clickButton(By.xpath("//span[@id='price-value-1']"));
//
//        //Expected and actual result
//
//        String expectedCurrency ="???1022.00";
//        String actualCurrency = driver.findElement(By.xpath("//span[contains(text(),'???1022.00')]")).getText();
//        org.junit.Assert.assertEquals(expectedCurrency,actualCurrency,"registration is not successful");
//
//    }
//
//
//
//
//    @Test
//    public void userShouldBeAbleToAddProductInShoppingBasketSuccessfully() {
//
//
//
//        //Click on computer
//        clickButton(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
//
//        //click on desktops
//        clickButton(By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']"));
//
//        //click on build your own computer
//        clickButton(By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']"));
//
//        //click on processor and select ram 2.2Ghz
//        driver.findElement(By.xpath("//select[@id='product_attribute_1']"));
//        Select processor = new Select(driver.findElement(By.xpath("//select[@id='product_attribute_1']")));
//        processor.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
//
//        //click on ram and select 2gb
//        driver.findElement(By.xpath("/label[contains(text(),'RAM')]"));
//        Select ram = new Select(driver.findElement(By.xpath("//select[@id='product_attribute_2']")));
//        ram.selectByVisibleText("2 GB");
//
//        //select 320 gb
//        clickButton(By.xpath("//input[@id='product_attribute_3_6']"));
//
//        //select vista home from os
//        clickButton(By.xpath("//input[@id='product_attribute_4_8']"));
//
//        //SELECT micro soft office
//        clickButton(By.xpath("//input[@id='product_attribute_5_10']"));
//
//        //select software acrobat reader
//        clickButton(By.xpath("//input[@id='product_attribute_5_11']"));
//
//        //select total commander
//        clickButton(By.xpath("//input[@id='product_attribute_5_12']"));
//
//        //click on add to cart
//        clickButton(By.xpath("//button[@id='add-to-cart-button-1']"));
//
//        //to verify product is in cart
//        clickButton(By.xpath("//input[@id='product_attribute_5_11']"));
//
//        //select total command
//        clickButton(By.xpath("//input[@id='product_attribute_5_12']"));
//
//        //click on add to kart button
//        clickButton(By.xpath("//button[@id'add-to-cart-button-1']"));
//
//        //verify the product is in basket or not
//        getTextFrom(By.xpath("//span[@class=\"cart-label\"]"));
//
//        String expectedMessage = "The product has been added to your shopping cart";
//        String actualMessage = driver.findElement(By.xpath("//p[@class='content']")).getText();
//        org.junit.Assert.assertEquals(expectedMessage, actualMessage, "Product has not been added to your cart");
//
//
//    }}






















//    public static void ClickButton(By by) {
//        driver.findElement(by).click();
//    }
//    public static void typeText(By by , String text) {
//        driver.findElement(by).sendKeys(text);
//    }
//    public static void getTextFrom(By by){
//        driver.findElements(by).clear();
//    }
//    public static void driverWaitUntilUrlToBe(int time, String url) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.urlToBe(url));
//    }
//    public static void driverWaitsUntilElementToBeClickable(By by,int time){
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
//    }
//
//
//
//    public static String randomDate() {
//        Date date = new Date();
//        SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
//        return formatter.format(date);}
//
//
//    public static void takeSnapShot(String a){
//
//        //convert web driver object to TakeScreenshot
//
//        TakesScreenshot srcShot = ((TakesScreenshot)driver);
//
//        File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
//
//
//        try{
//            FileUtils.copyFile(srcFile,new File("Screenshots\\"+a+randomDate()+".png"));
//        } catch (IOException e){
//            e.printStackTrace();
//
//        }}}