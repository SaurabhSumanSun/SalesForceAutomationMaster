Feature: feature001

  Scenario Outline: To verify Sales rep is able to do Resign journey with 3500 connections of Big Business product with data allowance capped at 10GB and validate the basket in Pre Prod
    Given User logins as Enterprise Sales representative for DPT
    Then Sales rep for DPT creates an opportunity with the following details "<Deal_Type>" "<Type_of_support>"
    Then Sales rep for DPT adds the Enterprise product details for all DDP products
      |Product_Category  |Product                         |Product_Detail |Mobile_Tariffs |Mobile_Services|Quans  |LOC |Billed_Upfront|Revenue_per_month |Business_Type   |
      |Mobile            |Voice & Data                    |Voice & Data   |Standard       |Standard       |200    |1   |500           |15000             |New / Additional|
    Then Sales rep for DPT creates a product basket to add DDP products
    Then Sales rep for DPT configures all DPT products in the basket with the following details"<NoOfConnections>" "<ProvisionalTarrif>" "<BillSpendCap>" "<PrivateAPN>" "<MobexRequired>" "<MobexService>" "<Type>" "<VoiceType>" "<Term>" "<DataType>" "<DataAllowance>" "<CappedOrUncapped>" "<AggregatedData>"
    Then Sales representative configures Resign details"<Connections_Resign>" "<Revenue_Resign>"
    Then Sales representative configures Call mix details
    Then Sales rep for DPT visits Clauses section to update the required details"<TF>"
    Then Sales rep for DPT verifies the discount section
    Then Sales rep for DPT views the Profit and Loss section for the configured DPT products
    Then Sales rep for DPT validates the basket page
    Then Sales rep for DPT submits basket for approval and Financial approvers for DPT approve the basket and the basket is synced with the opportunity

    Examples:
      |Scenario_Identifier |Account_Name  | Deal_Type  | Type_of_support         | NoOfConnections   | ProvisionalTarrif  | BillSpendCap |PrivateAPN|MobexRequired|MobexService|Type         |VoiceType|Term|DataType  |DataAllowance  |CappedOrUncapped|AggregatedData|Connections_Resign|Revenue_Resign|TF |
      |ID_525 ID_526 ID_527|Test Private  | Resign     | Self-serve pricing tools| 3500              | No                 | No           |No        |No           |            |Voice & Data |PAYU     |24  |Individual|10GB           |Capped          |              |3700              |100000        |100|
