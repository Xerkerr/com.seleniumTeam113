package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_findElements {    public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    driver.get("https://www.amazon.com");


//1- Bir test class’i olusturun ilgili ayarlari yapin

//2- https://www.automationexercise.com/ adresine gidin
    driver.get("https://www.automationexercise.com/");
//3- Category bolumundeki elementleri locate edin
        List<WebElement> categoryElementsList = driver.findElements(By.className("panel-title"));
//4- Category bolumunde 3 element oldugunu test edin
        int expectedSize = 3;
        int actualSize = categoryElementsList.size();

        if(expectedSize == actualSize){
            System.out.println("category element testi passed");
        }else{
            System.out.println("category element testi failed");
        }

//5- Category isimlerini yazdirin

   /*
    System.out.println(categoryElementsList);
    normalde bir list direk yazdırılabilir ancak findElements() ile bulunan elementler
    Webelement olduğundan direk yazdırılamaz.

    bir for-each loop kullanılarak listenin elementleri yazdırılabilir.
    */

    for (WebElement eachElement:categoryElementsList
         ) {
        System.out.println(eachElement.getText() +" ");

    }
//6- Sayfayi kapatin

    Thread.sleep(3000);
    driver.close();
    }
}
