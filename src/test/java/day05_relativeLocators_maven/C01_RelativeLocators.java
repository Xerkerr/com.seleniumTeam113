package day05_relativeLocators_maven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

//1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html adresine gidin
//2 ) Berlin’i 3 farkli relative locator ile locate edin
//3 ) Relative locator’larin dogru calistigini test edin

public class C01_RelativeLocators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));




    }
}
