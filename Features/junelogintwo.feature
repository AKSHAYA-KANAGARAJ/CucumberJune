Feature: June FB login

  Scenario: Fifth Login
    Given Open Facebook and launch
    When Enter data table values
    	|Username 	| Pwd  |
      | Akshaya   | Aks  |
      | Jegadeesh | Jega |
      | Shree     | Shr  |
    Then Close the browser
