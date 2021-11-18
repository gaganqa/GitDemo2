
Feature: user registration
Scenario: user registration with differnt data 
Given user is on registration page 
When user enters following details 
    | firstname | lastname | email | postalcode | city | 
    | gagan | shemar | a@gamil.com | m9v1y1 | etobicoke |
    | sharan | shemar | b@gmail.com | m9v1y1 | etobicoke |
    | jassi | shemar | c@gmail.com | m9v1y1 | etobicoke|
Then user registration is sucessfull .    