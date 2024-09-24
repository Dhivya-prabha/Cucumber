#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login into Leaftaps
  I want to use this template for my feature file

  @tag1
  Scenario: Login with Username and password
  	Given Open the Browser
  	And Load the URL
    Given Enter the username as <username> password as <password>  
      
	    |username|password|
			|'demosalesmanager'|'crmsfa'|
			|'demoCSR'|'crmsfa'|
		When click the Login
    And click the CRMSFA   
    Then Home page will be loaded