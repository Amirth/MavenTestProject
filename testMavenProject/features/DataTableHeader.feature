Feature: Data Table Header Login feature for Orange HRM 
Scenario: Data Table Header Login scenario 
Given Go To Application with login page
When Enter below details
|Username|Password|
|Admin|admin123|
And click Login Button
Then current page redirect to home page