Feature: Login feature with Data for Orange HRM 
Scenario: This is Login scenario with data
Given Launch Login Page Application
When User Enter Valid credentails "Admin" and "admin123"
And user click on Login Button
Then login page redirect to HomePage