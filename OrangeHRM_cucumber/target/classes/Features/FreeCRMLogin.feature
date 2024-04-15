Feature: Feature to Login into FreeCRM Account

Scenario: Login into FreeCRM Account
    Given Browser is Open
    And user enters URL
    And User clicks on Login Tab
    And User enters Username and Password
    And User clicks on LoginButton
    Then User navigated to dashboard
    And User clicks on SettingIcon
    And User clicks LogOut
    Then User naviggated to LoginPage
    And Close the Browser