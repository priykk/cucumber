Feature: Test login functionality

  Scenario: check l0gin is sucessfully with valid credentials

    Given When user is present on login page
    And Enter valid credentials username and password
    Then user should navigate to the home page
