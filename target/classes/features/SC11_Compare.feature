@smoke
Feature: User could add different products to compare list
  Scenario: User add three books to Compare list
    Given User open books category page
    When User press on add to compare list button on three different books
    Then Items should be added to compare list
