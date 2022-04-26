@tag
Feature: Add
 
  @tc1
  Scenario: Addition of Two numbers
    Given input <a> and <b>
    When calc a + b
    Then validate the <expResult>
    
  Examples:
  | a    | b   |  expResult |
  | 1000 | 200 |    1200    |
  | 10   | 200 |    210     |
  | 1000 | 500 |    500     |
  | 2000 | 200 |    2200    |
  | 1000 | 800 |    1800    |