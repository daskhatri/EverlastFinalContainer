package com.finexus.tests; import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PdpNavigation {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPdpNavigation() throws Exception {
    driver.get("https://www.everlast.com/");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[18]")).click();
    driver.findElement(By.id("frontpage-nosto-1")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::img[3]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Women'])[2]/following::div[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Set Descending Direction'])[1]/following::ol[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Set Descending Direction'])[1]/following::ol[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New'])[3]/following::a[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | index=2 | ]]
    driver.findElement(By.id("option-label-color-92-item-1146")).click();
    driver.findElement(By.id("option-label-color-92-item-1150")).click();
    driver.findElement(By.id("option-label-color-92-item-1143")).click();
    driver.findElement(By.id("option-label-size-174-item-161")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='View Details'])[1]/following::div[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [selectFrame | relative=parent | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='JOIN'])[1]/preceding::button[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[8]")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
