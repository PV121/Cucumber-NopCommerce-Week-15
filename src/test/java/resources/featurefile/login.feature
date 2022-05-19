Feature: Login Test
  As a user I want to login into nop commerce website

@smoke  @regression
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully
@sanity @regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email                | password | errorMessage                                                                                |
      | abcd123@gmail.com    | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@yahoo.com     | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@hotmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
@sanity @regression
  Scenario: Verify the user should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "username155@gmail.com"
    And I enter password "jos@123"
    And I click on login button
    Then I should login successfully
    And I should see the LogOut link
@regression
    Scenario: Verify that user should LogOut successFully
      Given I am on homepage
      When I click on login link
      And I enter email "username658@gmail.com"
      And I enter password "jos@123"
      And I click on login button
      And I should click on logout link
      Then I should see LogIn link


