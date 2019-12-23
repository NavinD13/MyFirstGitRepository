Feature: Login
The user will enter the username
The user will enter the password
The user will click on the "Login" Button
After clicking on Login Button the user will be redirected to next page

Scenario Outline: Testing Multiple Logins
Given Home page is opened
And signin page is Displayed
When I provide "<Login>" and "<Password>"
Then the relevant Login username is displayed

Examples:
|Login|Password|
|nadh@gmail.com|navin123|
|namsh@gmail.com|navin123| 
