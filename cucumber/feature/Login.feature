
Feature: Login in Leaftaps
 
Scenario: TC001-01 - Login with valid credentials(Positive TC)
Given Open the Chrome Browser
And Load the URL as 'http://leaftaps.com/opentaps/'
Given Enter username as 'demosalesmanager'
And Enter password as 'crmsfa'
When Click on Login button
Then HomePage should get displayed


Scenario: TC001-02 - Login with invalid credentials(Negat6ive TC)
Given Open the Chrome Browser
And Load the URL as 'http://leaftaps.com/opentaps/'
Given Enter username as ''
And Enter password as 'crmsfa'
When Click on Login button
Then Verified Login Failed with error as 'username was empty reenter'