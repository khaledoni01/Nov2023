Feature: Verify NK login functionality

  Scenario Outline: Verify NK login
    Given User is in login page
    When User provides username "<uname>" and password "<pword>"
    Then User is logged in
    Examples:
      | uname   | pword   |
      | admin   | admin   |

  Scenario Outline: Verify NK login 2
    Given User is in login page
    When User provides username "<uname>" and password "<pword>"
    Then User is logged in
    Examples:
      | uname   | pword   |
      | admin   | admin   |
      | invalid | invalid |
