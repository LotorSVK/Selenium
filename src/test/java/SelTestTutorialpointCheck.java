import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class SelTestTutorialpointCheck {

    private WebDriver ovladac;

    @BeforeEach
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\edwin\\OneDrive\\Počítač\\Nový Kod\\SeleniumSkillmea\\src\\main\\resources\\chromedriver.exe");
        //ovladac = new ChromeDriver();



        WebDriverManager.chromedriver().setup();
        ovladac = new ChromeDriver();
    }
    @AfterEach
    public void tearDown(){
        ovladac.quit();
    }

    @Test
    public void checkboxTest(){

        //Prepnutie na stránku
        ovladac.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
        //Nájdenie plus Elementu
        ovladac.findElement(By.xpath("//*[@id=\"bs_1\"]/span[1]")).click();
        //Klikni na checkboxy
        ovladac.findElement(By.id("c_bf_1")).click();
        ovladac.findElement(By.id("c_bf_2")).click();


        assertTrue(ovladac.findElement(By.id("c_bs_1")).isSelected());

    }

}
