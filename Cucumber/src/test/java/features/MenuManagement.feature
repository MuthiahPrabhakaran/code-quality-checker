Feature: Menu Management
  Scenario: Add a Menu Item
    Given I have a menu item with name "Cucumber Sandwitch" and price 20
    When I add that menu item
    Then Menu item with the name "Cucumber Sandwitch" should be added
