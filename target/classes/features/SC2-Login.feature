@smoke
Feature: User should be able to login to the system

  Scenario: User login with valid email and password
    Given User go to login page
    When User enter valid email and password
    And User click on login button
    Then User could login successfully


  Scenario: User can't login with invalid email or invalid password
    Given User go to login page
    When User enter invalid email or password
    And User click on login button
    Then User couldn't login to the system