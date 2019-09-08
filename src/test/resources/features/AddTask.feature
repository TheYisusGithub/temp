Feature: Creation funtional and acceptance
  @Acceptance
  Scenario: The user add in the board new task to do
    Given The user go to the page kanbanflow to login
    When The user add new task to do
    Then The access is successfuly
