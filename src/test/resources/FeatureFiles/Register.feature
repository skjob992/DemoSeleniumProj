Feature: Register functionality scenario

  @Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration Page
    When I provide all the below valid details
      | FirstName | Ravi               |
      | LastName  | Kiran              |
      | Email     | skjob992@gmail.com |
      | Teleohone |         8767654543 |
      | Password  | rkiran             |
    And I select the privacy policy
    And I click continue button
    Then I should see the User account has been created successfully
