Feature: Simple calculation

  @Additions
  Scenario Outline: <TCID> - addition tests
    Given x + y = z
    When x = <x>
    And y = <y>
    Then total is <Total>
    @TC-001
    Examples:
      | TCID   | x | y | Total |
      | TC-001 | 5 | 6 | 11    |
    @TC-002
    Examples:
      | TCID   | x | y | Total |
      | TC-002 | 1 | 9 | 10    |
    @TC-003
    Examples:
      | TCID   | x | y | Total |
      | TC-003 | 8 | 9 | 17    |