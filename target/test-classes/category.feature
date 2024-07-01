Feature: Add category
  @category1
  Scenario: user add category details with all fields
    Given Open url in browser "https://ecom.mahendranikam.com/login"
    When Enter mail id "superadmin@demo.com"
    And Enter password "123456"
    And chek the option 'remember me'
    And Click on Login button
    Then user is navigating to dashborad page
    When user click on Catalog
    And user click on Categories
    And User click on Group
    And User click on Add Catagories Group
    And User fill up categories form
    Then User should be add successfully Add Catagories Group

    @category2

    Scenario: user add category details only unrequired fields
      Given Open url in browser "https://ecom.mahendranikam.com/login"
      When Enter mail id "superadmin@demo.com"
      And Enter password "123456"
      And chek the option 'remember me'
      And Click on Login button
      Then user is navigating to dashborad page
      When user click on Catalog
      And user click on Categories
      And User click on Group
      And User click on Add Catagories Group
      And User fill up only unrequired filds in categories form
      Then User should not be add successfully Add Catagories Group
