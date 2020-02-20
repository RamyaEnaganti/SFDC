package testCaseAssignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.Alert;
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
		//TC_7_LoginToSalesForce();
		//TC_8_LoginToSalesForce();
		//TC_9_LoginToSalesForce();
		//TC_10_LoginToSalesForce();
		//TC_11_LoginToSalesForce();
		//TC_12_LoginToSalesForce();
		//TC_13_LoginToSalesForce();
		//TC_14_LoginToSalesForce();
		//TC_15_LoginToSalesForce();
		//TC_16_LoginToSalesForce();
		//TC_17_LoginToSalesForce();
		//TC_18_LoginToSalesForce();
		//TC_19_LoginToSalesForce();
		//TC_20_LoginToSalesForce();
		TC_21_LoginToSalesForce();
		
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
	public static void TC_10_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("10TC_10_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();		
		WebElement Acnts=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		Acnts.click();	
		Thread.sleep(3000);
		WebElement NewAcntBtn=driver.findElement(By.xpath("//input[@name='new']"));
		NewAcntBtn.click();
		Thread.sleep(3000);
		WebElement AcntName=driver.findElement(By.id("acc2"));
		AcntName.sendKeys("Test123");
		Select Type = new Select(driver.findElement(By.id("acc6")));		
		Type.selectByVisibleText("Technology Partner");
		Thread.sleep(2000);
		Select CstmrPriority = new Select(driver.findElement(By.id("00N6g00000MmdLI")));		
		CstmrPriority.selectByVisibleText("High");
		WebElement SaveBtn=driver.findElement(By.name("save"));
		SaveBtn.click();
		Thread.sleep(3000);		
	}
	
	
	public static void TC_11_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("11TC_11_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();		
		WebElement Acnts=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		Acnts.click();	
		Thread.sleep(3000);
		WebElement CreateNewView=driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		CreateNewView.click();
		Thread.sleep(3000);
		WebElement ViewName=driver.findElement(By.xpath("//input[@id='fname']"));
		ViewName.sendKeys("Testing1");
		WebElement VwUniqueName=driver.findElement(By.xpath("//input[@id='devname']"));
		VwUniqueName.sendKeys("T123");
		Thread.sleep(3000);
		WebElement SaveBtn=driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']"));
		SaveBtn.click();
		Thread.sleep(3000);			
	}
	
	public static void TC_12_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("12TC_12_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();		
		WebElement Acnts=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		Acnts.click();	
		Thread.sleep(1000);
		Select  ViewDropdwn = new Select(driver.findElement(By.id("fcf")));		
		ViewDropdwn.selectByVisibleText("Testing1");		
		Thread.sleep(2000);
		WebElement EditBtn=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]"));
		EditBtn.click();
		Thread.sleep(2000);
		WebElement ViewName=driver.findElement(By.xpath("//input[@id='fname']"));
		ViewName.clear();
		ViewName.sendKeys("NewTesting1");
		Select  FiltersDrpDown = new Select(driver.findElement(By.id("fcol1")));		
		FiltersDrpDown.selectByVisibleText("Account Name");
		Thread.sleep(2000);
		Select Operator = new Select(driver.findElement(By.id("fop1")));		
		Operator.selectByVisibleText("contains");		
		WebElement Value = driver.findElement(By.xpath("//input[@id='fval1']"));
		Value.sendKeys("a");		
		WebElement Save = driver.findElement(By.name("save"));
		Save.click();	
		Thread.sleep(2000);		
	}
	public static void TC_13_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("13TC_13_LoginToSalesForce");
		TC_10_LoginToSalesForce();
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement Acnts=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		Acnts.click();	
		Thread.sleep(3000);
		WebElement MergeAcnt=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a"));
		MergeAcnt.click();
		Thread.sleep(2000);
		WebElement SearchAcnt = driver.findElement(By.xpath("//input[@id='srch']"));
		SearchAcnt.sendKeys("Test123");
		Thread.sleep(1000);
		WebElement FindBtn = driver.findElement(By.xpath("//input[@name='srchbutton']"));
		FindBtn.click();
		Thread.sleep(1000);
		WebElement NextBtn = driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]"));
		NextBtn.click();
		Thread.sleep(1000);
		WebElement MergeBtn = driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@name,'save')]"));
		MergeBtn.click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(5000);		
	}
	public static void TC_14_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("14TC_14_LoginToSalesForce");		
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		String actualTitle = driver.getTitle();
		driver.manage().window().maximize();
		String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("User is on home page");
		}
		else {
			System.out.println("home page is not Lunched");
		}
		//Opening Accounts page
		WebElement Accounts_Tab = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		Accounts_Tab.click();
		System.out.println("Clicked on Accounts Ta..");
		Thread.sleep(3000);
		Select  ViewDropdwn = new Select(driver.findElement(By.id("fcf")));		
		ViewDropdwn.selectByVisibleText("Testing1");   
		
		WebElement EditLink = driver.findElement(By.linkText("Edit"));
		EditLink.click();
		WebElement s3 =driver.findElement(By.id("fname"));
		s3.clear();
		EnterText(s3, "viewname", "ViewName");
		System.out.println("Viewname entered in the field");
   
		WebElement firstcolumn = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Click(firstcolumn, "firstcolumn");
   
		WebElement fields = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select accfield = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
		accfield.selectByIndex(1);
   
		WebElement AddfieldsOperator = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
		operator.selectByIndex(3);
   
		WebElement value = driver.findElement(By.id("fval1"));
		value.clear();
		value.sendKeys("<a>");
		/*These statements verifies if the "Last Activity" is availble in the Available Fields
		 * If Last Activity is available under Available Fields, It add the same to Selected Fields
		 * and save the modifications
		 */
		WebElement Available_Fields_dropdown = driver.findElement(By.xpath("//*[@id='colselector_select_0']"));
		Select Available_Fields_dropdown_list = new Select(Available_Fields_dropdown);
		List<WebElement> Available_Fields_dropdown_options = Available_Fields_dropdown_list.getOptions();

		boolean Element_available = false; //using as a reference to validate if the last activity is in available fields dropdown or not
  
		for(int i=0; i<Available_Fields_dropdown_options.size(); i++) {
			if(Available_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
				Element_available = true;
				WebElement Add_arrow = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
				Add_arrow.click();
				break;
			}
		}

		/*These statements verifies if the "Last Activity" is availble in the Selected Fields
		 * If Last Activity is available under Selected Fields, save the modifications
		 *    */
		if(Element_available = false) {
			WebElement Selected_Fields_dropdown = driver.findElement(By.xpath("//select[@id='colselector_select_1']"));
			Select Selected_Fields_dropdown_list = new Select(Available_Fields_dropdown);
			List<WebElement> Selected_Fields_dropdown_options = Available_Fields_dropdown_list.getOptions();

			for(int i=0; i<Available_Fields_dropdown_options.size(); i++) {
				if(Selected_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
					break;
				}
			} 
		}
  
		//Clicking on save button
		WebElement Save_button = driver.findElement(By.name("save"));
		Save_button.click();
		driver.close();
		System.out.println("TC12Accounts_Edit_view is completed");
   
	}
	
	public static void TC_15_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("15TC_15_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();		
		WebElement Opportunities=driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
		Opportunities.click();	
		Thread.sleep(4000);
		Select OppDropdwn = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));	
		
		List<WebElement> options = OppDropdwn.getOptions(); 
		Set<String> availableOptions = new HashSet<String>();
		for (WebElement option : options) {
			availableOptions.add(option.getText());
		}
		Set<String> requiredOptions = new HashSet<>();
		requiredOptions.add("All Opportunities");
		requiredOptions.add("Closing Next Month");
		requiredOptions.add("Closing This Month");
		requiredOptions.add("New This Week");
		requiredOptions.add("Recently Viewed Opportunities");
		requiredOptions.add("Won");
		
		for (String required : requiredOptions) {
			if (!availableOptions.contains(required)) {
				//the test should fail
				Assert.fail();
			}
		}
		System.out.println("Executed");
		Thread.sleep(3000);
	
	}
	
	public static void TC_16_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("16TC_16_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();		
		WebElement Opportunities=driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));		
		Opportunities.click();	
		Thread.sleep(2000);
		WebElement NewBtn=driver.findElement(By.xpath("//input[@name='new']"));		
		NewBtn.click();
		Thread.sleep(1000);
		WebElement OppName = driver.findElement(By.id("opp3"));
		OppName.sendKeys("opp123");
		Thread.sleep(1000);
		WebElement AcntName = driver.findElement(By.id("opp4"));
		AcntName.sendKeys("Test123");
		Thread.sleep(1000);
		WebElement CloseDate = driver.findElement(By.id("opp9"));
		CloseDate.sendKeys("02/19/2020");
		Select Stage = new Select(driver.findElement(By.id("opp11")));
		Stage.selectByIndex(3);
		WebElement Probability = driver.findElement(By.id("opp12"));
		Probability.clear();
		Probability.sendKeys("50");
		WebElement PrimaryCampaign = driver.findElement(By.id("opp17"));
		PrimaryCampaign.sendKeys("DM Campaign to Top Customers ");
		WebElement SaveBtn = driver.findElement(By.name("save"));
		SaveBtn.click();
		Thread.sleep(2000);	
		
	}
	public static void TC_17_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("17TC_17_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement Opportunities=driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));		
		Opportunities.click();	
		Thread.sleep(2000);
		WebElement PipelineLink=driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
		PipelineLink.click();
		Thread.sleep(2000);		
	}
	
	public static void TC_18_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("18TC_18_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement Opportunities=driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));		
		Opportunities.click();	
		Thread.sleep(2000);
		WebElement StuckOpportunities=driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
		StuckOpportunities.click();
		Thread.sleep(2000);		
	}
	
	public static void TC_19_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("19TC_19_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement Opportunities=driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));		
		Opportunities.click();	
		Thread.sleep(2000);
		Select Interval = new Select(driver.findElement(By.id("quarter_q")));
		Interval.selectByIndex(3);
		Select Include = new Select(driver.findElement(By.id("open")));
		Include.selectByIndex(3);
		WebElement RunReport=driver.findElement(By.name("go"));
		RunReport.click();
		Thread.sleep(2000);		
	}
	
	public static void TC_20_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("20TC_20_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement Leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));		
		Leads.click();
		Thread.sleep(2000);
		
	}
	
	public static void TC_21_LoginToSalesForce() throws InterruptedException {
		logger = report.startTest("21TC_21_LoginToSalesForce");
		
		OpenUrl("https://login.salesforce.com/");
		logger.log(LogStatus.INFO,"URL Opened Succefully");
		WebElement Uname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		Uname.sendKeys("ramya@enaganti.com");
		WebElement Pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Pwd.sendKeys("Practice123");
		WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"Login\"]"));
		loginBtn.click();
		WebElement Leads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));		
		Leads.click();
		Thread.sleep(3000);
		Select LeadsView = new Select(driver.findElement(By.id("fcf")));
		List<WebElement> AllOpenLeads = LeadsView.getOptions(); 
		Set<String> availableLeads = new HashSet<String>();
		for (WebElement Lead : AllOpenLeads) {
			availableLeads.add(Lead.getText());
		}
		Set<String> requiredLeads = new HashSet<>();
		requiredLeads.add("All Open Leads");
		requiredLeads.add("My Unread Leads");
		requiredLeads.add("Recently Viewed Leads");
		requiredLeads.add("Today's Leads");
		requiredLeads.add("View - Custom 1");
		requiredLeads.add("View - Custom 2");
		
		for (String required : requiredLeads) {
			if (!availableLeads.contains(required)) {
				//the test should fail
				Assert.fail();
			}
		}
		System.out.println("Executed");
		Thread.sleep(2000);
		
		
	}
	
	
}
