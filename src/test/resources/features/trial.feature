Feature: Registration functionality scenarios for a trial

  @Login2
  Scenario Outline: Check the user for my trial
    Given I launch the application with with "<browser>"
    Given I navigate to Account Registration page for a freedom
    When I provide all the below valid details neetly
      | FirstName | Alexander                        |
      | LastName  | Gregor                           |
      | Email     | alex.gregor.steelheart@gmail.com |
      | Telephone | 0918381980                       |
      | Password  | fakepassword                     |

    Examples:
      | browser |
      | chrome  |
      | chrome  |
      | firefox |
      | firefox |