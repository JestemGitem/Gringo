Feature: login feature
  Scenario: Login on website
    When I enter correct login
    And I enter correct password
    And I click login button
    Then I login on website