Feature: Menu Management

  @ListOfStrings
  Scenario: Bill amount generation
    Given I placed an order with following item
    |Cucumber Sandwich|2|20
    When I generate the bill
    Then A bill for 40 should be generated

  @ListOfListOfStrings
  Scenario: Bill amount generation for multiple items
    Given I placed an order with following items
      |Cucumber Sandwich|2|20
      |Cucumber Salad   |1|15
    When I generate the bill
    Then A bill for 55 should be generated


  @ListOfMaps
  Scenario: Bill amount generation for multiple items
    Given I placed an order with following items through map
      |Item Name        |Quantity
      |Cucumber Sandwich|2
      |Cucumber Salad   |1
    When I generate the bill
    Then A bill for 55 should be generated