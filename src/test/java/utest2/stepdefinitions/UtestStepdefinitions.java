package utest2.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import utest2.models.UserData;
import utest2.tasks.FormStep1;
import utest2.tasks.FormStep2;
import utest2.tasks.FormStep3;
import utest2.tasks.OpenSite;

import java.util.List;

public class UtestStepdefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I enter to ustest website$")
    public void iEnterToUstestWebsite() {
        OnStage.theActorCalled("Jean Sousa").wasAbleTo(OpenSite.thePage());
    }

    @When("^I Type my personale information and complete the setup$")
    public void iTypeMyPersonaleInformationAndCompleteTheSetup(List<UserData> userData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(
                FormStep1.formStep1(userData),
                FormStep2.formStep2(userData),
                FormStep3.formStep3(userData));
    }

    @Then("^I Sig up on the utest\\.$")
    public void iSigUpOnTheUtest()  {

    }

}
