import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
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
        ovladac.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
    }

    @When("Uzivatel zada sve jmeno {string}")
    public void uzivatelZadaSveJmeno(String jmeno) {
        ovladac.findElement(By.id("name")).sendKeys(jmeno);
    }

    @And("Uzivatel zada svoj email {string}")
    public void uzivatelZadaSvojEmail(String email) {
        ovladac.findElement(By.id("email")).sendKeys(email);
    }

    @And("Uzivatel klikne na pohlavi {string}")
    public void uzivatelKlikneNaPohlavi(String pohlavi) {
        if (pohlavi.equals("male")){
            ovladac.findElement(By.id("gender")).click();
        } else if (pohlavi.equals("female")) {
            ovladac.findElement(By.xpath("//*[@id=\"practiceForm\"]/div[3]/div/div/div[2]/input")).click();
        }

    }

    @Then("Radiobutton male je zaskrtnute")
    public void radiobuttonMaleJeZaskrtnute() {
    }

    @Then("Radiobutton male je odskrtnuty")
    public void radiobuttonMaleJeOdskrtnuty() {
    }
}
