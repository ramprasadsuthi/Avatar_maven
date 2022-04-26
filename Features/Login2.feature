@tag
Feature: Login Module
 
  @tc1
  Scenario: Verify login with valid user credentials
    Given Open Browser
    When Launch Application
    And  Login with valid "<username>" and valid "<password>"
    Then validate the ERP HomePage
    And Close the Browser
  
  Examples:
  | username | password |
  | admin    | master   |
  
  @tc2
  Scenario: Verify admin user is able logout from ERP Application
    Given Open Browser
    When Launch Application
    And  Login with valid user credentials
    Then validate the ERP HomePage  
    And Click on Logout button
    And Close the Browser
  
