import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialPointStudentFormTest {

    private WebDriver ovladac;

    @Before
    public void totoNastanePredKazdymTestem(){
        WebDriverManager.chromedriver().setup();
        ovladac = new ChromeDriver();
    }

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
