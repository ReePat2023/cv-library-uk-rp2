package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;
import org.testng.Assert;
public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Permanent jobs in Harrow')]")
    WebElement resultText;
    public String verifyTheResults(){
      //  Assert.assertEquals(resultText.getText(),expected,"Error");
        log.info("Result verified : " + resultText.toString());
        return getTextFromElement(resultText);
    }
}

