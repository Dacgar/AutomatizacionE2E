Feature: Purchase flow


  @buysTelephoneEquipment
  Scenario: buy products
    Given Login to the page
    And I add multiple products to cart
    When the user completes the purchase form
    Then  the purchase is finalized
