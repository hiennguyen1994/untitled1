Feature: Login611

  @appium
  Scenario Outline: Login failed with invalid username and password - account 1
    When I click next button
    And I click skip intro
    And I input email "<email>"
    And I input password "<password>"
    And The error message "<errorE>" is displayed
    Then The error message for password"<errorP>" is displayed
    Examples:
      | email   | password | errorE           | errorP                                |
      | hnhaplo | 1234     | Email is invalid | Password must be minimum 8 characters |
      | hnhaplo@ | 1234gm1     | Email is invalid | Password must be minimum 8 characters |

  @appium
  Scenario Outline: Login failed with invalid username and password - account 2
    When I click next button
    And I click skip intro
    And I input email "<email>"
    And I input password "<password>"
    And I click login button
    Then The error message snackbar "<error>" is displayed
    Examples:
      | email                 | password     | error                 |
      | hnhap@gmail.com       | test1234     | User not found        |
      | hnhaplo+1@gmail.com   | 87654321     | Password is incorrect |
      | hnhaplo+02@gmail.com  | 12345678     | User not found        |

  @appium
  Scenario Outline: Login failed with invalid username and password - account 3
    When I click next button
    And I click skip intro
    And I input email "<email>"
    And I input password "<password>"
    And I click login button
    Examples:
      | email               | password     |
      | hnhaplo+1@gmail.com | 12345678     |