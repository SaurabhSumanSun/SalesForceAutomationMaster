Feature: feature001

  Scenario Outline: To verify Sales rep is able to add (data, voice & data(individual), data(shared)) products, validate the basket and capture the Voice RRP and Data RRP in Pre Prod
    Given User logins as Enterprise Sales representative for GPT
    Then Sales rep for GPT creates an opportunity with the following details "<Account_Name>""<Deal_Type>" "<Type_of_support>"
    Then Sales rep for GPT adds the Enterprise product details for all DPT products
      |Product_Category  |Product                         |Product_Detail |Mobile_Tariffs |Mobile_Services|Quans  |LOC |Billed_Upfront|Revenue_per_month |Business_Type   |
      |Mobile            |Voice & Data                    |Voice & Data   |Standard       |Standard       |200    |1   |500           |15000             |New / Additional|
    Then Sales rep for GPT creates a product basket to add GPT products
    Then Sales rep for GPT configures GPT product one in the basket with the following details"<NoOfConnections1>" "<ProvisionalTarrif1>" "<BillSpendCap1>" "<PrivateAPN1>" "<MobexRequired1>" "<MobexService1>" "<Type1>" "<VoiceType1>" "<Term1>" "<DataType1>" "<DataAllowance1>" "<CappedOrUncapped1>" "<AggregatedData1>"
    Then Sales rep for GPT configures GPT product two in the basket with the following details"<NoOfConnections2>" "<ProvisionalTarrif2>" "<BillSpendCap2>" "<PrivateAPN2>" "<MobexRequired2>" "<MobexService2>" "<Type2>" "<VoiceType2>" "<DataType2>" "<DataAllowance2>" "<CappedOrUncapped2>" "<AggregatedData2>"
    Then Sales rep for GPT configures GPT product three in the basket with the following details"<NoOfConnections3>" "<ProvisionalTarrif3>" "<BillSpendCap3>" "<PrivateAPN3>" "<MobexRequired3>" "<MobexService3>" "<Type3>" "<VoiceType3>" "<DataType3>" "<DataAllowance3>" "<CappedOrUncapped3>" "<AggregatedData3>"
    Then Sales representative for GPT configures Resign details"<Connections_Resign>" "<Revenue_Resign>"
    Then Sales representative for GPT configures Call mix details"<International_and_Roaming_Rates>"
    Then Sales rep for GPT visits Clauses section to update the required details"<TF>"
    Then Sales rep for GPT captures the Voice RRP and Data RRP
    Examples:
      |Account_Name  | Deal_Type  | Type_of_support         | NoOfConnections1   | ProvisionalTarrif1  | BillSpendCap1 |PrivateAPN1|MobexRequired1|MobexService1|Type1         |VoiceType1|Term1|DataType1  |DataAllowance1    |CappedOrUncapped1|AggregatedData1| NoOfConnections2   | ProvisionalTarrif2  | BillSpendCap2 |PrivateAPN2|MobexRequired2|MobexService2|Type2         |VoiceType2|DataType2  |DataAllowance2  |CappedOrUncapped2|AggregatedData2|NoOfConnections3    | ProvisionalTarrif3  | BillSpendCap3 |PrivateAPN3|MobexRequired3|MobexService3|Type3         |VoiceType3|DataType3  |DataAllowance3    |CappedOrUncapped3|AggregatedData3|Connections_Resign|Revenue_Resign|International_and_Roaming_Rates|TF  |Voice_Discount1|Voice_Discount2|Voice_Discount3|Data_Discount1|Data_Discount2|Data_Discount3|Sharer_Fee3|Submission_type   |Contract_terms         |Service_levels|
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |15GB              |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |15GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |400GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |20GB              |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |20GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |450GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |25GB              |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |25GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |500GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |30GB              |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |30GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |0.5TB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |40GB              |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |40GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |550GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |50GB              |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |50GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |600GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |100GB             |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |100GB 5G        |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |650GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 500                | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |200GB             |Uncapped         |               | 1500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |250GB 5G        |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |700GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |1GB               |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |1GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |750GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |2GB               |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |2GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |0.75TB Shared Data|Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |3GB               |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |3GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |800GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |4GB               |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |4GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |850GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |5GB               |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |5GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |900GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |10GB              |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |10GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |950GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |15GB              |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |15GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |1TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |20GB              |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |20GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |1.25TB Shared Data|Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |25GB              |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |25GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |1.5TB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |30GB              |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |30GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |1.75TB Shared Data|Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |40GB              |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |40GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |2TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |50GB              |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |50GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |2.25TB Shared Data|Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |100GB             |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |100GB 5G        |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |2.5TB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1000               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |200GB             |Uncapped         |               | 2000               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |250GB 5G        |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |2.75TB Shared Data|Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |1GB               |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |1GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |3TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |2GB               |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |2GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |3.25TB Shared Data|Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |3GB               |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |3GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |3.5TB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |4GB               |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |4GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |3.75TB Shared Data|Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |5GB               |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |5GB             |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |4TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |10GB              |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |10GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |4.5TB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |15GB              |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |15GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |5TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |20GB              |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |20GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |5.5TB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |25GB              |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |25GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |6TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |30GB              |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |30GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |7TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |40GB              |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |40GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |8TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |50GB              |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |50GB            |Uncapped         |               |500                 | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |9TB Shared Data   |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |36   |Individual |100GB             |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |100GB 5G        |Uncapped         |               |1000                | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |400GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |12   |Individual |200GB             |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |250GB 5G        |Uncapped         |               |1000                | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |450GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |
      |Test Private  | Acquisition| Self-serve pricing tools| 1500               | No                  | No            |No         |No            |             |Data Only     |Unlimited |24   |Individual |300GB             |Uncapped         |               | 2500               | No                  | No            |No         |No            |             |Voice & Data  |Unlimited |Individual |250GB 5G        |Uncapped         |               |1000                | No                  | No            |No         |No            |             |Data Only     |Unlimited |Shared     |500GB Shared Data |Uncapped         |               |                  |              |Standard rates                 |    |4.11           |4.11           |4.11           |              |              |              |           | First submission |Standard TEF UK Ts & Cs|Standard      |