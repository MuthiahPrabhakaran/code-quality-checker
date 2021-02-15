Feature: Menu Management
  Background: Background step
    Given I have a menu item with name "Chicken Sandwitch" and price 20
    When I add that menu item
    Then Menu item with the name "Cucumber Sandwitch" should be added

  @SmokeTest
  Scenario: Add a Menu Item
    Given I have a menu item with name "Cucumber Sandwitch" and price 20
    When I add that menu item
    Then Menu item with the name "Cucumber Sandwitch" should be added

  @RegularTest
  Scenario: Add another Menu Item
    Given I have a menu item with name "Cucumber Salad" and price 40
    When I add that menu item
    Then Menu item with the name "Cucumber Sandwitch" should be added

  @SmokeTest @NightlyBuildTest
  Scenario: Add third Menu Item
    Given I have a menu item with name "Chicken Sandwitch" and price 20
    When I add that menu item
    Then I should see an error message "Duplicate Item"

