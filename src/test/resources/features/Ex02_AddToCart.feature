	Feature: Add to Cart
 
  Scenario Outline: Validate user is able to Add to Cart using valid data
    Given Chrome is opened and AsianPaints app is opened
    When User clicks on Shop Section
    Then User navigates on the Shop Page
    And User clicks on Wallstickers
    Then User navigates to the Wallstickers page
    When User clicks on sort by Field
    And User selects Priority- Low to High
    Then Application sorts the wall stickers list based on price
    And User clicks on any particular sticker
    Then User enters the pincode "<pincode>"
    Then Add to Cart button is successfully clicked
 
    Examples:
      | pincode |
      |  823001 |
      
  Scenario Outline: Validate user is able to Add to Cart using invalid data
    Given Chrome is opened and AsianPaints app is opened
    When User clicks on Shop Section
    Then User navigates on the Shop Page
    And User clicks on Wallstickers
    Then User navigates to the Wallstickers page
    When User clicks on sort by Field
    And User selects Priority- Low to High
    Then Application sorts the wall stickers list based on price
    And User clicks on any particular sticker
    When User enters the pincode "<pincode>"
    Then Add to Cart button is unsuccessfully clicked
 
    Examples:
      | pincode |
      |  000000 |
 

