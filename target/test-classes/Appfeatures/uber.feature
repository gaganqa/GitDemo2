Feature: Uber Booking Feature
@Smoke
Scenario: Booking cab Sedan
Given User want to select car type "sedan" from uber app
When user select car type "sedan" pickup point "toronto" drop off point "london"
Then driver starts journey
And driver ends joureny
Then user pays 1000 usd 

@Sanity
Scenario: Booking cab SUV
Given User want to select car type "SUV" from uber app
When user select car type "sedan" pickup point "london" drop off point "wooddstock"
Then driver starts journey
And driver ends joureny
Then user pays 1000 usd

@Regression
Scenario: Booking cab Mini Car
Given User want to select car type "Mini Car" from uber app
When user select car type "sedan" pickup point "etobicoke" drop off point "brampton"
Then driver starts journey
And driver ends joureny
Then user pays 1000 usd


 

