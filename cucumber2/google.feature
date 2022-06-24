Feature: Google search feature

  Scenario: Test google search window
    Given Open google app in browser
    When User enter valid keyword
    Then Application should display valid result
