Feature: Google search feature

  Scenario: Test google search with valid keyword
    Given open google app in browser
    When User enter valid keyword and go for search
    Then Appliction should display valid result
