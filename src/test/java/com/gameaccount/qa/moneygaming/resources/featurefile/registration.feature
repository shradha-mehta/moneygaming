Feature: Register Functionality

  As a new moneygaming.com player
  I want to be able to register using my full details
  So that I can play online casino games

  Scenario Outline: Verify user should not register without Date of Birth
    Given I am on money gaming homepage
    And I click on join now button
    And I select title
    When I enter my first name "<firstName>"
    And I enter sur name "<surName>"
    And I click on check box of terms and condition
    And I click on join now form button
    Then I should not register successfully and see "<errorMessage>"

    Examples:
      | firstName | surName |  errorMessage           |
      | Tameena      |  Martin |  This field is required |


