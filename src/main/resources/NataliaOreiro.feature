Feature: tour searching
  Scenario: searching all tours on chosen date for two people
    Given website https://www.phptravels.net/ is open
    When I click on "Tours"
    And I choose date
    And I choose number of guests
    And I click "search"
    Then I see list of all Tours available in chosen date for two people