Feature: DIY Projects and Ideas page

  @regression
  Scenario: Backyard
    Given on the DIY Wood Projects page with the Backyard checkbox is selected
    When i uncheck the Backyard checkbox
    Then i see the message Home Area: Backyard is gone
