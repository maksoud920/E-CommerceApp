@smoke
  Feature: user could select different Categories
    Scenario: User select random category
      When User hover over a random category
      And User select random sub-category
      Then sub-category should be displayed
