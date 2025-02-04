
Feature: Login in Leaftaps
 Background:
Given Open the Chrome Browser
And Load the URL as 'http://leaftaps.com/opentaps/'
 
Scenario Outline: TC001-01 - Login with multiple credentials(Positive TC)
Given Enter username as <username>
And Enter password as <password> 
When Click on Login button
Then HomePage should get displayed

Examples:
|username|password|
|demosalesmanager|crmsfa|
|DemoCSR|crmsfa|


Scenario Outline: TC001-02 - Login with invalid credentials(Negat6ive TC)
Given Enter username as <username>
And Enter password as <password> 
When Click on Login button
Then Verified Login Failed with error as <errorMsg>

Examples:
|username|password|errorMsg|
| |crmsfa|username was empty reenter|
|DemoCSR| |password was empty reenter|