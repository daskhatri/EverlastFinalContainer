package com.finexus.tests; import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.*;

import com.finexus.util.TestUtil;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoCorectUserName {
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

  @DataProvider
	public Object[][] getLoginData() {
		Object data[][] = TestUtil.getTestData("LoginOnly");
		return data;
	}
  @Test(dataProvider = "getLoginData")
  public void testAutoCorectUserName(String userName, String password, String loginUrl) throws Exception {
	  driver.get(loginUrl);
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[3]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[3]/following::a[1]")).click();
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(userName);
	    driver.findElement(By.id("pass")).click();
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys(password);
	    driver.findElement(By.id("login-form")).submit();
	    
	    driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
	    boolean exists = driver.findElements( By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div") ).size() != 0;
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	    String msgIndication = driver.findElement().getText();
	   
	    Thread.sleep(5000);
		String txnMessage = driver
				.findElement(By.xpath("//*[@id=\"messages\"]/tbody/tr[2]/td[2]/table[2]/tbody/tr/td")).getText();

		if (txnMessage.toLowerCase().indexOf("Txn Complete".toLowerCase()) == -1) {
			// Call take screenshot function
//			T24AuthorizationFailCase.takeSnapShot(driver, "D://test.png");
			throw new Exception("Transaction failed");
		}
	    String diplayedMsg;
	    if(exists) {
	    	diplayedMsg = driver.findElement( By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div") ).getText();
	    	if(diplayedMsg.toLowerCase().contains("The account sign-in was incorrect")) {
	    		tearDown();
	    	}
	    }
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contact Information'])[1]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Request a password to change your account password.'])[1]/following::button[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Search'])[3]/following::span[1]")).click();
	    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wishlist'])[2]/following::a[1]")).click();
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
