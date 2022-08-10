Feature: Do posts

  Scenario: Posts get API test cases
    Given url  'http://localhost:3000/posts'
    When method get
    Then status 200;

  Scenario: Post posts API
    Given url 'http://localhost:3000/posts'
    And request {"name":"morpheus","job":"leader"}
    When method post
    Then status 201
    And  print response


