Feature: Edit Lead in Leaftaps Application
@RegressionTest
Scenario Outline: Edit Lead
#Given open the chrome browser as maximised
#Given launch URL 
#Given Enter user name as <username>
#Given Enter password as <password>
#When click on login button
#When click on CRMSFA
#And click on Leads
And click on Find Leads
And click on Phone
Given Enter phone number as <phno>
When click on Find Leads button 
And click on First Resulting Lead
And click on Edit
Given update company name as <compname>
When click on Submit
Then company name is updated

Examples:
|username|password|phno|compname|
|demosalesmanager|crmsfa|99|TCS|

