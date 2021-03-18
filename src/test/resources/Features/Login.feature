Feature: OrangeHRM Login

  Background: Below are the background steps
    Given I launch chrome browser
    When I open OrangeHRM home page

  #Test=1
  Scenario: Logo presence in OrangeHRM home page
    Then I verify the logo is displaying on the page
    And I will close the browser

  #Test=2
  Scenario: Login to OrangeHRM with valid credentials
    And I enter username and password
    And I click on login button
    Then I must succefully login to dashboard page
    And I will close the browser

  #Test =3 passing parameters to steps
  Scenario: Login to OrangeHRM with valid credentials
    And I enter username"Admin" and password "admin123"
    And I click on login button
    Then I must succefully login to dashboard page
    And I will close the browser

  #Test = 4 passing multiple parameters using scenario outline and examples keyword
  Scenario Outline: Login to OrangeHRM with valid credentials
    And I enter username"<username>" and password "<password>"
    And I click on login button
    Then I must succefully login to dashboard page
    And I will close the browser

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | admin123 | Admin    |
      
    
