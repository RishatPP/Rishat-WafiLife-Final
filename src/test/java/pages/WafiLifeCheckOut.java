package pages;

import org.openqa.selenium.By;

public class WafiLifeCheckOut extends BasePage{
	
	public By CHECKBOX_CREATE_ACCOUNT = By.xpath("//input[@id='createaccount']");
	public By PASSWORD = By.xpath("//input[@id='account_password']");
	public By NAME = By.xpath("//input[@id='billing_first_name']");
	public By PHONE_NUMBER = By.xpath("//input[@id='billing_phone']");
	public By EMERGENCY_PHONE_NUMBER = By.xpath("//input[@id='billing_alternative_phone']");
	public By EMAIL = By.xpath("//input[@id='billing_email']");
	public By DIVISION_DROPDOWN = By.xpath("(//b[@role='presentation'])[1]");
	public By DIVISION_TEXT_FIELD = By.xpath("(//input[@role='combobox'])[1]");
	public By DHAKA_DIVISION = By.xpath("//li[contains(text(),'Dhaka')]");
	public By AREA = By.xpath("(//select[@name='billing_area'])[1]");	
	public By ADDRESS = By.xpath("//textarea[@id='billing_address_1']");
	public By PRODUCT_COMMENT = By.xpath("//textarea[@id='order_comments']");
	public By PLACE_ORDER = By.xpath("//button[@id='place_order']");
	
	public By SHIP_TO_DIFFERENT_PLACE = By.xpath("//input[@id='ship-to-different-address-checkbox']");
	public By NAME_SHIPPING = By.xpath("//input[@id='shipping_first_name']");
	public By PHONE_SHIPPING = By.xpath("//input[@id='shipping_phone']");

}
