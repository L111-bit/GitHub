package com.cucum.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucum.util.TestBase;

public class SearchPage extends TestBase{

	
	@FindBy(xpath="//*[@id='video-title']/yt-formatted-string")
	WebElement searchTextbox;

	
	//Initializing the page objects:
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public ChannelPage NavigateToChannelName() throws InterruptedException
	{
		Thread.sleep(2000);
		searchTextbox.click();
		
		
		return new ChannelPage();
	}
	
	
	
}
