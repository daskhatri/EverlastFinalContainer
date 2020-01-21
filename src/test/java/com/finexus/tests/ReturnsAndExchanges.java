package com.finexus.tests; import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReturnsExchanges {
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
  public void testReturnsExchanges() throws Exception {
    driver.get("https://www.everlast.com/");
    driver.findElement(By.id("ui-id-2")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='You have no items in your shopping cart.'])[1]/following::div[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Customer Service'])[1]/following::ul[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[3]/following::footer[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[3]/following::div[13]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Loading...'])[3]/following::div[13]")).click();
    driver.findElement(By.linkText("Returns & Exchanges")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[8]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[8]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='This policy does not cover normal wear and tear that results from the use of our products.'])[1]/following::b[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='This policy does not cover normal wear and tear that results from the use of our products.'])[1]/following::b[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='This policy does not cover normal wear and tear that results from the use of our products.'])[1]/following::b[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='This policy does not cover normal wear and tear that results from the use of our products.'])[1]/following::strong[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='This policy does not cover normal wear and tear that results from the use of our products.'])[1]/following::strong[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='This policy does not cover normal wear and tear that results from the use of our products.'])[1]/following::font[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='This policy does not cover normal wear and tear that results from the use of our products.'])[1]/following::font[2] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Please ensure package is being sent to correct address for all returns and exchanges:'])[1]/following::font[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Moberly, MO 65270'])[1]/following::font[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Moberly, MO 65270'])[1]/following::font[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Moberly, MO 65270'])[1]/following::li[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Moberly, MO 65270'])[1]/following::li[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='EVERLAST RETURN & EXCHANGE POLICY COMPLETE DETAILS:'])[1]/following::ul[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='EVERLAST RETURN & EXCHANGE POLICY COMPLETE DETAILS:'])[1]/following::ul[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='here'])[1]/following::font[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Everlast Customer Service'])[1]/following::font[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[8]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RETURNS & EXCHANGES'])[1]/following::h5[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='RETURNS & EXCHANGES'])[1]/following::h5[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RETURNS & EXCHANGES'])[1]/following::h5[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='RETURNS & EXCHANGES'])[1]/following::h5[1]")).click();
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
