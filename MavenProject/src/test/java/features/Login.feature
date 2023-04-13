Feature: LeafTaps login functionality

Scenario: Login with positive credential
Given Open the Chrome browser
And Load the application url
And Enter the username as demosalesmanager
And Enter the password as demosalesmanager
When Click on Login button
Then Homepage should be displayed
