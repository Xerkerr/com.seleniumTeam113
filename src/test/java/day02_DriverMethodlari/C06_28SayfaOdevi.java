package day02_DriverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_28SayfaOdevi {

      //2. Amazon soyfasina gidelim. https://www.amazon.com/
      //3. Sayfanin konumunu ve boyutlarini yazdirin
      //4. Sayfayi simge durumuna getirin
      //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
      //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
      //7. Sayfayi fullscreen yapin
      //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
      //9. Sayfayi kapatin
      public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","src/resources/chromedriver_win32/chromedriver.exe");
          WebDriver driver = new ChromeDriver();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


          driver.get("https://www.amazon.com/");
          System.out.println("Sayfanın başlangıçta açılış boyutu: " +driver.manage().window().getSize());
          System.out.println("Sayfanın başlangıçta açılış pozisyonu" +driver.manage().window().getPosition());


          driver.manage().window().minimize();
          Thread.sleep(3000);
          driver.manage().window().maximize();

          System.out.println("Sayfanın güncellenmiş açılış boyutu: " +driver.manage().window().getSize());
          System.out.println("Sayfanın güncellenmiş açılış pozisyonu" +driver.manage().window().getPosition());

          driver.manage().window().fullscreen();

          System.out.println("Fullscreen pozisyonu : " + driver.manage().window().getPosition());
          System.out.println("Fullscreen boyutu : " +driver.manage().window().getSize());

          driver.close();

      }

}
