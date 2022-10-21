@homepage
Feature: HN Homepage
  @RegressionTesting
  Scenario: Navigate to HN Website
    Given open browser and enter url and navigate to HN website
    Then get title and assert
  @SmokeTesting
  Scenario: Navigate to HN Website
    Given open browser and enter url and navigate to HN website
    Then get title and assert