Feature: Home Depot Search Functionality
Scenario: As a user, I want to search for a hammer and see all items related to the hammer displays only.
Given the Open Home Depot page.
When typing hammer on the search bar.
And click the search button.
Then see all items related to the hammer only.
