package testcases;

import org.testng.annotations.Test;

import pages.DewanNasirUddinBook;
import pages.WafiLifeAuthorPage;
import pages.WafiLifeBookDetails;
import pages.WafiLifeCheckOut;
import pages.WafiLifeHomePage;

import utilities.BaseDriverSetup;

public class WafiLifeTest extends BaseDriverSetup{
	
	WafiLifeHomePage wafiLifeHomePage = new WafiLifeHomePage();
	WafiLifeAuthorPage wafiLifeAuthorPage = new WafiLifeAuthorPage();
	DewanNasirUddinBook dewanNasirUddinBook = new DewanNasirUddinBook();
	WafiLifeBookDetails wafiLifeBookDetails = new WafiLifeBookDetails();
	WafiLifeCheckOut wafiLifeCheckOut = new WafiLifeCheckOut();
	
	@Test
	public void visitWafiLife() throws InterruptedException {
//		Visit This Site
		getDriver().get(wafiLifeHomePage.WAFILIFE_URL);
		Thread.sleep(5000);
		
//		Click On The লেখক From The Menu 
		wafiLifeHomePage.clickOnElement(wafiLifeHomePage.AUTHOR_BUTTON);
		Thread.sleep(5000);
		
//		Scroll Down And Go To The Next Page
		wafiLifeAuthorPage.scrollToElemnt(wafiLifeAuthorPage.NEXT_PAGE_BUTTON);
		Thread.sleep(5000);
		wafiLifeAuthorPage.clickOnElement(wafiLifeAuthorPage.NEXT_PAGE_BUTTON);
		Thread.sleep(5000);
		
//		Back To The Previous Page
		getDriver().navigate().back();
		Thread.sleep(5000);
		
//		Scroll Up TO THE AUTHOR NAME
		wafiLifeAuthorPage.moveOnElement(wafiLifeAuthorPage.AUTHOR_NAME);
		Thread.sleep(5000);
		
//		Click On Author Name
		wafiLifeAuthorPage.clickOnElement(wafiLifeAuthorPage.AUTHOR_NAME);
		Thread.sleep(5000);
		
//		View any Book Details
		dewanNasirUddinBook.clickOnElement(dewanNasirUddinBook.PHYSICS_1ST_PAPER);
		Thread.sleep(5000);
		
//		Click অর্ডার করুন
		wafiLifeBookDetails.clickOnElement(wafiLifeBookDetails.ORDER_BOOK);
		Thread.sleep(5000);
		
//		Click অর্ডার সম্পন্ন করুন
		wafiLifeBookDetails.clickOnElement(wafiLifeBookDetails.PLACE_ORDER);
		Thread.sleep(5000);
		
		checkoutTest();
	}
	
	public void checkoutTest() throws InterruptedException {
		wafiLifeCheckOut.clickOnElement(wafiLifeCheckOut.CHECKBOX_CREATE_ACCOUNT);
		Thread.sleep(5000);
		
		wafiLifeCheckOut.writeText(wafiLifeCheckOut.PASSWORD, "password");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.writeText(wafiLifeCheckOut.NAME, "Rishat");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.writeText(wafiLifeCheckOut.PHONE_NUMBER, "01824123456");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.writeText(wafiLifeCheckOut.EMERGENCY_PHONE_NUMBER, "01823123456");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.writeText(wafiLifeCheckOut.EMAIL, "rishat@gmail.com");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.clickOnElement(wafiLifeCheckOut.DIVISION_DROPDOWN);
		Thread.sleep(5000);
		
		wafiLifeCheckOut.selectElementWithText(wafiLifeCheckOut.DIVISION_TEXT_FIELD, "Dhaka");
		Thread.sleep(5000);
		
//		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.DHAKA_DIVISION);
//		Thread.sleep(5000);
		
//		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.BASHUNDHARA);
//		Thread.sleep(5000);
		
		wafiLifeCheckOut.dropdownSelection(wafiLifeCheckOut.ADDRESS, "BASHUNDHARA");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.writeText(wafiLifeCheckOut.PRODUCT_COMMENT, "Send me safely, handle with care");
		Thread.sleep(5000);
		
//		objWasiLifeCheckOut.clickOnElement(objWasiLifeCheckOut.PLACE_ORDER);
//		Thread.sleep(5000);
	}

}
