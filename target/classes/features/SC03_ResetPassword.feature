@smoke
Feature: User could reset his/her password successfully

  Scenario: User reset his/her password using email
    Given User go to login page
    And User press on forgot password
    When User enters his or her email
    And User press Recover button
    Then User could reset password successfully

