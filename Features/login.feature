Feature: Login
  Scenario: Successful login with valid Credentials
    Given User Launches Chrome Browser
    When User opens the URL "https://www.nopcommerce.com/en/login"
    Then User enters the valid email and password
    And Clicks on Login Button
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Logout Link
    Then Page Title should be "Your store. Login"
    And Close Chrome Browser

