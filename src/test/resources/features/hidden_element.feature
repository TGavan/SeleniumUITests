Feature: The objective of this feature is to verify the presence of a dynamic element that remains hidden until triggered.

  Scenario: To verify the presence of dynamic hidden element
    Given User is at the home page of the application
    And User clicks on the Start button
    And User waits for the dynamic element
    Then element is loaded and displayed the result as "Hello World!"
