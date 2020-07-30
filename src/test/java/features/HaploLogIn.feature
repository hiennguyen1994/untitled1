Feature: Login611

  @appium
  Scenario Outline: Login failed with invalid username and password - case 1
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
  Scenario Outline: Login failed with invalid username and password - case 2
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
  Scenario Outline: Forgot password - case 3
    When I click next button
    And I click skip intro
    And I click forgot password
    And I enter email "<emailForgot>"
    Then The error message for invalid email "<errorForgot>" is displayed

    Examples:
      | emailForgot                      |errorForgot|
      | hnhaplo                          |Email is invalid|

  @appium
  Scenario Outline: Forgot password - case 4
    When I click next button
    And I click skip intro
    And I click forgot password
    And I enter email "<emailForgot>"
    And I click Next button in forgot password
    Then The snackbar error message for invalid email "<errorForgotSnackbar>" is displayed

    Examples:
      | emailForgot                      | errorForgotSnackbar    |
      | hnhaplo+100@gmail.com             | Email is invalid       |

  @appium
  Scenario Outline: Forgot password - case 5
    When I click next button
    And I click skip intro
    And I click forgot password
    And I enter email "<emailForgot>"
    And I click Next button in forgot password
    Then I click Back login

    Examples:
      | emailForgot         |
      | hnhaplo+4@gmail.com |

  @appium
  Scenario Outline: Login successfully - case 6
    When I click next button
    And I click skip intro
    And I input email "<email>"
    And I input password "<password>"
    And I click login button
    Examples:
      | email               | password     |
      | hnhaplo+1@gmail.com | 12345678     |