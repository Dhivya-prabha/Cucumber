Feature: Delete Lead in Leaftaps Application
@FunctionalTest @RegressionTest
Scenario Outline: Delete Lead
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
And click on Delete
And click on find leads again 
Given Enter lead id
When click on find leads button again
Then no record is displayed

Examples:
|phno|
|99|

