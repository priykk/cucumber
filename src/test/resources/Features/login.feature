
Feature: Test login functionality

  Scenario Outline: check lgin is sucessfull with valod credentials
    Given Browser is open 
    And user is on login page and user should have valid credentials
    When user enters valid <username> and <password>
    And click on login button
    Then user navigated to the home page
    
    Examples:
    |username|password|
    |testuser|12345|
    |testuser02|123456|
