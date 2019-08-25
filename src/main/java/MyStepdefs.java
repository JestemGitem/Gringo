import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^website https://www\\.phptravels\\.net/ is open$")
    public void websiteHttpsWwwPhptravelsNetIsOpen() {
    }

    @When("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I choose date$")
    public void iChooseDate() {
    }

    @And("^I choose number of guests$")
    public void iChooseNumberOfGuests() {

    }

    @And("^I click \"([^\"]*)\"$")
    public void iClick(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I see list of all Tours available in chosen date for two people$")
    public void iSeeListOfAllToursAvailableInChosenDateForTwoPeople() {
    }
}
