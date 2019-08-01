Feature: Login feature

  Scenario: Verify that user is able to successfully login to demoqa.com
    Given A user is on store.demoqa.com
    When user clicked on MyAccount link
    Then user is taken to Login Page
    When user enters a valid name and password
    Then user is able to login successfully
