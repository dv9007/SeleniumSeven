package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Utils{


    private By _friendsEmailField = By.className("friend-email");
    private By _personalMessage = By.id("PersonalMessage");
    private By _sendEmailButton = By.name("send-email");

    public void userEnterFriendsEmailAndPersonalMessage(){
        //Enter friend's email
        typeText(_friendsEmailField,"somebody877"+randomDate()+"@gmail.com");
        //driver.findElement(By.id("friend-email")).sendKeys("testingpatel22@gmail.com");

        //Enter personal message
        typeText(_personalMessage, "Please do checkout this amazing product");
    }

    public void clickOnSendEmailButton(){
        //Click on send email button
        clickButton(_sendEmailButton);
    }



    private By _resultText = By.className("result");

    public void verifyUserSentEmailSuccessfully(){
        //Verify the message "Your message has been sent." (Assert Point)
        String actualMessage = driver.findElement(_resultText).getText();
        String expectedMessage = "Your message has been sent.";
        Assert.assertEquals(actualMessage, expectedMessage, "Email was not sent successfully");
    }

}


