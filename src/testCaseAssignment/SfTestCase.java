package testCaseAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

public class SfTestCase extends ReusableMethods {
	
	public static void main(String args[]) throws InterruptedException {
		InitializeDriver();
		CreateReport();
		//TC_1_LoginToSalesForce();	
		//C_2_LoginToSalesForce();
		//TC_3_LoginToSalesForce();
		//TC_4_LoginToSalesForce();
		//TC_4B_LoginToSalesForce();
		//TC_5_LoginToSalesForce();
		//TC_6_LoginToSalesForce();
		TC_7_LoginToSalesForce();
		//TC_8_LoginToSalesForce();
		//TC_9_LoginToSalesForce();
		CloseBrowser();
		CloseReport();
		
	}
	
	public static void TC_1_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("1TC_1_LoginToSalesForce");
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.clear();
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	
	public static void TC_2_LoginToSalesForce() {
		logger = report.startTest("2TC_2_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.PASS,"User is on home page");
			
		}
		else {
			logger.log(LogStatus.FAIL,"Home page is not Launched");
		}
	}
	public static void TC_3_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("3TC_3_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement RememberMe = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		RememberMe.click();
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.PASS,"User is on home page");
			
		}
		else {
			logger.log(LogStatus.FAIL,"Home page is not Launched");
		}
		WebElement RamyaEnaganti = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		RamyaEnaganti.click();
		Thread.sleep(3000);	
		WebElement logOut = driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		logOut.click();	
		Thread.sleep(3000);	
		driver.close();
		Thread.sleep(3000);	
		
		
	}	
	
	public static void TC_4_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("4TC_4_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement ForgtPwd = driver.findElement(By.xpath("//a[@id='forgot_password_link']"));
		ForgtPwd.click();
		Thread.sleep(3000);
		WebElement Usrname = driver.findElement(By.xpath("//input[@id='un']"));
		Usrname.sendKeys("ramya@enaganti.com");
		WebElement Continue = driver.findElement(By.xpath("//input[@id='continue']"));
		Continue.click();
	}
	
	public static void TC_4B_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("4TC_4B_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Successfully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("123");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("22131");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		Thread.sleep(3000);
		}
	
	public static void TC_5_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("5TC_5_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			logger.log(LogStatus.PASS,"User is on home page");
			
		}
		else {
			logger.log(LogStatus.FAIL,"Home page is not Launched");
		}
		WebElement UsrMenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		UsrMenu.click();
		Thread.sleep(3000);			
		driver.close();			
	}	
	
	//********TestCase not executed*********
	public static void TC_6_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("6TC_6_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement UsrMenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		UsrMenu.click();
		WebElement MyProfile = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]"));
		MyProfile.click();
		Thread.sleep(3000);
		WebElement EditProfile = driver.findElement (By.xpath("//*[@class=\"editPen\"]"));
		EditProfile.click();
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {

	        driver.switchTo().window(winHandle);	        
	        Thread.sleep(3000);	       
		}    
		WebElement AboutBtn = driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
		AboutBtn.click();
		Thread.sleep(3000);
		WebElement LastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		LastName.clear();
		LastName.sendKeys("Enaganti1");
		Thread.sleep(3000);
		WebElement SaveAll = driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		SaveAll.click();
		driver.switchTo().window(winHandleBefore);
		WebElement Post = driver.findElement(By.xpath("//span[contains(@class,'publisherattachtext')][contains(text(),'Post')]"));
		Post.click();
		driver.switchTo().frame("iframe");
		WebElement EnterText = driver.findElement(By.xpath("//*[@id=\"cke_39_contents\"]"));
		EnterText.sendKeys("Hi! Iam learning Selenium");
		WebElement ShareBtn = driver.findElement(By.xpath("//input[@id='publishersharebutton']"));
		ShareBtn.click();	
	}
	public static void TC_7_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("7TC_7_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement UsrMenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		UsrMenu.click();
		Thread.sleep(3000);
		WebElement MySettingsBtn = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
		MySettingsBtn.click();
		Thread.sleep(3000);
		WebElement Persnl = driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
		Persnl.click();
		Thread.sleep(3000);
		WebElement LoginHstry = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		LoginHstry.click();
		Thread.sleep(3000);
		WebElement Dsply_Layout = driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
		Dsply_Layout.click();
		Thread.sleep(3000);
		WebElement CstmzeMyTab = driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
		CstmzeMyTab.click();
		Thread.sleep(3000);
		Select CstmApp = new Select(driver.findElement(By.xpath("//select[@id='p4']")));		
		CstmApp.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(3000);
		Select AvlbleApps = new Select(driver.findElement(By.xpath("//select[@id='duel_select_0']")));
		AvlbleApps.selectByVisibleText("Reports");
		Thread.sleep(3000);
		WebElement AddBtn = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
		AddBtn.click();
		Thread.sleep(3000);
		//WebElement SaveBtn = driver.findElement(By.xpath("//input[@name='save']"));
		//SaveBtn.click();
		//Thread.sleep(3000);
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"EmailSetup_font\"]"));
		Email.click();
		Thread.sleep(3000);
		WebElement MyEmailSetting = driver.findElement(By.xpath("//div[@class='setupHighlightLeaf']"));
		MyEmailSetting.click();
		Thread.sleep(3000);
		WebElement Calndr_Remndr = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
		Calndr_Remndr.click();
		WebElement ActvtyRmndr = driver.findElement(By.xpath("//span[@id='Reminders_font']"));
		ActvtyRmndr.click();
		Thread.sleep(3000);
		WebElement OpnTstRmndr = driver.findElement(By.xpath("//input[@id='testbtn']"));
		OpnTstRmndr.click();
		
		
		
		
	}
	
	public static void TC_8_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("8TC_8_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement UsrMenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		UsrMenu.click();
		Thread.sleep(3000);
		WebElement DvlprCnsl = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[3]"));
		DvlprCnsl.click();
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {

	        driver.switchTo().window(winHandle);
	        driver.quit();
	        Thread.sleep(3000);
	        driver.switchTo().window(winHandleBefore);
		}    
		
	
	}
	
	public static void TC_9_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("9TC_9_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		Thread.sleep(3000);
		WebElement UsrMenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		UsrMenu.click();
		Thread.sleep(3000);
		WebElement LogOut = driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
		LogOut.click();
		Thread.sleep(3000);
	}
	
	
	
	
	

}
