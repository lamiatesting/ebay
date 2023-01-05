Feature: This is the category functionality/ Dropdown, mouseover


Scenario: Verify Books Page is Displayed
Given Launch Application <"URL">
Then Click Books From Category Dropdown
Then Click Search Button
Then Verify Books Page is Displayed

@test
Scenario: Verify Boats Page is Displayed
Given Launch Application <"URL">
Then Click Boats Under Motor
Then Verify Boats Page is Displayed