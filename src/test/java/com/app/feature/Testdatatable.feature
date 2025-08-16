Feature: LoginPage automation one

Background:
 Given Launch the URL "https://www.google.com"


  @test1
  Scenario: Validate the valid username and password
    When Enter the username "Aiite1"
    And Enter the password "Aitujjsdc"
    And Click the login button
    Then Validate the Homepage

  @test1
  Scenario: Validate the invalid username and password
    When Enter the username "Aiitedwerwer1"
    And Enter the password "Aitujjwfwefwewefsdc"
    And Click the login button
    Then Validate the Homepage
