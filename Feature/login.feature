Feature: Login and fill up the BGC form

Scenario: Login and fill the background verification form

Given user is on login page
When User logins by using the valid credentials
Then User verifies that home page is displayed successfully
When User clicks on BGC form
Then User fills out the details in the form and submits the form
When User clicks on the profile icon
Then User adds a new profile picture

