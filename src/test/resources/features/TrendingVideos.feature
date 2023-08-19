Feature: DIY Projects and Ideas page

  @regression
  Scenario: trending videos
    Given DIY Projects and Ideas page open
    When i click on the first trending video
    Then video starts playing
