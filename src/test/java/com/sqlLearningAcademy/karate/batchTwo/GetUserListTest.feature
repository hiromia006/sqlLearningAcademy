Feature: Get User List

  Background:
    * url 'https://reqres.in/api'

  Scenario: get user list
    Given url 'https://reqres.in/api/users?page=2'
    When method get
    Then status 200
    And print response

  Scenario: get user list with Assertion
    Given path '/users'
    And param page = 2
    When method get
    Then status 200
    And print response
    And assert response.page == 2
    And assert response.data[2].id == 9

  Scenario: get user list with Param & Assertion
    Given path '/users'
    And param page = 2
    When method get
    Then status 200
    And print response
    And assert response.page == 2
    And assert response.data[2].id == 9

  Scenario: Single user
    Given path '/users/2'
    When method get
    Then status 200
    And print response


   
