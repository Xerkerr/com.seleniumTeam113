package day04_xpath_cssSElector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
//2- Add Element butonuna basin
//3- Delete butonu’nun gorunur oldugunu test edin
//4- Delete tusuna basin
//5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

//1
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        Thread.sleep(3000);
//2
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//3
        WebElement deleteButonu = driver.findElement(By.xpath("//button[@class='added-manually']"));
        if (deleteButonu.isDisplayed()){
            System.out.println("Delete button testi PASSED");
        }else {
            System.out.println("Delete button testi FAILED");
        }
        Thread.sleep(2000);
//4
        deleteButonu.click();
//5
        WebElement addbutonu = driver.findElement(By.xpath("//h3"));
        if (addbutonu.isDisplayed()){
            System.out.println("Add/Remove Elements testi PASSED");
        }else {
            System.out.println("Add/Remove Elements testi FAILED");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
