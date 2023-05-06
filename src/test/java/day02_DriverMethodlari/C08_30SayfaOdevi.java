package day02_DriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.TreeMap;

public class C08_30SayfaOdevi {

    //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin
    //(title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi
    //yazdirin.
    //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
    //“actual” URL’i yazdirin.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com/");

        System.out.println("Mevcut başlığı : " + driver.getTitle());
        String expectediçerik = "facebook";
        String actualtitle = driver.getTitle();


        if (actualtitle.contains(expectediçerik)) System.out.println("Title facebook içeriyor, test başarılı");
        else System.out.println("Title facebook içermiyor, test başarısız");

        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectediçerik)) System.out.println("URL facebook iceriyor test PASSED");
        else System.out.println("Gecerli URL : " + actualUrl);

        //4.https://www.walmart.com/ sayfasina gidin.
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.


        driver.get("https://www.walmart.com/");
        expectediçerik = "Walmart.com";
        if (actualtitle.contains(expectediçerik)) System.out.println("Tittle walmart.com iceriyor test PASSED");
        else System.out.println("Tittle walmart.com icermiyor test FAILED : " + driver.getTitle());

        //6. Tekrar “facebook” sayfasina donun
        //7. Sayfayi yenileyin
        //8. Sayfayi tam sayfa (maximize) yapin
        //9.Browser’i kapatin

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.close();
}}
