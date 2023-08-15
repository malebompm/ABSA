@AddUser
  Feature: Adding users
    Background:
      Given User is on the admin page
      Then User must see the amin page

    Scenario Outline: Adding users

      When User enters user info "<First Name>","<Last Name>","<User Name>", "<Password>", "<Customer>", "<Role>","<Email>","<Cell>"
      Then Ensure that your users are added to the list

      Examples:
      |First Name|Last Name|User Name|Password|Customer|Role|Email|Cell|
      | FName1   | LName1  |User1    |Pass1   |Company AAA|Admin|admin@mail.com|082555|
      | FName2   | LName2  |User2    |Pass2   |Company BBB|Customer|cusomter@mail.com|082444|
