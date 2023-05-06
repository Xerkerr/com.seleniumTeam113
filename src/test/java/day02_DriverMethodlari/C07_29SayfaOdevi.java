package day02_DriverMethodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_29SayfaOdevi {

//2. Amazon soyfasina gidelim. https://www.amazon.com/
//3. Sayfanin konumunu ve boyutlarini yazdirin
//4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
//5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
//8. Sayfayi kapatin
public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://www.amazon.com/");
    System.out.println(driver.manage().window().getSize()+""+driver.manage().window().getPosition());

    driver.manage().window().setPosition(new Point(25,25));
    driver.manage().window().setSize(new Dimension(100,100));

    System.out.println(driver.manage().window().getSize()+""+driver.manage().window().getPosition());

    driver.close();
}
}
