Feature: Uber Booking Feature

@Smoke
  Scenario: Booking cab
    Given User want to select a car type "Sedan" from uber application
    When User selects car "sedan" and pick up point "Banglore" and drop of point "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
  
    
    
@Regresssion
    Scenario: Booking SUV
    Given User want to select a car type "suv" from uber application
    When User selects car "sedan" and pick up point "Kerala" and drop of point "Banglore"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
    
    @Produ
    Scenario: Booking Mini
    Given User want to select a car type "mini" from uber application
    When User selects car "sedan" and pick up point "Bombay" and drop of point "Delhi"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
    