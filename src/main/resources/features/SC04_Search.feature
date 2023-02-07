@smoke
Feature: User could search for any product
  Scenario Outline: user could user could search using product name

    When User search for "<item>"
    And User click on search button
    Then Website should show search results

    Examples:
      |item|
      |book|
      |laptop|
      |nike|