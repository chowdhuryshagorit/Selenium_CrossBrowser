@tag
Feature: Log in
  Scenario: log in with valid user credential  
    Given I am in partyrentalltd.com website.
    And then I click to log in/register button
    When as a register user I put valid email and password
    And I click log in.
    Then its takes me to the home page 
    And I loged in successfully.
 