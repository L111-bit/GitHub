package com.cucum.StepDefinitions;

import com.cucum.pages.ChannelPage;
import com.cucum.pages.HomePage;
import com.cucum.pages.SearchPage;
import com.cucum.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPageSteps extends TestBase {

	
	HomePage homepage;
	ChannelPage channelpage;
	SearchPage searchpage;
	
	@Given("^I want to open Youtube in browser$")
	public void i_want_to_open_Youtube_in_browser() throws Throwable {
	    TestBase.initialization();
	}

	@And("^I want to validate the title of webpage$")
	public void i_want_to_validate_the_title_of_webpage() throws Throwable {
	    homepage =new HomePage();
	    homepage.verifyHomePageTitle();
	    System.out.println(driver.getTitle());
	}

	@When("^I search the favorite song$")
	public void i_search_the_favorite_song() throws Throwable {
		
		searchpage=homepage.NavigationToResultPage(prop.getProperty("songname"));
	}

	@When("^I play the song$")
	public void i_play_the_song() throws Throwable {
	   searchpage = new SearchPage();
	   channelpage=searchpage.NavigateToChannelName();
	}

	@Then("^I validate channel name$")
	public void i_validate_channel_name() throws Throwable {
	    
		channelpage = new ChannelPage();
		channelpage.getTitle();
	}
	
	
}
