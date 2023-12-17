Feature: To validate the login functionality of facebook application 
Scenario: To verify login with invalid credentials
Given User should navigate to login page
When User should enter username "sera555" and password "789456"
And User should click login button
Then User navigate invalid page 