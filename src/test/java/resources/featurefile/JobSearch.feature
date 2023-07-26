@smoke @regression
Feature: Job search test

  Scenario Outline: Verify job search result using different data set
    Given I am on the homepage
    When I accept all cookies
    And I enter job title "<jobTitleField>"
    And I enter Location "<locationField>"
    And I select distance "<distanceDropDown>"
    And I click on moreSearchOptionsLink
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryTypeDropDown>"
    And I select jobType "<jobTypeDropDown>"
    And I click on 'Find Jobs' button
    Then I can see the result "<resultText>"

    Examples:
      | jobTitleField       | locationField          | distanceDropDown | salaryMin | salaryMax | salaryTypeDropDown | jobTypeDropDown | resultText                                   |
      | Tester              | Harrow, Greater London | 5 miles          | 30000     | 500000    | Per annum          | Permanent       | Permanent Tester jobs in Harrow              |
      | Tester              | Harrow, Greater London | 15 miles         | 35000     | 400000    | Per annum          | Permanent       | Permanent Tester jobs in Harrow              |
      | Automation Tester   | Harrow, Greater London | 7 miles          | 40000     | 300000    | Per annum          | Permanent       | Permanent Automation Tester jobs in Harrow   |
      | Automation Engineer | Harrow, Greater London | 2 miles          | 45000     | 500000    | Per annum          | Permanent       | Permanent Automation Engineer jobs in Harrow |
      | Tester              | Harrow, Greater London | 10 miles         | 65000     | 900000    | Per annum          | Permanent       | Permanent Tester jobs in Harrow              |
      | Tester              | Harrow, Greater London | 10 miles         | 35000     | 950000    | Per annum          | Permanent       | Permanent Tester jobs in Harrow              |
      | Tester              | Harrow, Greater London | 15 miles         | 55000     | 850000    | Per annum          | Permanent       | Permanent Tester jobs in Harrow              |