package com.finexus.tests; import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Wholesale {
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
  public void testWholesale() throws Exception {
    driver.get("https://www.everlast.com/");
    driver.findElement(By.id("ui-id-2")).click();
    driver.findElement(By.id("frontpage-nosto-1")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Powered by'])[1]/following::div[5]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='You have no items in your shopping cart.'])[1]/following::div[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Shipping Information'])[1]/following::li[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Careers'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FAQ'])[1]/following::h6[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='FAQ'])[1]/following::h6[1]")).click();
    driver.findElement(By.linkText("Wholesale")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wholesale Information'])[2]/following::h3[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wholesale Information'])[2]/following::div[5]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Copy of your Federal Tax I.D. number'])[1]/following::li[1]")).click();
    driver.findElement(By.id("maincontent")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wholesale Information'])[2]/following::div[5]")).click();
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
