@flightSearch
Feature: Expedia Flight Search functionality

  Scenario: Search for one way flight from Chicago to New York

    Given Kayak "flight" page should be open
    When Search for one way flight from Chicago to New York on 12/25/2019
    Then Displayed 5 or more one way flight options on webpage

  Scenario: Search for the cheapest room in hotels in Chicago
    Given Kayak "hotel" page should be open
    When Search for hotel in Chicago
    And chooses to stay from 6/30/2019 to 7/30/2019
    Then The list of the cheapest hotels appeared on the page


