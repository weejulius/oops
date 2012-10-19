Feature: refine html page
  In order to remember the knowledge from the internet
  And the knowledge is well organized
  As a user I want to extract the knowledge from html and purify


  Scenario: refine an local html page
    Given an html at "<url>simple.html</url>"
    When I refine the html
    Then I should see the html is refined to <url>simple.md</url>

