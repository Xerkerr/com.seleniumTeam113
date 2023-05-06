package day04_xpath_cssSElector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//1- bir class olusturun
//2- https://www.amazon.com/ adresine gidin
//3- Browseri tam sayfa yapin
//4- Sayfayi “refresh” yapin
//5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
//6- Gift Cards sekmesine basin
//7- Birthday butonuna basin
//8- Best Seller bolumunden ilk urunu tiklayin
//9- Gift card details’den 25 $i secin
//10-Urun ucretinin 25$ oldugunu test edin
//11-Sayfayi kapatin
public class C04_CssSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//2
        driver.get("https://www.amazon.com/");
//3
        driver.manage().window().fullscreen();
//4
        driver.navigate().refresh();
//5
        String expectedIcerik = "Spend less";
        String actualIcerik = driver.getTitle();

        if (actualIcerik.contains(expectedIcerik)) System.out.println("Başlık Spend less içeriyor, test başarılı ");
        else System.out.println("Başlık Spend Less içermiyor, test başarısız");
//6
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
//7
        driver.findElement(By.xpath("//img[@alt='Birthday']")).click();
//8
        driver.findElement(By.xpath("//div[@class='a-section a-spacing-mini a-spacing-top-micro acs-product-block__product-image'])[1]")).click();

        //driver.close();
    }
}
