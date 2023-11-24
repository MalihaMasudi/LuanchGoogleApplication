Feature: feature to test Google Search functionality
  Scenario: Check launch Google and perform a search
    Given I open the Google homepage
    When I enter "Cucumber framework" into the search bar
    And I click the Google  Search button
    Then I should see search results
