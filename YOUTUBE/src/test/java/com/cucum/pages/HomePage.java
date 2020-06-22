package com.cucum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucum.util.TestBase;

public class HomePage extends TestBase {
	
	
	
	

	@FindBy(name="search_query")
	WebElement searchbox;
	
	@FindBy(id="search-icon-legacy")
	WebElement SearchButton;
	
	//Initializing the page objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public String verifyHomePageTitle() {
			return driver.getTitle();
		}
	
	public SearchPage NavigationToResultPage(String songname)
	{
		
		searchbox.sendKeys(songname);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		SearchButton.click();
		return new SearchPage();
		
		
		
	}
	
	
}
