
Feature: Demo rest api testing
Scenario: Testing valid GET endpoint
Given url 'http://jsonplaceholder.typicode.com/todos/1' 
When method GET
Then status 200
And match response.title=='delectus aut autem'  



Scenario: Testing valid POST endpoint
Given url 'http://jsonplaceholder.typicode.com/posts' 
And request {"title":"foo","body":"bar","userId":1}
When method POST
Then status 201
And match response.title=='foo'
And resp =response  