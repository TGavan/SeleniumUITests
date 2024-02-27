package com.vertical.webtests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadedPage {
    private WebDriver driver;

    @FindBy(css = "#start>button")
    private WebElement startButton;

    @FindBy(css = "#finish>h4")
    private WebElement helloWorldElement;

    public DynamicLoadedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickStartButton() {
        startButton.click();
    }

    public DynamicLoadedPage navigateToDynamicLoadedPage() {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        return new DynamicLoadedPage(driver);
    }

    public DynamicLoadedPage waitForHelloWorldTextToBeDisplayed() {
        //Dynamic wait for the element
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(helloWorldElement));
        return new DynamicLoadedPage(driver);
    }

    public String getTextForHelloWorldElement() {
        return helloWorldElement.getText();
    }
}
