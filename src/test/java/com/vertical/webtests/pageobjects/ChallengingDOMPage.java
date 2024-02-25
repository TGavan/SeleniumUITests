package com.vertical.webtests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ChallengingDOMPage {
    private WebDriver driver;

    @FindBy(css = "a.button:first-child")
    private WebElement blueButton;

    @FindBy(css = "a.button.alert")
    private WebElement redButton;

    @FindBy(css = "a.button.success")
    private WebElement greenButton;

    @FindBy(css = "a[href='#edit']")
    private List<WebElement> editLinks;

    @FindBy(css = "a[href='#delete']")
    private List<WebElement> deleteLinks;


    public ChallengingDOMPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ChallengingDOMPage clickBlueButton() {
        blueButton.click();
        return new ChallengingDOMPage(driver);
    }

    public ChallengingDOMPage clickGreenButton() {
        greenButton.click();
        return new ChallengingDOMPage(driver);
    }

    public ChallengingDOMPage clickRedButton() {
        redButton.click();
        return new ChallengingDOMPage(driver);
    }


    public ChallengingDOMPage navigateToChallengingDOMPage() {
        driver.get("https://the-internet.herokuapp.com/challenging_dom");
        return new ChallengingDOMPage(driver);
    }

    public ChallengingDOMPage clickAllEditLinks() {
        Assert.assertEquals(editLinks.size(), 10);
        for (WebElement editLink : editLinks) {
            editLink.click();
        }
        return new ChallengingDOMPage(driver);
    }

    public ChallengingDOMPage clickAllDeleteLinks() {
        Assert.assertEquals(deleteLinks.size(), 10);
        for (WebElement deleteLink : deleteLinks) {
            deleteLink.click();
        }
        return new ChallengingDOMPage(driver);
    }
}
