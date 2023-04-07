Feature: Register functionality scenario

  @Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration Page
    When I provide all the below valid details
      | FirstName | Ravi11               |
      | LastName  | Kiran11           |
      | Email     | sk1@gmail.com |
      | Teleohone |         9167654543 |
      | Password  | rkiran11             |
    And I select the privacy policy
    And I click continue button
    Then I should see the User account has been created successfully
