Feature: Admin Login for OrangeHRM

Scenario: Validate Admin Login
    Given Open the Browser
    And Enter Website
    And Enter Admin Username
    And Enter Admin Password
    And Click on Login
    Then Admin Logs in
    And Admin clicks PIM
    Then Navigated to PIM page
    And Admin clicks ADD button
    Then Navigated to Add Employee Page
    And Enter First Name
    And Enters Middle Name
    And Enters Last Name
    And Clicks on Save


    