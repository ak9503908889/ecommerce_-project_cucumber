Feature: Add manufaturer
  Scenario: Add manufacturer details with valid data
    Given Open url in browser "https://ecom.mahendranikam.com/login"
    When Enter mail id "superadmin@demo.com"
    And Enter password "123456"
    And chek the option 'remember me'
    And Click on Login button
    Then user is navigating to dashborad page
    When user click on Catalog
    And user click on manufaturer menu
    And User click on Add manufaturer
    And User fill up all details of manufaturer in form
    Then User should be add manufaturer successfully