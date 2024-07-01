Feature: Register user on zcart application
  Scenario: user registration on valid credentials
    Given Open url in browser "https://ecom.mahendranikam.com/customer/register"
    When  user enter full name as a " Amit kale"
    And user enter valid email as a " Amitkalepatil.281995@gmail.com"
    And user enter valid password "Amit@1995"
    And user Again enter confirm password "Amit@1995"
    And clik on chekbox  SUBSCRIBE TO THE NEWSLETTER
    And click on chekbox  I AGREE WITH THE TERMS
    And click on register button
    Then user should be successfully register