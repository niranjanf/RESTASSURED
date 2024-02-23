package new2;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.time.Duration;import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.codehaus.plexus.util.Expand;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class test {
	
	
	
@Test(priority = 1,enabled = false)
public void logintest() throws InterruptedException {

	//	System.setProperty("webdriver,chrome,driver", "C:\\Users\\Hp\\eclipse-workspace\\new2\\target\\chromedriver.exe");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();
    driver.manage().window().maximize();
	
	
	driver.get("https://oriz-gacha-dev-23.netlify.app/");
	driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
	driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
    driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("N4uX2]bSD13");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'プレイされる前に必ずお読みください。')]")));
	String coins =  driver.findElement(By.xpath("//a[contains(text(),'プレイされる前に必ずお読みください。')]")).getText();
    Assert.assertEquals(coins, "プレイされる前に必ずお読みください。");
  
   

	}
@Test(priority = 2,enabled = false)
	public void Onegacha() throws InterruptedException,IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://oriz-gacha-dev-23.netlify.app/");
		  driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
		  driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
		  driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("N4uX2]bSD13");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
	
    
    
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'mt-8 grid grid-cols-2')]//div[1]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();
	WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'1回引く')]")));
		
driver.findElement(By.xpath("//button[contains(text(),'1回引く')]")).click();
//	 
	// driver.findElement(By.xpath("//button[@class='glow-on-hover hover:scale-110 transition-all delay-50 white relative flex text-primary justify-center px-12 py-5 text-center']")).click();
	driver.findElement(By.xpath("//span[@class='text-center']")).click();
	
	
	WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(5));
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'スキップ')]")));
   driver.findElement(By.xpath("//button[contains(text(),'スキップ')]")).click();   
    String Actualstring = driver.findElement(By.xpath("//button[contains(text(),'発送商品を選ぶ')]")).getText();
     Assert.assertEquals(Actualstring, "発送商品を選ぶ");
     
     Thread.sleep(3000);
     
}
@Test(priority = 3,enabled = false)
public void Tengacha() throws InterruptedException{
//login
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();	
    driver.manage().window().maximize();
    driver.get("https://oriz-gacha-dev-23.netlify.app/");
	  driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
	  driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
	  driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("N4uX2]bSD13");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
	Thread.sleep(3000);
driver.findElement(By.xpath("//div[contains(@class,'mt-8 grid grid-cols-2')]//div[1]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='glow-on-hover hover:scale-110 transition-all delay-50 white relative flex text-primary justify-center px-12 py-5 text-center']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[@class='text-center']")).click();
WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));

wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'スキップ')]")));
driver.findElement(By.xpath("//button[contains(text(),'スキップ')]")).click();
String Actualstring = driver.findElement(By.xpath("//button[contains(text(),'発送商品を選ぶ')]")).getText();
Assert.assertEquals(Actualstring, "発送商品を選ぶ");
}
@Test(priority = 4,enabled = false)
public void changePasswordAndsetAsITis() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();	
    driver.manage().window().maximize();
    driver.get("https://oriz-gacha-dev-23.netlify.app/");
	  driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
	  driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
	  driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("N4uX2]bSD13");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'パスワードの変更')]")).click();
	
	
WebElement currentpass=	driver.findElement(By.xpath("//input[@id='currentPassword']"));

WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(5));
wait3.until(ExpectedConditions.elementToBeClickable(currentpass));
//password  change first time
currentpass.click();
currentpass.sendKeys("N4uX2]bSD13");
	driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("Pass@123");
	driver.findElement(By.xpath("//input[@id='passwordConfirm']")).sendKeys("Pass@123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(4000);
	String mypagebutton = driver.findElement(By.xpath("//span[contains(text(),'My page (当選商品)')]")).getText();
	Assert.assertEquals(mypagebutton, "My page (当選商品)");
	
	driver.findElement(By.xpath("//button[contains(text(),'ログアウト')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@type='button'][contains(text(),'ログアウト')]")).click();
	 String forgetpassbutton =driver.findElement(By.xpath("//a[contains(text(),'パスワードを忘れた方?')]")).getText();
	
	Assert.assertEquals(forgetpassbutton,"パスワードを忘れた方?");
	//again login
	// driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
	  driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
	  driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("Pass@123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'パスワードの変更')]")).click();
	Thread.sleep(4000);
	driver.navigate().refresh();
	
	//again password change
	// verifying if the WebElement is stale
	WebElement currentnewpass=	driver.findElement(By.xpath("//input[@id='currentPassword']"));
	boolean isNameHtmlElementStale = ExpectedConditions.stalenessOf(currentnewpass).apply(driver);

	// if the element is stale
	if (isNameHtmlElementStale) {
	    // re-retrieving the desired input HTML element
	    currentnewpass = driver.findElement(By.xpath("//input[@id='currentPassword"));
	}

	// now currentpass is no longer stale

	// performing the desired operation on nameHtmlElement
	currentnewpass.sendKeys("Pass@123");
//WebElement currentnewpass=	driver.findElement(By.xpath("//input[@id='currentPassword']"));
	driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("N4uX2]bSD13");
	driver.findElement(By.xpath("//input[@id='passwordConfirm']")).sendKeys("N4uX2]bSD13");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	String mypagebuttonnew = driver.findElement(By.xpath("//span[contains(text(),'My page (当選商品)')]")).getText();
	Assert.assertEquals(mypagebutton, "My page (当選商品)");
driver.close();

}
@Test(priority = 5,enabled = false)
public void logout() throws InterruptedException {
	//login
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://oriz-gacha-dev-23.netlify.app/");
		  driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
		  driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
		  driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("N4uX2]bSD13");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
	//	driver.findElement(By.xpath("driver.findElement(By.xpath(\"//*[name()='path' and contains(@fill-rule,'evenodd')]\")).click();"));
		driver.findElement(By.xpath("//button[contains(text(),'ログアウト')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button'][contains(text(),'ログアウト')]")).click();
		String createnewaccounttext = driver.findElement(By.xpath("//p[@class='text-textPrimary text-sm']")).getText();
		Assert.assertEquals(createnewaccounttext, "Create An Account 新規登録");
		
}


@Test(priority = 6,enabled = true)
	public void infolinksOnsettingpage() throws InterruptedException,ElementClickInterceptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();	
	    driver.manage().window().maximize();
	    driver.get("https://oriz-gacha-dev-23.netlify.app/");
		  driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
		  driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
		  driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("N4uX2]bSD13");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[name()='path' and contains(@fill-rule,'evenodd')]")).click();
	     driver.findElement(By.xpath("//span[contains(text(),'運営会社')]")).click();
	   String oepratingComapanyLink2=  driver.getCurrentUrl();
	   Assert.assertEquals(oepratingComapanyLink2, "https://orizum.jp/");
	   Thread.sleep(3000);
	   driver.navigate().back();
	 
	  	   driver.findElement(By.xpath("//span[contains(text(),'利用規約')]")).click();
	   String termsOfconditions2 = driver.getCurrentUrl();
	   Assert.assertEquals(termsOfconditions2,"https://oriz-gacha-dev-23.netlify.app/terms");
driver.navigate().back();

driver.findElement(By.xpath("//span[contains(text(),'プライバシーポリシー')]")).click();
String privacyPolicy = driver.getCurrentUrl();
Assert.assertEquals(privacyPolicy, "https://oriz-gacha-dev-23.netlify.app/privacy");
driver.navigate().back();
driver.findElement(By.xpath("//span[contains(text(),'特定商取引法に基づく表記')]")).click();

String commercialLaw = driver.getCurrentUrl();
Assert.assertEquals(commercialLaw, "https://oriz-gacha-dev-23.netlify.app/tradelaw");
driver.navigate().back();
driver.findElement(By.xpath("//span[contains(text(),'お問い合わせ')]")).click();
 String inquiry = driver.getCurrentUrl();
 Assert.assertEquals(inquiry, "https://oriz-gacha-dev-23.netlify.app/inquiry");
 Thread.sleep(3000);
 driver.findElement(By.xpath("//input[@id='phone-number']")).sendKeys("9834774946");
 Actions act =  new Actions(driver);
 act.sendKeys(Keys.ENTER);
 driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("dckn434!@12");
  driver.findElement(By.xpath("//button[contains(text(),'送信する')]")).click();
  Thread.sleep(3000);
  String settinpage = driver.getCurrentUrl();
  Assert.assertEquals(settinpage, "https://oriz-gacha-dev-23.netlify.app/settings");
  //adressupdatefrom setting
  driver.findElement(By.xpath("//span[contains(text(),'商品配送住所の設定')]")).click();
  driver.findElement(By.xpath("//input[@id='name']")).clear();
 driver.findElement(By.xpath("//input[@id='name']")).sendKeys("newnameadded");
 driver.findElement(By.xpath("//button[@type='submit']")).click();driver.navigate().back();driver.findElement(By.xpath("//span[contains(text(),'My page (当選商品)')]")).click();
 String mypage = driver.getCurrentUrl();//mypagelinkvalidation
Assert.assertEquals(mypage, "https://oriz-gacha-dev-23.netlify.app/settings/manage");
//driver.findElement(By.xpath("//input[@id='phone-number']")).sendKeys("9834774946");
//Actions act2 =  new Actions(driver);
//act2.sendKeys(Keys.ENTER);
//driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("dckn434!@12");
// driver.findElement(By.xpath("//button[contains(text(),'送信する')]")).click();
//
//
// 
  
 }
@Test(priority = 7,enabled = false)
public void Homepagelinks() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();	
    driver.manage().window().maximize();
    driver.get("https://oriz-gacha-dev-23.netlify.app/");
	driver.findElement(By.xpath("//button[contains(text(),'ログイン・新規登録')]")).click();
	driver.findElement(By.xpath("//input[@id='login_email']")).sendKeys("banktest@test.com");
    driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("N4uX2]bSD13");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click(); 
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor)(driver);
	js.executeScript("window.scrollBy(0,800)");
	 driver.findElement(By.xpath("//a[contains(text(),'運営会社')]")).click();
	   String oepratingComapanyLink=  driver.getCurrentUrl();
	   Assert.assertEquals(oepratingComapanyLink, "https://orizum.jp/");
	   driver.navigate().back();
	   js.executeScript("window.scrollBy(0,800)");
	   driver.findElement(By.xpath("//a[contains(text(),'利用規約')]")).click();
	   String termsOfconditions = driver.getCurrentUrl();
	   Assert.assertEquals(termsOfconditions,"https://oriz-gacha-dev-23.netlify.app/terms");
	   driver.navigate().back();
	   js.executeScript("window.scrollBy(0,800)");
	   driver.findElement(By.xpath("//a[contains(text(),'プライバシーポリシー')]")).click();
	   String privacyPolicy = driver.getCurrentUrl();
	   Assert.assertEquals(privacyPolicy, "https://oriz-gacha-dev-23.netlify.app/privacy");
	   driver.navigate().back();
	   js.executeScript("window.scrollBy(0,800)");
	   driver.findElement(By.xpath("//a[contains(text(),'特定商取引法に基づく表記')]")).click();
	   String commercialLaw = driver.getCurrentUrl();
	   Assert.assertEquals(commercialLaw, "https://oriz-gacha-dev-23.netlify.app/tradelaw");
	   driver.navigate().back();
	   js.executeScript("window.scrollBy(0,800)");
	   driver.findElement(By.xpath("//a[contains(text(),'お問い合わせ')]")).click();
	    String inquiry = driver.getCurrentUrl();
	    Assert.assertEquals(inquiry, "https://oriz-gacha-dev-23.netlify.app/inquiry");
	    driver.findElement(By.xpath("//input[@id='phone-number']")).sendKeys("9834774946");
	    Actions act= new Actions(driver);
	    act.sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("bhjdbsjcbsdcjbj32732");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(3000);
	    String homepagelink = driver.getCurrentUrl();
	    Assert.assertEquals(homepagelink, "https://oriz-gacha-dev-23.netlify.app/");
	    
	    
	   
	   

}
	
	

@AfterMethod(enabled = false)
public void teardown() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();	
	driver.close();
	
}
	
	
	
	

}
