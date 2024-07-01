Feature: add to Products
  Scenario: Add Products details with valid data
    Given open url in browser "https://ecom.mahendranikam.com/login"
    When Enter mail id "superadmin@demo.com"
    And Enter password "123456"
    And chek the option 'remember me'
    And Click on Login button
    Then User should be login
    When user click on Catalog
    And user click on Products
    And user click on Add Products
    And user Fill all details in From
    Then user successfuly Add Products Detils