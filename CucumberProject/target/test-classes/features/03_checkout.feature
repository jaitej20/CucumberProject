@CartCheckout
Feature: Cart CheckOut

Scenario Outline: Checkout

Given user has a product in the cart
When user clicks on the checkout
And user enters first name as "<firstname>"
And user enters last name as "<lastname>"
And user enters the pincode as "<Code>"
And user clicks on continue
And user clicks on finish
Then user should be displayed order confirmation message "<ConfirmationMsg>"

Examples:
         |firstname|lastname|Code|ConfirmationMsg|
         |jaitej|gandam|500044|Thank you for your order!|