Feature: Login Actions

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName and Password

  Scenario: Successful LogOut
    Then User LogOut from the Application


