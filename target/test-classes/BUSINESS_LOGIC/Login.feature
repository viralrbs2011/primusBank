Feature: Login feature
Background: user is successfully logged in 
When user opens "chrome" browser with exe "C:\\Automation Support\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"

@Login
Scenario: Login with valid data
When user enters"Admin" as username
When user enters "Admin" as password
When user click on Login button
Then aaplication navigate on "Admin" page







