Feature: Login into the SauceDemo website


  Scenario Outline: Login should be success
    Given User launches the Chrome Browser
    And User enter the Username as "<Username>"
    And User enter the password as "<Password>"
    When User clicks on the Login button
    Then page title should be "<title>"
    
 Examples:
           |Username|Password|title|
           |standard_user|secret_sauce|Swag Labs|	
           |Wrong_user|secret_sauce|Swag Labs|	