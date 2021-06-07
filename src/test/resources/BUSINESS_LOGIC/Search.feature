Feature: Search feature
Background: user is successfully logged in 
When user opens "chrome" browser with exe "C:\\Automation Support\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"
When user enters"Admin" as username
When user enters "Admin" as password
When user click on Login button

@SmokeTest
Scenario: Search feature
When user click on Branches 
When user select Country "INDIA" as Country
When user select State "Delhi" as state
When user select City "Delhi" as city
When user click on Search button
Then application navatigate for "Branch Details" page
