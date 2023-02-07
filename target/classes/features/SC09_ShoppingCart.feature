@smoke
  Feature: User could add different products to Shopping cart
    Scenario: User add three books to the Shopping cart
      Given User open books category page
      When User press on Add To Cart button on three different books
      Then Items should be added to the Shopping cart