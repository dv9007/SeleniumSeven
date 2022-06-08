package org.example;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;



public class DriveManager extends Utils

{



    static String browserName = "Chrome";
    public  void openURL() {


        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");

            //Open Chrome
            driver = new ChromeDriver();


        }else if (browserName.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver","src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else {

            System.out.println("Either your name is wrong or not provided  : " + browserName);
        }

        //Duration to be wait

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

    }
        public void closeURL(){
        driver.quit();
}
    }

