Feature: Duplicate Lead in Leaftaps Application
@SmokeTest @RegressionTest
Scenario Outline: Duplicate Lead
#Given open the chrome browser as maximised
#Given launch URL 
#Given Enter user name as <username>
#Given Enter password as <password>
#When click on login button
#When click on CRMSFA
#When click on Leads
And click on Find Leads
And click on Phone
Given Enter phone number as <phno>
When click on Find Leads button 
And click on the First Resulting Lead
And click on Duplicate Lead
And click on Submit button
Then name gets duplicated 

Examples:
|phno|
|99|
