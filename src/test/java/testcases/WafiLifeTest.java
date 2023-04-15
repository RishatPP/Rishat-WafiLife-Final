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
		wafiLifeHomePage.takeScreenShot("WAFILIFE_HOME");
		Thread.sleep(5000);
		
//		Click On The লেখক From The Menu 
		wafiLifeHomePage.clickOnElement(wafiLifeHomePage.AUTHOR_BUTTON);
		wafiLifeHomePage.takeScreenShot("WAFILIFE_AUTHOR_BUTTON");
		Thread.sleep(5000);
		
//		Scroll Down And Go To The Next Page
		wafiLifeAuthorPage.scrollToElemnt(wafiLifeAuthorPage.NEXT_PAGE_BUTTON);
		wafiLifeAuthorPage.takeScreenShot("WAFILIFE_AUTHOR_PAGE");
		Thread.sleep(5000);
		wafiLifeAuthorPage.clickOnElement(wafiLifeAuthorPage.NEXT_PAGE_BUTTON);
		wafiLifeAuthorPage.takeScreenShot("WAFILIFE_AUTHOR_NEXT_PAGE");
		Thread.sleep(5000);
		
//		Back To The Previous Page
		getDriver().navigate().back();
		Thread.sleep(5000);
		
//		Scroll Up TO THE AUTHOR NAME
		wafiLifeAuthorPage.moveOnElement(wafiLifeAuthorPage.AUTHOR_NAME);
		Thread.sleep(5000);
		
//		Click On Author Name
		wafiLifeAuthorPage.clickOnElement(wafiLifeAuthorPage.AUTHOR_NAME);
		wafiLifeAuthorPage.takeScreenShot("WAFILIFE_AUTHOR_NAME");
		Thread.sleep(5000);
		
//		View any Book Details
		dewanNasirUddinBook.clickOnElement(dewanNasirUddinBook.PHYSICS_1ST_PAPER);
		dewanNasirUddinBook.takeScreenShot("WAFILIFE_BOOK");
		Thread.sleep(6000);
		
//		Click অর্ডার করুন
		wafiLifeBookDetails.clickOnElement(wafiLifeBookDetails.ORDER_BOOK);
		wafiLifeBookDetails.takeScreenShot("WAFILIFE_ORDER_BOOK");
		Thread.sleep(5000);
		
//		Click অর্ডার সম্পন্ন করুন
		wafiLifeBookDetails.clickOnElement(wafiLifeBookDetails.PLACE_ORDER);
		wafiLifeBookDetails.takeScreenShot("WAFILIFE_PLACE_ORDER");
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
		wafiLifeCheckOut.takeScreenShot("WAFILIFE_DIVISION");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.selectElementWithText(wafiLifeCheckOut.DIVISION_TEXT_FIELD, "Dhaka");
		wafiLifeCheckOut.takeScreenShot("WAFILIFE_CHECK_TO_DIVISION");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.dropdownSelection(wafiLifeCheckOut.AREA, "বসুন্ধরা");
		Thread.sleep(5000);
		
		wafiLifeCheckOut.writeText(wafiLifeCheckOut.PRODUCT_COMMENT, "Send me safely, handle with care");
		wafiLifeCheckOut.takeScreenShot("WAFILIFE_AREA_TO_COMMENT");
		Thread.sleep(5000);
		
	}

}
