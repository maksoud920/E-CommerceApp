@smoke
  Feature: User could select different tags
    Scenario: User select random tag
      Given User click on a random category
      When User click on a random tag
      Then Products with this tag should be displayed