package com.vertical.webtests.steps;

import com.vertical.webtests.pageobjects.ChallengingDOMPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ChallengingDOMSteps {
    private Base base;
    private ChallengingDOMPage challengingDOMPage;


    public ChallengingDOMSteps(Base base) {
        this.base = base;
        this.challengingDOMPage = new ChallengingDOMPage(base.driver);
    }

    @Given("User is at the home page of the challengingDOM application")
    public void user_is_at_the_home_page_of_the_challenging_dom_application() {
        challengingDOMPage.navigateToChallengingDOMPage();
    }

    @Given("User clicks on the blue button")
    public void user_clicks_on_the_blue_button() {
        challengingDOMPage.clickBlueButton();
    }

    @Given("User click on the red button")
    public void user_click_on_the_red_button() {
        challengingDOMPage.clickRedButton();
    }

    @Given("User click on the green button")
    public void user_click_on_the_green_button() {
        challengingDOMPage.clickGreenButton();
    }

    @Then("User clicks on the edit buttons")
    public void user_clicks_on_the_edit_buttons() {
        challengingDOMPage.clickAllEditLinks();
    }

    @Then("User clicks on the delete buttons")
    public void user_clicks_on_the_delete_buttons() {
        challengingDOMPage.clickAllDeleteLinks();
    }

}
