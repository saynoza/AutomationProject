Feature: Workspace feature

  Scenario: Verify user is able to add an item to the workspace
    Given user is logged in
    And user is on homepage
    When user clicks on Workspace button
    Then user is navigated to Bookmarks page
    When user clicks Wallcovering button
    Then user is navigated to the page with wallcovers



