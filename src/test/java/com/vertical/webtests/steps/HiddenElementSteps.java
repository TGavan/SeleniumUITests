package com.vertical.webtests.steps;

import com.vertical.webtests.pageobjects.DynamicLoadedPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HiddenElementSteps {
    private Base base;
    private DynamicLoadedPage dynamicLoadedPage;


    public HiddenElementSteps(Base base) {
        this.base = base;
        this.dynamicLoadedPage = new DynamicLoadedPage(base.driver);

    }

    @Given("User is at the home page of the application")
    public void user_is_at_the_home_page_of_the_application() {
        dynamicLoadedPage.navigateToDynamicLoadedPage();
    }

    @Given("User clicks on the Start button")
    public void user_clicks_on_the_start_button() {
        dynamicLoadedPage.clickStartButton();
    }

    @Given("User waits for the dynamic element")
    public void user_waits_for_the_dynamic_element() {
        dynamicLoadedPage.waitForHelloWorldTextToBeDisplayed();

    }

    @Then("element is loaded and displayed the result as {string}")
    public void element_is_loaded_and_displayed_the_result_as(String string) {
        Assert.assertEquals(dynamicLoadedPage.getTextForHelloWorldElement(), string);
    }


}
