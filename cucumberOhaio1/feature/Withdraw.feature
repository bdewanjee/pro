@withdraw
Feature: withdraw feature

  Scenario Outline: to verify the withdraw functionality.
    Given I have an account with <init> amount.
    When I withdraw <some> amount from my account.
    Then I verify the balance will be <bal> in my account.

    Examples: 
      | init | some | bal |
      |  500 |   50 | 450 |
      | 1000 |  700 | 300 |
