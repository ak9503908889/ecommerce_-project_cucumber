Feature: add to Attributes
  Scenario: Add Attributes details with valid data
    Given open url in browser "https://ecom.mahendranikam.com/login"
    When Enter mail id "superadmin@demo.com"
    And Enter password "123456"
    And chek the option 'remember me'
    And Click on Login button
    Then User should be login
    When user click on Catalog
    And user click on Attributes
    And user click on Add Attributes button
    And user Fill all details on Attributes form
    Then user successfuly Add Attributes Detils