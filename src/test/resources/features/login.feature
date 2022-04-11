#Author: Innocent Omido
#Date: 11/4/2022
#Description: Login scenario


Feature: testing login functionality

  Scenario: Check Login is successful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home pageΩ