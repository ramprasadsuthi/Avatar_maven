@tag
Feature: Login Module
 
  @tc1
  Scenario: Verify login with valid user credentials
    Given Open Browser
    When Launch Application
    And  Login with valid user credentials
    Then validate the ERP HomePage
