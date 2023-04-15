package pages;

import static utilities.BaseDriverSetup.getDriver;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.qameta.allure.Allure;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}

	public void writeText (By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public void moveOnElement(By locator)
	{
		Actions action = new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();
	}
	
	public void hoverOnElement(By locator)
	{
		Actions action = new Actions(getDriver());
		action.clickAndHold(getElement(locator)).perform();
	}
	
	public void scrollToElemnt(By loactor) {
		WebElement el = getElement(loactor);
		JavascriptExecutor js =(JavascriptExecutor)getDriver();
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		js.executeScript("arguments[0].scrollIntoView();", el);
	}
	
	public void closedPopup(By locator) {
		List<WebElement> popups = getDriver().findElements(locator);
		for(WebElement popup : popups) {
			try {
				popup.click();
			} catch (Exception e) {
				System.out.println("Popup Not found to perform close action");
			}
		}
	}
	
    public void selectElementWithText(By locator, String text) {
		
		writeText(locator, text);
		getElement(locator).sendKeys(Keys.ARROW_DOWN);
		getElement(locator).sendKeys(Keys.ENTER);
		
	}
    
	public void dropdownSelection(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

    }
	
	public void takeScreenShot(String name) {
		Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
	}

}
