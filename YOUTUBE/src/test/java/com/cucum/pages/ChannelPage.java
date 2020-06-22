package com.cucum.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucum.util.TestBase;

public class ChannelPage extends TestBase{


	@FindBy(linkText="abc")
	WebElement searchTextbox;

	//Initializing the page objects:
		public ChannelPage() {
			PageFactory.initElements(driver, this);
		}
	
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
}
