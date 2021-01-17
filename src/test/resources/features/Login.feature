Feature: Registration functionality scenarios

  @Login
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    Given I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Alexander                        |
      | LastName  | Gregor                           |
      | Email     | alex.gregor.steelheart@gmail.com |
      | Telephone | 0918381980                       |
      | Password  | fakepassword                     |
    When I select the Privacy Policy
    When I click on Continue button
    Then I should see that the User Account has successfully created