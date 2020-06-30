Feature: Test Heroku
  Test login Functions

  @tag1
  Scenario: Login Functionality
    Given I am on Home page
    When user eneter username and password
    Then login successfully
