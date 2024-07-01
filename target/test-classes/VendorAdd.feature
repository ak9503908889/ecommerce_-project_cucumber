Feature: Add new vendor
  Scenario: add vendor details with valid data Successfully
    Given user is on Dashboard page open url "https://ecom.mahendranikam.com/login"
    When Enter mail id "superadmin@demo.com"
    And Enter password "123456"
    And chek the option 'remember me'
    And Click on Login button
    Then user is navigating to dashborad page
    When user click on merchants menu icon
    Then merchants page should be open
    When user click on Add new vendor button
    And Enter all details in form
    Then user should be successfully add new vendor