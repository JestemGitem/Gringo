Feature: Tour's filter search
  Scenario: searching only 5 stargrade tours using filters search
    Given website https://www.phptravels.net/ is open
    When I click on "Tours"
    And I choose date
    And I schoose number of guests
    And I click search
    Then I see list of all tours
      When In "filter search" I choose 5 star in stargrade
      And I click "Search"
      Then I see only 5 stargrade tours