Feature: Create Lead in Leaftaps Application

@SmokeTest @FunctionalTest
Scenario Outline: Create Lead
#Given open the chrome browser as maximised
#Given launch URL 
#Given Enter user name as <username>
#Given Enter password as <password>
#When click on login button
#When click on CRMSFA
#When click on Leads
When click on CreateLeads
Given Enter the company name as <compname>
And Enter first name as <fname>
And Enter last name as <lname>
When click on submit
Then lead gets created

Examples: 
|username|password|compname|fname|lname|
|demosalesmanager|crmsfa|Testleaf|Gopi|J|

