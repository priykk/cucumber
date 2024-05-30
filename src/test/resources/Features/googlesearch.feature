Feature: test google search functionality

  
  Scenario: verify google search fucntionality
    Given Browser is open
    And user present on google search page
    When user enter text in serach box
    And and hit on serach button
    Then user is navigated to the search result page