Feature: Register Action

  Scenario: Succesful Register
    Given User Open Home Page
    When User Navigate to Register Page
    And User enters information for register
    Then Registration must be succesful
