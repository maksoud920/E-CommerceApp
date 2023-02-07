@smoke
  Feature: User could filter with color
    Scenario: User filter shoes with color
      Given User click on shoes subcategory
      When User filter color by Red
      Then Red items should be displayed