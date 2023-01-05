Feature: This is the search functionality

@testSearch
Scenario: Verify Laptop Page Is Displayed
Given Launch Application <"URL">
Then Input <"searchItem"> In Search Field
Then Click Search Button
Then Verify Laptop Page Is Displayed

