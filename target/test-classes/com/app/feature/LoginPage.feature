Feature: Login Page Scenario

  @exe
  Scenario: Login with valid username and password
    Given Browser open
    When Enter the username
    And Enter the password
    And Click the login button
    
  @exe
  Scenario: Search for Hotel
    When Select the location
    And Select the hotel
    And Select roomtype
    And Select roomnos
    And Enter datein
    And Enter dateout
    And Select adultroom
    Then click submit

  @exe
  Scenario: Select hotel name and continue
    When click radiobutton
    Then click continue

  @exe
  Scenario: Book the selected hotel
    When Enter first name
    And Enter last name
    And Enter address
    And Enter creditcard num
    And Select creditcard type
    And Select creditcard expyear
    And Select creditcard empmon
    And Enter cccvv
    And click booknow
    Then get the orderno
