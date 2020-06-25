Feature: Verify the Login Section

Scenario: User want to log in to account using valid login and password
    Given User navigate to URL
    When User input valid UserId
    And User write valid password
    And User click on Login button
    Then User should be successfully logged in