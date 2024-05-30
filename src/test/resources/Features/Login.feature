Feature: Test Login functionality of Facebook

  Scenario: Check login is successful with valid credentials
    Given Open FireFox and start facebook application
    When User enter valid username and password
    Then User should able to login page