@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: User could register with valid data
    Given User go to register page
    When User enter first name, second name, email and password
    And User press on register button
    Then User could register successfully


