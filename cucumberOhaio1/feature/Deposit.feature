@deposit
Feature: deposit feature

  Scenario Outline: to verify the deposit functionality
    Given I have an account with <init> amount.
    When I deposit <some> amount in my account.
    Then I verifiy the balance will be <bal> in my account.

    Examples: 
      | init | some | bal  |
      |  500 |   50 |  550 |
      | 1000 |  700 | 1700 |
