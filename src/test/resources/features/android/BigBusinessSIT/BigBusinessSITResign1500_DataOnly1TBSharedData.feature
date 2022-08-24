Feature: feature001

  Scenario Outline: To verify Sales rep is able to do Resign with 1500 connections of Big Business product with (1 TB Shared Data) data only plan and validate the basket in SIT
    Given User logins in SIT environment as Enterprise Sales representative for DDP
    Then Sales rep for DDP creates an opportunity with the following details "<Account_Name>" "<Deal_Type>" "<Type_of_support>"
    Then Sales rep adds the Enterprise product details for all DDP products
      |Product_Category  |Product                         |Product_Detail |Mobile_Tariffs |Mobile_Services|Quans  |LOC |Billed_Upfront|Revenue_per_month |Business_Type   |
      |Mobile            |Voice & Data                    |Voice & Data   |Standard       |Standard       |200    |1   |500           |15000             |New / Additional|
    Then Sales rep creates a product basket to add DDP products
    Then Sales rep configures all DDP products in the basket with the following details"<NoOfConnections>" "<ProvisionalTarrif>" "<BillSpendCap>" "<PrivateAPN>" "<MobexRequired>" "<MobexService>" "<Type>" "<VoiceType>" "<Term>" "<DataType>" "<DataAllowance>" "<CappedOrUncapped>" "<AggregatedData>"
    Then Sales representative adds the required Call mix details
    Then Sales rep updates Clauses section with the required details"<TF>"
    Then Sales rep gives discount under discount section
    Then Sales rep verifies Profit and Loss section for the configured FP products
    Then Sales rep validates the basket page
    Then Sales rep submits the basket for approval and Finance approves the basket and basket is synced with the opportunity

    Examples:
      |Scenario_Identifier |Account_Name  | Deal_Type  | Type_of_support         | NoOfConnections   | ProvisionalTarrif  | BillSpendCap |PrivateAPN|MobexRequired|MobexService|Type         |VoiceType|Term|DataType  |DataAllowance  |CappedOrUncapped|AggregatedData|Connections_Resign|Revenue_Resign|TF |
      |ID_619              |Test Private  | Resign     | Self-serve pricing tools| 1500              | No                 | No           |No        |No           |            |Data Only    |         |24  |Shared    |1TB Shared Data|Uncapped        |              |1700              |100000        |100|
