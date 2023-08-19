Feature: Home Depot clear history  Functionality.
Scenario: As a user, I want to click to clear all my recently viewed history items, so there are no recently viewed items
Given the Open Home Depot page.
When typing hammer on the search bar and click the search button.
And click on clear search history.
Then no recent view history .