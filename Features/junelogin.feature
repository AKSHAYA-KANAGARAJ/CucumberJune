@Akshaya 
Feature: June FB login

    
  Scenario Outline: Second Login
  	
  	Given Open Facebook and launch
    When Enter Username as "<user>" and Password as "<pwd>"
    Then Close the browser
    
    Examples:
    |user						|pwd|
    |Akshaya				|aks|
    |Jegadeesh			|Jeg|
    |Pranavasree		|sre|
    |Sai VijayaSree	|sai|
    
  
    
   
