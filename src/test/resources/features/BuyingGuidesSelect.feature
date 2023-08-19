Feature: DIY Projects and Ideas page

  @regression
  Scenario: Buying Guides
    Given on the DIY Wood Projects page
    When i click on the Buying Guides checkbox
    Then i see the message Information Type: Buying Guides
