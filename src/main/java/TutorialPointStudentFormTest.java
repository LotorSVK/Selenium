import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TutorialPointStudentFormTest {

    private WebDriver ovladac;



    @Given("Uzivatel je na stranke tutorial point student form")
    public void uzivatelJeNaStrankeTutorialPointStudentForm() {
    }

    @When("Uzivatel zada sve jmeno {string}")
    public void uzivatelZadaSveJmeno(String jmeno) {

    }

    @And("Uzivatel zada svoj email {string}")
    public void uzivatelZadaSvojEmail(String email) {

    }

    @And("Uzivatel klikne na pohlavi {string}")
    public void uzivatelKlikneNaPohlavi(String pohlavi) {

    }

    @Then("Radiobutton male je zaskrtnute")
    public void radiobuttonMaleJeZaskrtnute() {
    }

    @Then("Radiobutton male je odskrtnuty")
    public void radiobuttonMaleJeOdskrtnuty() {
    }
}
