Feature: Test login functionality

  Scenario: check l0gin is sucessfully with valid credentials

    Given When user is present on login page
    And Enter valid credentials username and password
    Then user should navigate to the home page

Feature: test google search functionality


  Scenario: verify google search fucntionality
    Given Browser is open
    And user present on google search page
    When user enter text in serach box
    And and hit on serach button
    Then user is navigated to the search result page
