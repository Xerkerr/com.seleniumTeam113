package day05_relativeLocators_maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ZeroWebapp {//1. http://zero.webappsecurity.com sayfasina gidin

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
//2. Signin buttonuna tiklayin
         driver.findElement(By.id("signin_button")).click();
//3. Login alanine  “username” yazdirin
        WebElement loginKutusu = driver.findElement(By.id("user_login"));
        loginKutusu.sendKeys("username");
//4. Password alanina “password” yazdirin
 
//5. Sign in buttonuna tiklayin
//6. Back tusu ile sayfaya donun
//7. Online Banking menusunden Pay Bills sayfasina gidin
//8. amount kismina yatirmak istediginiz herhangi bir miktari yazin
//9. tarih kismina “2020-09-10” yazdirin
//10. Pay buttonuna tiklayin
//11. “The payment was successfully submitted.” mesajinin ciktigini test edin
    }

}
