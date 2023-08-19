Feature: DIY Projects and Ideas page

  @regression
  Scenario: Buying Guides
    Given on the DIY Wood Projects page with the Buying Guides checkbox is selected
    When i uncheck the Buying Guides checkbox
    Then i see the message Information Type: Buying Guides is gone
