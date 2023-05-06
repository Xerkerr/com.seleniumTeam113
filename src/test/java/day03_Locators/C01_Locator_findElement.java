package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locator_findElement {
    //amazon anasayfaya gidin
    //arama kutusuna nutella yazdırıp
    //enter tusuna basarak arama yapın
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
/*
test otomasyonu yaparken bir web elementi kullanmak istersek iki şeye ihtiyarcımız var
1-o web elementi benzersiz olarak tarif edebileceğimiz bir locator.
2-bu locator u söylediğimizde bize web elementi bulup getirecek method.
örneğin amazon sitesindeki arama kutusunun unique tarif edicisi olarak
 id="twotabsearchtextbox" kullanabiliriz
 */
        WebElement aramaKutusuElementi = driver.findElement(By.id("twotabsearchtextbox"));
               //data türü objenin adı = findElement : webelementi bulan method
               //                        By: webelementi bulacağımız locator in turunu yazdığımız method
               //                        twotabsearchtextbox : unique tarif için id attribute degeri.

        /*
        findElement() verdiğimiz locator turu ve o locator icin verdiğimiz değere göre webelement'i arar
        locator icin verdiğimiz değer hatalıysa veya locator stratejisinde hata yaptıysak aranan web elementi implicitlyWait
        olarak tanımladığımız maximum süre boyunca arar.
        bulamadığı için "NoSuchElementExeception" fırlatır ve kodların kalanını çalıştırmaz
         */

        aramaKutusuElementi.sendKeys("Nutella");
        //istenen web elemente istenen yazıyı gönderir

        //enter tuşuna basarak arama yapın
        aramaKutusuElementi.submit();
        //istenen webelementi uzerinde enter tusuna basar




        Thread.sleep(3000);
        driver.close();

    }
}
