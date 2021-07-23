@outline
Feature: Multiple scenarios with different set of data

  Scenario Outline: Buy apples and  carrots
    Given The grocery <storeName> store is open
    When We go to the store
    Then User buys <apple> and <carrots> carrots

    Examples:
      | apple | carrots | storeName |
      | 10    | 5       | Eliza     |
      | 1     | 2       | Tony's    |
      | 100   | 50      | ALDI      |

Feature: Tickets

  Scenario Outline: Tickets
    Given Expedia flight page is open
    When User searches for flight <from> <to>
    And on <date>
    Then List of flights is displayed


  Scenario Outline:
    Given User logged in bank application
    When  User checked the balance
    Then  The remaining balance is <balance amount>on the screen
      | operation | balance amount |
      | checked   | 300            |
      | added     | 400            |


  Scenario Outline:
    Given User navigate to <socialmedia>
    When  User profile <event>
    Then  Update comes out on the page
      | event          | socialmedia   |
      | was live      | facebook.com  |
      | updated status | instagram.com |


