Feature: login Feature with Examples
Scenario Outline: DataTable with example scenario
Given proceed to orange Application
When User enters username "<UserName>" and password "<Password>"
And user clicks login button
Then login page redirect to home page

Examples:
|UserName | Password|
|Admin | admin123|
|Admin | admin123|