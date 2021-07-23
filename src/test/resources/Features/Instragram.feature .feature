# new feature
# Tags: optional

Feature: Instagram login automation
  Background:

  Scenario: Happy path

    When User logs in with valid credentials
    Then User can succesfully log in


    Scenario: Forgot password
      When I change the password
      And Use it to log in
      Then User can succesfully log in

      Scenario:
        When I change the login
        And Use it to log in
        Then User can successfully logged in


