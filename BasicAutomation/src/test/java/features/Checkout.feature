Feature: Checkout the order for Product
@PlaceOrder
Scenario Outline: Checkout the order for Product without Login
    Given User is on BaseStore Landing page
    When User searched with product code <Product Code> and extracted actual code of Product
    And Added "1" items of the selected product to the cart
    Then User continue to Checkout
    And Displayed the Login Page
    
Examples:
| Product Code |
| EXT0004      |

@PlaceOrder
Scenario Outline: Checkout the order for Product with invalid Login credentials
    Given User is on BaseStore Landing page
    When User searched with product code <Product Code> and extracted actual code of Product
    And Added "1" items of the selected product to the cart
    And User continue to Checkout
    Then Displayed the Login Page
    And User login into Application with wrong "demouser1" and "Test1234!" from Login page
    And Validate message displayed

Examples:
| Product Code |
| EXT0004      |

  
