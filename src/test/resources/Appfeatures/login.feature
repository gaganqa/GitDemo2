Feature: Login Feature
Scenario Outline: Login fail - possible combination 
Given User is on landing page 
When User click on sign in button 
Then login screen is displayed 
When user enter "<username>" in username field 
And user enter "<password>" in password field 
And user click in sign in button 
Then user gets login failed message 
   Examples:
   |  username | password |
   |  @@@@@    | 1w24325  |
   |  Gagan    | blank    |
   |  blank    | blank    |