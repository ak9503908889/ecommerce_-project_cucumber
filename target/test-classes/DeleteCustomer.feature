Feature: Delete Customer
  As a user
  I want to search for and delete a customer
  So that I can remove unnecessary customer records

  Scenario: Delete a customer by searching
    Given user is on Dashboard page open url "https://ecom.mahendranikam.com/login"
    When Enter mail id "superadmin@demo.com"
    And Enter password "123456"
    And chek the option 'remember me'
    And Click on Login button
    Then user is navigating to dashborad page
    When user click on customers Menu details icon
    Then customers page should be open
    When  click on search option
    And I select the customer from the search results
    And I confirm the deletion
    Then the customer "Amit kale" should be deleted successfully

