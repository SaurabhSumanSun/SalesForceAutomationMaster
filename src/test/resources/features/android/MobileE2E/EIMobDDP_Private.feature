Feature: feature001

  Scenario Outline: To verify Sales rep is able to perform an E2E with mobile product for private account
    Given User logins as Enterprise Sales representative for DDP
    Then Sales rep for DDP creates an opportunity with the following details "<Deal_Type>" "<Type_of_support>"
    Then Sales rep for DDP adds the Enterprise product details for all DDP products
      |Product_Category  |Product                         |Product_Detail |Mobile_Tariffs |Mobile_Services|Quans  |LOC |Billed_Upfront|Revenue_per_month |Business_Type   |
      |Mobile            |Voice & Data                    |Voice & Data   |Standard       |Standard       |200    |1   |500           |15000             |New / Additional|
    Then Sales rep for DDP creates a product basket to add DDP products
    Then Sales rep for DDP configures all DDP products in the basket with the following details"<NoOfConnections>" "<ProvisionalTarrif>" "<BillSpendCap>" "<PrivateAPN>" "<MobexRequired>" "<MobexService>" "<Type>" "<VoiceType>" "<Term>" "<DataType>" "<DataAllowance>" "<CappedOrUncapped>" "<AggregatedData>"
    Then Sales representative for DDP configures Call mix details
    Then Sales rep for DDP visits Clauses section
    Then Sales rep for DDP provides required discount under the discount section
    Then Sales rep for DDP views the Profit and Loss section for the configured DDP products
    Then Sales rep submits basket for approval and Financial approvers for DDP approve the basket and the basket is synced with the opportunity
    Then User logs in as Sales Rep to change the opportunity stage as Awareness of needs inorder to kick off the Sales governance process for DDP products
    Then Sales Rep for DDP feeds in the details in Agreement to support stage
    Then User logins as Qgate Admin to approve Agreement to support stage for DDP
    Then User logins as Qgate admin to approve Solution and Delivery of DDP QA Stage
    Then User logins as Sales Rep to feed in the data in Agreement to Propose stage with the following details for DDP products "<Submission_type>"  "<Contract_terms>"  "<Service_levels>"
    Then User logins as Qgate Admin to approve Agreement to propose stage for DDP products
    Then User logins as Sales Rep to change the Opportunity stage as decision for configured DDP products
    Then User logins as Sales Rep to feed in thr details in Agreement to sign stage for DDP products
    Then User logins as Qgate admin to approve Agreement to sign stage for DDP products
    Then User logins as Sales Rep to feed in the details in Acceptance into delivery stage for DDP products
    Then User logins as Qgate Admin to approve Acceptance into delivery stage for DDP products
    Then User logins as Sales Rep to feed in the details in Acceptance into service stage for DDP products
    Then User logins as Qgate Admin to approve Acceptance into service stage for DDP products

    Examples:
      |Scenario_Identifier                                                                                                                                                                                                                                                                                                                                                                         |Account_Name  | Deal_Type  | Type_of_support         | NoOfConnections   | ProvisionalTarrif  | BillSpendCap |PrivateAPN|MobexRequired|MobexService|Type         |VoiceType|Term|DataType  |DataAllowance |CappedOrUncapped|AggregatedData|Submission_type   |Contract_terms         |Service_levels|
      |ID_001 ID_002 ID_003 ID_006 ID_007 ID_011 ID_015 ID_034 ID_039 ID_040 ID_041 ID_052 ID_053 ID_057 ID_061 ID_080 ID_085 ID_086 ID_087 ID_101 ID_102 ID_106 ID_110 ID_129 ID_134 ID_135 ID_136 ID_152 ID_153 ID_157 ID_161 ID_180 ID_185 ID_186 ID_187 ID_205 ID_206 ID_210 ID_214 ID_ID_233 ID_238 ID_239 ID_240 ID_260 ID_261 ID_264 ID_265 ID_276 ID_277 ID_278 ID_303 ID_304 ID_307 ID_308|Test Private  | Acquisition| Self-serve pricing tools| 1000              | No                 | No           |No        |No           |            |Voice & Data |PAYU     |24  |Individual|10GB          |Uncapped        |              | First submission |Standard TEF UK Ts & Cs|Standard      |
