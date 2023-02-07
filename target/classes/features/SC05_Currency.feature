@smoke
  Feature: User could switch between currencies US-Euro

    Scenario: User could switch from USD to Euro
    When User change currency from the drop down list
    Then  Currencies should be displayed in the selected currency
