Feature: Flex Plan End to End Journey for MNC account

  Scenario Outline: To verify Sales rep is able to perform an E2E Bespoke journey with FlexPlan product having term of 24 months and 'Flex Plan 10GB' tariff for a MNC account
    Given User login as Sales representative
    When Sales representative creates an opportunity with the following details "<Account_Name>" "<Deal_Type>" "<Type_of_support>"
    Then Sales rep adds the Enterprise product details for FlexPlans products
      |Product_Category  |Product                         |Product_Detail                             |Quans  |LOC |Billed_Upfront|Revenue_per_month |Business_Type   |
      |Mobile            |Flex Plan                       |Flex 2                                     |2500   |1   |10000         |150000            |New / Additional|
      |Mobile            |Flex Plan                       |Flex                                       |2500   |1   |10000         |150000            |New / Additional|
      |Mobile            |Flex Plan                       |Flex 5                                     |2500   |1   |10000         |150000            |New / Additional|

    Then Sales rep creates a product basket to add FlexPlans products
    Then Sales rep configures FlexPlans products in the basket with the following details "<Standard_or_Bespoke_1>" "<Standard_or_Bespoke_2>" "<x>" "<Term>" "<Voice_and_Aggregated_Data_SIMs>" "<Aggregated_Data_Only_SIMs>" "<Transformation_Fund>" "<tariff>" "<discount>" "<Private_APN>"
    Then Sales representative configures the required Call mix details
    Then Sales rep provides discount under discount section
    Then Sales rep opens Clauses section to update the required details
    Then Sales rep views the Profit and Loss section for the configured FP products
    Then Sales rep submits basket for approval and Finance approves basket and basket is synced with the opportunity

    Examples:
      |DDP_Scenario_Identifier|Account_Name  |Deal_Type   |Type_of_support             |Standard_or_Bespoke_1|Standard_or_Bespoke_2      |x|Term|Voice_and_Aggregated_Data_SIMs|Aggregated_Data_Only_SIMs|Transformation_Fund|tariff                  |discount|Private_APN|
      |                       |1000+ Sites   | Acquisition| Self-serve pricing tools   |Standard (Fast-Track)|Bespoke (Approval Required)|1|24  |100                           |0                        |No                 |Flex Plan 10GB          |0       |No         |
