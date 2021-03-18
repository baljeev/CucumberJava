Feature: Login Feature

  Scenario Outline: Login with different combinations
    Given User is on Application Landing Page
    When User clicks on sign in button
    Then User is displayed login screen
    When User enters "<Username>" in username field
    And User enters "<Password>" in password field
    And User clicks on sign in button
    Then User should get success or failed message as per the entry

    Examples: 
      | Username          | Password          |
      | Incorrectusername | Correctpassword   |
      | Correctusername   | Incorrectpassword |
      | Correctusername   | Correctpassword   |
      | Incorrectusername | Incorrectpassword |
