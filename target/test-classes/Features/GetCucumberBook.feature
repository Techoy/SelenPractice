Feature: Google Chrome

  @secondScenario
  Scenario: Get CookBook from Google Chrome

    Given Google search page is open

    When Entered "CookBook" in the search box

    Then Displayed the list of options for CookBook
