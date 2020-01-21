package com.finexus.tests; import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShippingInformation {
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
  public void testShippingInformation() throws Exception {
    driver.get("https://www.everlast.com/");
    driver.findElement(By.id("ui-id-2")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='You have no items in your shopping cart.'])[1]/following::div[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Careers'])[1]/following::h6[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='o'])[3]/following::div[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Size Charts'])[1]/following::li[1]")).click();
    driver.findElement(By.linkText("Shipping Information")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[8]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SHIPPING INFORMATION'])[1]/following::p[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SHIPPING INFORMATION'])[1]/following::img[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SHIPPING INFORMATION'])[1]/following::span[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='SHIPPING INFORMATION'])[1]/following::span[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[8]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::div[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='If your order includes multiple items, they may ship in multiple packages on different days.'])[1]/following::strong[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SHIPPING INFORMATION'])[1]/following::p[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SHIPPING INFORMATION'])[1]/following::p[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='General'])[1]/following::h3[1]")).click();
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
