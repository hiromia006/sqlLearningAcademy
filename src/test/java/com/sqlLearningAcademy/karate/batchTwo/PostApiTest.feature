Feature: Post Api

  Background:
    * url 'https://reqres.in/api'
    * header Accept = 'application/json'

  Scenario: Create user
    Given path '/users'
    And request {"name":"morpheus","job":"leader"}
    When method post
    Then status 201
    And print response

  Scenario: Create user3
    Given path '/users'
    And request someJson = read('createUser.json')
    When method post
    Then status 201
    And print response