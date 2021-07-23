# new feature
# Tags: optional
@homework
Feature: Rent a car

  Scenario: Search for a car to rent with the same drop-off destination
    Given Kayak car page should be open
    When Search for the car from Chicago with the same drop-off destination
    Then List of car options is appeared on the page

    Scenario: Search for a car to rent from non-existing destination

      Given Kayak car page should be open
      When Search for a car from non-existing destination
      Then Appeared page with error message

