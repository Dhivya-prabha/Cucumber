Feature: Merge Lead in Leaftaps Application
@FunctionalTest @RegressionTest
Scenario Outline: Merge Lead
#Given open the chrome browser as maximised
#Given launch URL 
#Given Enter user name as <username>
#Given Enter password as <password>
#And click on login button
#And click on CRMSFA
#And click on Leads
And click on Merge Leads 
And click on the lookup
Given Enter Merge Lead first name as <fname> 
And click on Merge Find Leads button
And click on the first resulting lead
And click on the lookup again
And Enter the first name again as <Fname> 
And click on Merge Find Leads button again
And click on the first resulting lead again
And click on Merge
And click on Ok in the alert
And click on find leads again 
Given Enter Lead id 
When click on find leads button again
Then no record is displayed

Examples:
|fname|Fname|
|gopi|babu|


