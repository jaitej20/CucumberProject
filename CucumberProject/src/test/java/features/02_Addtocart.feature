Feature: Add Item to Cart

Scenario: Add Item in to Cart
Given the user is viewing the list of products
When the user clicks on the Add to Cart button for a product
Then the cart icon should be updated to reflect the added product

When the user clicks on the cart icon
Then the added product should be displayed in the cart
