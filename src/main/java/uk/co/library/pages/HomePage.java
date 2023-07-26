package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptCookies;
    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobTitleField;
    @FindBy(xpath = "//input[@id='location']")
    WebElement locationField;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;
    @FindBy(id = "gdpr-consent-notice")
    WebElement iframe;

    public void acceptCookies() throws InterruptedException {
        switchToIframe(iframe);
        Thread.sleep(2000);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }
    public void enterJobTitle(String jobTitle){
        sendTextToElement(jobTitleField,jobTitle);
        log.info("Enter job title : " + jobTitle.toString());
    }
    public void enterLocation(String location){
        sendTextToElement(locationField,location);
        log.info("Enter job location : " + location.toString());
    }
    public void selectDistance(String distance){
        selectByVisibleTextFromDropDown(distanceDropDown,distance);
        log.info("Select distance : " + distance.toString());
    }
    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreSearchOptionsLink);
        log.info("Click on search option : " + moreSearchOptionsLink.toString());
    }
    public void enterMinSalary(String minSalary){
        sendTextToElement(salaryMin,minSalary);
        log.info("Enter minimum salary amount : " + minSalary.toString());
    }
    public void enterMaxSalary(String maxSalary){
        sendTextToElement(salaryMax,maxSalary);
        log.info("Enter maximum salary amount : " + maxSalary.toString());
    }
    public void selectSalaryType(String sType){
        sendTextToElement(salaryTypeDropDown,sType);
        log.info("Click on salary type : " + sType.toString());
    }
    public void selectJobType(String jobType) throws InterruptedException {
        selectByVisibleTextFromDropDown(jobTypeDropDown,jobType);
        log.info("Click on job type : " + jobType.toString());
        Thread.sleep(2000);
    }
    public void clickOnFindJobsButton(){
        //Thread.sleep(2000);
        clickOnElement(findJobsBtn);
        //log.info("Click on find jobs button : " + findJobsBtn);

    }
}
