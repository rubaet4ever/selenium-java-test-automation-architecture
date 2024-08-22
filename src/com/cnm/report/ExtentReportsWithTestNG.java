package com.cnm.report;

//import org.testng.Assert;
//import static org.junit.Assert.*;
//import static org.assertj.core.api.assertions.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ExtentReportsWithTestNG {
	//public ExtentReports extent;
	//public ExtentSparkReporter spark;
	//public ExtentTest test;
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	//public ExtentReports extent;
	//public ExtentSparkReporter spark;
	public ExtentTest test;
	
	//WebElement menu_text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Desktops']")));
			//String text = menu_text.getText();
			//assertThat(text).as("Verify text of Menu link").isEqualToIgnoringCase("Desktops");
	
	public static void createExtentReportsWithTestNG(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.id("email")).sendKeys("rubaet@bs.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rubaet1@R");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("rc-anchor-container")).click();
		//Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".bigger-110")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector(".user-info > span:nth-child(3)")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@id='navbar-container']/div[2]/ul/li[3]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);

	}
	
	@Test
	public void setUpTest(){

	ExtentTest Test = extent.createTest("Launch Browser and Website").assignAuthor("Mohammad").assignCategory("UI Test").assignDevice("Desktop_chrome");

	ExtentTest Test1 = extent.createTest("Launch Browser and Website").assignAuthor("John").assignCategory("UI Test").assignDevice("Desktop_chrome");

	Test1.log(Status.PASS,"Browser lunched");
	Test1.pass("Browser launched successfully");
	test.info("Displaying Page");
	}
	
	@Test
	public void ClickNProfile() {
		test = extent.createTest("Verify About Us Menu Page")
				.assignAuthor("Rocky")
				.assignCategory("Smoke Test")
				.assignDevice("Desktop_chrome");
		test.pass("ClickNProfile Module page is able to clickable");
		test.info("Displaying Page");
	}

	@Test
	public void createSettingTest() {
		test = extent.createTest("Verify Change Password Menu Page")
				.assignAuthor("Tester")
				.assignCategory("WhiteBox Test")
				.assignDevice("Desktop_chrome");
		test.pass("ClickNHome Module page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
	public void ClickNCheck() {
		test = extent.createTest("Verify Products Menu Page")
				.assignAuthor("Doe")
				.assignCategory("Validation Test")
				.assignDevice("Desktop_chrome");
		test.pass("ClickNCheck Module page is able to clickable");
		test.info("Displaying Page");
	}
    
	@Test
	public void ClickNDoc() {
		test = extent.createTest("Verify Logout Menu Page")
				.assignAuthor("End User")
				.assignCategory("Sanity Test")
				.assignDevice("Desktop_chrome");
		test.pass("ClickNDoc Module page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
	public void ClickNShare() {
		test = extent.createTest("Verify FAQ Menu Page")
				.assignAuthor("Mitul")
				.assignCategory("Verification Test")
				.assignDevice("Desktop_chrome");
		test.pass("ClickNShare Module page is able to clickable");
		test.info("Displaying Page");
	}

    @Test
	public void ClickNSecure() {
		test = extent.createTest("Verify Profile Menu Page")
				.assignAuthor("Client User")
				.assignCategory("Re Test")
				.assignDevice("Desktop_chrome");
		test.pass("ClickNSecure Module page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
	public void ClickNMaintain() {
		test = extent.createTest("Verify Contact Menu Page")
				.assignAuthor("John")
				.assignCategory("Regression Test")
				.assignDevice("Desktop_chrome");
		test.pass("ClickNMaintain Module page is able to clickable");
		test.info("Displaying Page");
	}

	@Test
	public void ActionTest() {
		test = extent.createTest("Verify Contact Menu Page")
				.assignAuthor("Steve")
				.assignCategory("Black Box Test")
				.assignDevice("Desktop_chrome");
		test.pass("Action page is able to clickable");
		test.info("Displaying Page");
	}
	
	
	@Test
	public void NonConformanceTest() {
		test = extent.createTest("Verify user unable to register with invalid credentials")
				.assignAuthor("Robert")
				.assignCategory("Security Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User unable to register to complete the application registration form");
		test.info("Displaying Page");;
	}
	
	//@Test
	//public void ResetPassword() {
	//	test = extent.createTest("Verify user unable to sent with invalid credentials")

	public void MaintainSettingTest() {
		test = extent.createTest("Verify Setting Menu Page")
				.assignAuthor("Carlo")
				.assignCategory("User Acceptance Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User unable to reset passoword is not responding");
		test.warning("Reset password after first login credentials are invalid");
		test.info("Displaying Page");;
	}
	
//	@Test
	//public void ProductsAdd_DeleteCart() {
	//	test = extent.createTest("Verify user able to ProductsAdd_DeleteCart Successfully")

    @Test
	public void AssetTest() {
		test = extent.createTest("Verify Asset Menu Page")
				.assignAuthor("Rian")
				.assignCategory("Functionality Testing")
				.assignDevice("Desktop_chrome");
		test.fail("User unable to checkout selected items and after it is not responding");
		test.info("Displaying Page");
	}
	

	@BeforeTest
	public void BeforeTest() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("ExtentReport.html");
		extent.attachReporter(spark);
		
	}

	@AfterTest
	public void AfterTest() {
	
		extent.flush();
	}

}