@Regression
Feature: Simple calculation

  @Additions
  Scenario Outline: <TCID> - addition tests
    Given x + y = z
    When x = <x>
    And y = <y>
    Then total is <Total>
    @TC-001
    Examples:
      | TCID    | x | y | Total |
      | TC-A001 | 5 | 6 | 11    |
    @TC-002
    Examples:
      | TCID    | x | y | Total |
      | TC-A002 | 1 | 9 | 10    |
    @TC-003
    Examples:
      | TCID    | x | y | Total |
      | TC-A003 | 8 | 9 | 17    |
    @TC-004
    Examples:
      | TCID    | x | y | Total |
      | TC-A004 | 8 | 8 | 17    |

  @Multiplication
  Scenario Outline: <TCID> - multiplication tests
    Given x * y = z
    When x = <x>
    And y = <y>
    Then total is <Total>
    @TC-001
    Examples:
      | TCID    | x | y | Total |
      | TC-M001 | 5 | 6 | 30    |
    @TC-002
    Examples:
      | TCID    | x | y | Total |
      | TC-M002 | 1 | 9 | 10    |
    @TC-003
    Examples:
      | TCID    | x | y | Total |
      | TC-M003 | 8 | 9 | 72    |
    @TC-004
    Examples:
      | TCID    | x | y | Total |
      | TC-M004 | 8 | 8 | 17    |