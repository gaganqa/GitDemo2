Feature: Home Page
         In Order to check my order details 
         as a registered user 
         I want to specify the faetures of order details page 
Background:
    Given a registered user exists
    Given user is on login page 
    Then user enter user name
    And user enter password 
    And user click on login button 
    Then user navigates to order page
 
 Scenario: Check prevoius order details 
    When user click on order link
    Then user checks previous order details
    
Scenario: check open order details
    When when user click on open order details link
    Then user checks open order details 
    
Scenario: check cancelled order details
    When user clicks on cancelled order details link
    Then user checks cancelled order details 
        
    
 
 
 
          