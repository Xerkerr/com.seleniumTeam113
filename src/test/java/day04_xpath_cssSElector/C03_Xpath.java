package day04_xpath_cssSElector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

//1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//2- Add Element butonuna basin
//3- Delete butonu’nun gorunur oldugunu test edin
//4- Delete tusuna basin
//5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
public class C03_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

//1
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
//2
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
//3
        WebElement deleteButonu = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if (deleteButonu.isDisplayed()) System.out.println("Delete buton testi Başarılı");
        else System.out.println("Delete butonu başarısız");
//4
        deleteButonu.click();
//5
        WebElement addremovetest = driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
        if (addremovetest.isDisplayed()) System.out.println("Add/Remove Elements yazısı görünüyor");
        else System.out.println("Add/Remove Elements yazısı gözükmüyor");

        driver.close();

    }
}
