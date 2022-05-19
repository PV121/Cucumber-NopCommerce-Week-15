Feature: Computer test
  As a user I want to purchase computer from nopCommerce website
@smoke @regression
  Scenario: verify user should navigate to computer page successfully
    Given I am on homepage
    When I click on Computer Tab
    Then I should navigate to Computer page successfully
    And Verify Computer text
@sanity @regression
  Scenario: verify user should navigate to desktops page successfully
    Given I am on homepage
    When I click on Computer Tab
    And I click on Desktops Link
    Then I should navigate to Desktops Page
    And Verify Desktops text
@regression
  Scenario Outline: verify that user should build you own computer and add them to cart successfully
    Given I am on homepage
    When I click on Computer Tab
    And I click on Desktops Link
    And  I click on product name Build your own computer
    And I select processor "<Processor>"
    And I Select RAM "<Ram>"
    And I select HDD "<HDD>"
    And I select OS "<OS>"
    And I select Software "<Software>"
    Then I click on ADD TO CART Button
    And I verify message The product has been added to your shopping cart
    Examples:
      | Processor                                       | Ram           | HDD               | OS                     | Software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | VistaHome [+$50.00]     | Total Commander [+$5.00]   |






