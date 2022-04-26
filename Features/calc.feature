@All
Feature: Calculator
 
  @P1
  Scenario: Addition of Two numbers
    Given Read a and b
    When Add a + b
    Then Display the Result
    
  @P1
  Scenario: Multiplication of Two numbers
    Given Read a and b
    When Mulitiply a * b
    Then Display the Result
    
  @P2
  Scenario: Subtraction of Two numbers
    Given Read a and b
    When Subtract a - b
    Then Display the Result
    
  @P3
  Scenario: Division of Two numbers
    Given Read a and b
    When Div of a / b
    Then Display the Result
    
