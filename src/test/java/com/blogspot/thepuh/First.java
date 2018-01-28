package com.blogspot.thepuh;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class First {

  //  @BeforeClass
    public static void openChrome() {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://youtube.com");
        driver.findElement(By.cssSelector("#search")).sendKeys("Денчик грудные");
        driver.findElement(By.cssSelector("#search-icon-legacy > yt-icon")).click();
    }

}
