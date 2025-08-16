Feature: LoginPage automation

  @test1_one
  Scenario: Validate the valid username and password
    Given Launch the URL "https://www.google.com"
    When Enter the username "Aiite1"
    And Enter the password "Aitujjsdc"
    And Click the login button
    Then Validate the Homepage

  @test1_one
  Scenario: Validate the invalid username and password
    Given Launch the URL "https://www.google.com"
    When Enter the username "Aiitedwerwer1"
    And Enter the password "Aitujjwfwefwewefsdc"
    And Click the login button
    Then Validate the Homepage

  @tagscenario_outline
  Scenario Outline: Vallidate the login page
    Given Launch the URL "https://www.google.com"
    When Enter the user "<username>"
    And Enter the pass "<password>"
    And Click the login button
    Then Validate the Homepage

    Examples: 
      | username | password |
      | Aiite1   | pass1    |
      | Aiite2   | pass2    |
      | Aiite3   | pass3    |
