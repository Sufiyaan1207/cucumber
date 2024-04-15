Feature: feature to test google search

@Regression
  Scenario: Validate google search
    Given Browser is open
    And user on search page
    When user enters text in search
    And hits Enter
    Then user navigated to search result
    And User closes the browser

@Smoke
  Scenario: Validate google search word
    Given  User open Browser
    And user start new search
    When user enters Random_word in search
    And Hits Searchbutton
    Then user navigated to search