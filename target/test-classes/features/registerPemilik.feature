Feature: Login


  Scenario Outline: register pemilik with valid data
    Given user on first page
    And user click next button thrice
    And user click start button
    And user select role pemilik
    And user input email <email>
    And user input phone<phone number>
    And user input password<password>
    And user input confirmation password<confirmation password>
    When user click register
    Then user in TOS page
    Examples:
      |email  |phone number |password |confirmation password |
      |"nizam.aditya@gmail.com" | "08234567890" |"Test123"|"Test1234"|



