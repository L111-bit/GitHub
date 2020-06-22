$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/YouTube.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Youtube Songs",
  "description": "",
  "id": "youtube-songs",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Searching Favourite song in Youtube",
  "description": "",
  "id": "youtube-songs;searching-favourite-song-in-youtube",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I want to open Youtube in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I want to validate the title of webpage",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I search the favorite song",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I play the song",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I validate channel name",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchPageSteps.i_want_to_open_Youtube_in_browser()"
});
formatter.result({
  "duration": 27366935300,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.i_want_to_validate_the_title_of_webpage()"
});
formatter.result({
  "duration": 1912081700,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.i_search_the_favorite_song()"
});
formatter.result({
  "duration": 3148436699,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.i_play_the_song()"
});
formatter.result({
  "duration": 3469388900,
  "status": "passed"
});
formatter.match({
  "location": "SearchPageSteps.i_validate_channel_name()"
});
formatter.result({
  "duration": 724366901,
  "status": "passed"
});
});