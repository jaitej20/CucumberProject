Feature: Log out of Application

Background:
Given user enters the username as "problem_user"
And user enters the password as "secret_sauce"
And user clicks on the login button


Scenario: Logout User
Given User is already loggedin
When user clicks on the menu
And user clicks on the Logout	
Then User should be logged Out