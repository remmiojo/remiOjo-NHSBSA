package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.NhsBSAPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class WalesNHSHelpStepDefs extends BaseUtil {
    private BaseUtil base;


    public WalesNHSHelpStepDefs(BaseUtil base) {
        this.base = base;
    }


    @Given("^I am on nhsbsa homepage$")
    public void i_am_on_nhsbsa_homepage() throws Throwable {
        base.driver.manage().window().maximize();
        base.driver.navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
        try {
            if (base.driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).isDisplayed()) {
                base.driver.findElement(By.id("nhsuk-cookie-banner__link_accept_analytics")).click();
            }
        } catch
        (Exception e) {
            System.out.println(e);
        }
    }

    @When("I click Start")
    public void iClickStart() {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        nhsBSAPage.clickStart();
    }

    @And("I select Wales and click Next button")
    public void iSelectWalesAndClickNextButton() {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        nhsBSAPage.clickWales();
        nhsBSAPage.clickStart();
    }

    @And("I enter my dob {string}, {string}, {string} and click Next button")
    public void iEnterMyDobAndClickNextButton(String day, String month, String year) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        nhsBSAPage.enterDay(day);
        nhsBSAPage.enterMonth(month);
        nhsBSAPage.enterYear(year);
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for my living situation question and click Next button")
    public void iSelectForMyLivingSituationQuestionAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for my Benefit or Tax credit situation question and click Next button")
    public void iSelectForMyBenefitOrTaxCreditSituationQuestionAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for my pregnancy or birth situation question and click Next button")
    public void iSelectForMyPregnancyOrBirthSituationQuestionAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for injury or illness from armed forces questions and click Next button")
    public void iSelectForInjuryOrIllnessFromArmedForcesQuestionsAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for diabetic condition question and click Next button")
    public void iSelectForDiabeticConditionQuestionAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for glaucoma condition question and click Next button")
    public void iSelectForGlaucomaConditionQuestionAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for live permanently in a care question and click Next button")
    public void iSelectForLivePermanentlyInACareQuestionAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @And("I select {string} for savings and investment option and click Next button")
    public void iSelectForSavingsAndInvestmentOptionAndClickNextButton(String answer) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        if (answer.equals("no") ){
            nhsBSAPage.clickNoRadioButton();
        } else {
            nhsBSAPage.clickYesRadioButton();

        }
        nhsBSAPage.clickStart();
    }

    @Then("decision should contain {string} and {string}")
    public void decisionShouldContainAnd(String decisionB, String decisionA) {
        NhsBSAPage nhsBSAPage = new NhsBSAPage(base.driver);
        assertThat(nhsBSAPage.getFreePrescription().contains(decisionB), is(equalTo(true)));
        assertThat(nhsBSAPage.getResultingHeading().contains(decisionA), is(equalTo(true)));
    }
}
