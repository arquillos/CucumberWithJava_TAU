Feature: Login Functionary
  In order to do internet banking
  As a valid Para Bank customer
  I want to login successfully

  Scenario Outline: Login successful
    Given I am in the login page of the Para Bank application
    When I enter valid <username> and <password>
    Then I should be taken to the Overview page

    Examples:
      | username    | password   |
      | "arquillos" | "password" |