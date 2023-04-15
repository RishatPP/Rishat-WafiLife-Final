package pages;

import org.openqa.selenium.By;

public class WafiLifeBookDetails extends BasePage{
	
	public By ORDER_BOOK = By.xpath("//button[contains(text(),'অর্ডার করুন')][2]");
	public By PLACE_ORDER = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");

}
