@smoke
  Feature: User could add different products to Wishlist
    Scenario: User add three books to the Wishlist
      Given User open books category page
      When User press on add to Wishlist button on three different books
      Then Items should be added to the Wishlist
