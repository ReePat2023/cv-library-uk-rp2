package uk.co.library.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {

    @Given("I am on the homepage")
    public void iAmOnTheHomepage() {
    }

    @When("I accept all cookies")
    public void iAcceptAllCookies() throws InterruptedException {
        new HomePage().acceptCookies();
    }

    @And("I enter job title {string}")
    public void iEnterJobTitle(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("I enter Location {string}")
    public void iEnterLocation(String location) {
        new HomePage().enterLocation(location);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on moreSearchOptionsLink")
    public void iClickOnMoreSearchOptionsLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter salaryMin {string}")
    public void iEnterSalaryMin(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I enter salaryMax {string}")
    public void iEnterSalaryMax(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salaryType {string}")
    public void iSelectSalaryType(String sType) {
        new HomePage().selectSalaryType(sType);
    }

    @And("I select jobType {string}")
    public void iSelectJobType(String jType) throws InterruptedException {
        new HomePage().selectJobType(jType);
    }

    @And("^I click on 'Find Jobs' button$")
    public void iClickOnFindJobsButton() {
        //	  click on 'Find Jobs' button
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I can see the result {string}")
    public void iCanSeeTheResult(String result) {
        Assert.assertEquals(new ResultPage().verifyTheResults(),result,"Error Message is not displayed");
    }
}
