Feature: Shop Page 
 
 
Scenario: Validate User navigates onto Shop Page
   Given Chrome is opened and AsianPaints app is opened
   When User clicks on Shop Section
   Then User navigates on the Shop Page
   
Scenario: Validate User navigates onto Wallsticker Page
   Given Chrome is opened and AsianPaints app is opened
   When User clicks on Shop Section
   Then User navigates on the Shop Page
   And User clicks on Wallstickers
   Then User navigates to the Wallstickers page
   
Scenario: Validate User is able to click on Sort By Field 
	 Given Chrome is opened and AsianPaints app is opened
   When User clicks on Shop Section
   Then User navigates on the Shop Page
   And User clicks on Wallstickers
   Then User navigates to the Wallstickers page
   When User clicks on sort by Field
   And User selects Priority- Low to High
   Then Application sorts the wall stickers list based on price
   


   
   
