@smoke
  Feature: User can order successfully
    Scenario: User Create successful Order
      Given User go to login page
      And User enter valid email and password
      And User click on login button
      When User press on Add To Cart button on an item
      And User Open Shopping Cart
      And User click on agree to terms checkbox
      And User click on Checkout button
      And User add billing address details and press Continue button
      And User select shipping method and press Continue button
      And User select Payment method and press Continue button
      And User press on Continue button in Payment information tab
      And User press on Confirm button
      Then Order should be created successfully


