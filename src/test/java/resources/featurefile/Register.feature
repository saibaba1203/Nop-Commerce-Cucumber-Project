Feature: Register Test
  As a user I should register successfully

  Background: I am on homepage

  @Smoke @Regression
  Scenario: Verify user should navigagte to register page successfully
    When    I click on register link
    Then    I am on register page

  @Sanity @Regression
  Scenario: verify That First Name Last Name Email Password And Confirm Password Fields Are Mandatory
    When    I click on register link
    And     I click on register button
    And     I get error message 'First name is required'
    And     I get error message 'Last name is required'
    And     I get error message 'Email is required'
    And     I get error message 'Password is required'
    And     I get error message 'Confirm Password is required'
    Then    I am not able to register successfully

  @Regression
  Scenario: Verify that user should create account successfully
    When    I click on register link
    And     I click on Gender "Male"
    And     I enter First Name "Harry" into 'First name' field
    And     I enter Last Name "Potter" into 'Last name' field
    And     I select day "1" for 'Date of birth' field
    And     I select month "January" for 'Date of birth' field
    And     I select year "1980" for 'Date of birth' field
    And     I enter email "harry.potter21@gmail.com" into 'Email' field
    And     I enter password "Harry123" in 'Password' field
    And     I enter confirm password "Harry123" into 'Confirm password' field
    And     I click on register button
    Then    I am able to register successfully
