Feature: This is just for testing purpose

  Scenario: A First Test Scenario 
    Given I want to write a step with precondition 
    When I complete action
    Then I validate the outcomes
   

  Scenario Outline: A Second Test Scenario 
    Given Write a step with "<name>"
    When Check for the <marks> in step
    Then Verify the "<result>" in step <marks>

    Examples: 
      | name  | marks  | result  |
      | Ankur |     75 | Pass    |
      | Aman  |     44 | Fail    |
