Feature: Register test
  As a user I want to register in nopCommerce website
@smoke @regression
  Scenario: verify user should navigate to register page successfully
    Given I am on homepage
    When I click on register link
    And I should navigate to registration page successfully
@sanity @regression
  Scenario: verify that Firstname, Lastname, Email, Password and ConfirmPasswordFields are mandatory
    Given I am on homepage
    When I click on register link
    And I click on register Button
    And verify error message firstname is required
    And Verify the error message Last name is required
    And Verify the error message Email is required
    And Verify the error message Password is required
    And Verify the error message Confirm Password is required
@regression
  Scenario Outline: verify that user should create account successfully
    Given I am on homepage
    When I click on register link
    And I select gender "<Gender>"
    And I enter firstname "<Firstname>"
    And I enter lastname "<Lastname>"
    And I select day "<Day>"
    And I select month"<Month>"
    And I select year "<Year>"
    And I enter emailId "<Email>"
    And I enter Reg-Password "<Password>"
    And I enter Reg-ConfirmPassword"<ConfirmPassword>"
    Then I click on register Button
    And Verify the message Your registration completed
    Examples:
      | Gender | Firstname | Lastname | Day | Month | Year | Email                 | Password  | ConfirmPassword |
      | Male   | user      | name     | 1   | January   | 2020 | username155@gmail.com | user1234@ | user1234@       |
      | Female | user      | name     | 25  | March     | 1999 | username658@gmail.com | user1234@ | user1234@       |



