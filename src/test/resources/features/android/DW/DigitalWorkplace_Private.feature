Feature: feature001

  Scenario Outline: To verify Sales rep is able to perform an E2E with all DW products for private account
    Given User logins as Enterprise Sales representative
    Then Sales rep creates an opportunity with the following details "<Account_Name>" "<Deal_Type>" "<Type_of_support>"
    Then Sales rep adds the Enterprise product details for all DW products
    |Product_Category  |Product                         |Product_Detail                             |Quans  |LOC |Billed_Upfront|Revenue_per_month |Business_Type   |
    |Mobility          |Business Mobility               |Mobile Device Management - Airwatch        |200    |1   |500           |15000             |New / Additional|
    |Mobility          |Logistic Services               |MLS Deployment                             |200    |1   |500           |15000             |New / Additional|
    |Mobility          |Business Mobility               |Mobile Device Management - MaaS360         |200    |1   |500           |15000             |New / Additional|
    |Mobility          |Business Application            |Rotageek                                   |200    |1   |500           |15000             |New / Additional|
    #|Mobility          |Business Application            |Rotageek                                   |200    |1   |500           |15000             |New / Additional|
    #|Mobility          |Mobile Threat Protection        |Mobile Security (Sandblast from Checkpoint)|200    |1   |500           |15000             |New / Additional|
    |Mobility          |Business Mobility               |Mobile Data Management - Asavie Moda       |200    |1   |500           |15000             |New / Additional|
    |Mobility          |Professional Services (Mobility)|Mob. Maturity Asessment                    |200    |1   |500           |15000             |New / Additional|
    #1. Reverse Logistics (O2 - Replacement)
    Then Sales rep creates a product basket to add DW products
    Then Sales rep add DW products to basket
    Then Sales rep configures MLS product in the basket with the following details "<MLS_Handset_Volume>" "<MLS_Handset_Acc>"
    Then Sales rep configures AsavieModa product in the basket with the following details "<AsavieModa_License_period>" "<AsavieModa_License_volume>" "<AsavieModa_PS_Fulldays>" "<AsavieModa_PS_Halfdays>"
    Then Sales rep configures MMA product in the basket with the following details
    Then Sales rep configures MaaS product in the basket with the following details "<MaaS_License_period>" "<MaaS_License_volume>" "<MaaS_License_type>" "<MaaS_Products>"
    Then Sales rep configures WSO product in the basket with the following details "<WSO_SKU_Code>" "<WSO_License_Volume>" "<WSO_Professional_services>" "<WSO_Standard_Engineer>" "<WSO_Consultant>"
    #Then Sales rep configures Sandblast product in the basket with the following details "<Sandblast_License_period>" "<Sandblast_License_volume>"
    Then Sales rep configures Rotageek product in the basket with the following details "<Rotageek_License_period>" "<Rotageek_License_volume>" "<Rotageek_License_type_1>" "<Rotageek_License_type_2>" "<Rotageek_PS_Manager>"
    Then Sales rep views the Profit and Loss section for the configured DW products
    Then Sales rep provides required discount under the discount section
    Then Sales rep vists Clauses section to update the required details and submits basket for approval
    Then Financial approvers approve the basket and the basket is synced with the opportunity
    #Then User logs in as Sales Rep to change the opportunity satge as Awareness of needs inorder to kick off the Sales governance process for DW products
    #Then Sales Rep feeds in the details in Agreement to support stage
    #Then User logins as Qgate Admin to approve Agreement to support stage
    #Then User logins as Sales Rep to feed in the details in Solution and Delivery QA Stage
    #Then User logins as Qgate admin to approve Solution and Delivery QA Stage
    #Then User logins as Sales Rep to feed in the data in Agreement to Propose stage with the following details for DW products "<Submission_type>"  "<Contract_terms>"  "<Service_levels>"
    #Then User logins as Qgate Admin to approve Agreement to propose stage for DW products
    #Then User logins as Sales Rep to change the Opportunity stage as decision for configured DW products
    #Then User logins as Sales Rep to feed in thr details in Agreement to sign stage for DW products
    #Then User logins as Qgate admin to approve Agreement to sign stage for DW products
    #Then User logins as Sales Rep to feed in the details in Acceptance into delivery stage for DW products
    #Then User logins as Qgate Admin to approve Acceptance into delivery stage for DW products
    #Then User logins as Sales Rep to feed in the details in Acceptance into service stage for DW products
    #Then User logins as Qgate Admin to approve Acceptance into service stage for DW products


    Examples:
    |Scenario_Identifier                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |Account_Name  |Deal_Type   |Type_of_support             |MLS_Handset_Volume|MLS_Handset_Acc|MaaS_License_period|MaaS_License_volume|MaaS_License_type      |MaaS_Products                            |WSO_SKU_Code       |WSO_License_Volume|WSO_Professional_services    |WSO_Standard_Engineer|WSO_Consultant|Rotageek_License_period|Rotageek_License_volume|Rotageek_License_type_1|Rotageek_License_type_2|Rotageek_PS_Manager|Rotageek_PS_Analyst|Sandblast_License_period|Sandblast_License_volume|AsavieModa_License_period|AsavieModa_License_volume|AsavieModa_PS_Fulldays|AsavieModa_PS_Halfdays|Margin                             | Submission_type  | Contract_terms          | Service_levels |
    |ID_004 ID_005 ID_008 ID_019 ID_27 ID_28 ID_29 ID_035 ID_037 ID_42 ID_43 ID_44 ID_051 ID_054 ID_065 ID_073 ID_074 ID_075 ID_081 ID_083 ID_088 ID_089 ID_090 ID_097 ID_098 ID_099 ID_103 ID_122 ID_123 ID_124 ID_130 ID_132 ID_137 ID_138 ID_139 ID_146 ID_147 ID_148 ID_154 ID_207 ID_114 ID_165 ID_173 ID_174 ID_175 ID_181 ID_183 ID_188 ID_189 ID_190 ID_197 ID_198 ID_199 ID_218 ID_226 ID_227 ID_228 ID_234 ID_236 ID_241 ID_242 ID_243 ID_250 ID_251 ID_252 ID_262 ID_267 ID_268 ID_269 ID_274 ID_279 ID_280 ID_281 ID_288 ID_289 ID_290 ID_305 ID_310 ID_311 ID_312 ID_317|Test Private  | Acquisition| Self-serve pricing tools   |2000              |Handset Desc   |12                 |2000               |Managed Service License|Deluxe by O2 - Managed Service(2000-4999)|WMD-AACLB-12MT0-A1S|2000              |WSO Deployment Advanced-Cloud|10                   |10            |12                     |2000                   |Scheduling License     |Auto-Scheduling License|10                 |10                 |12                      |2000                    |12                       |2000                     |10                    |5                     |Blended Margin >17.5% Annuity >20% | First submission | Standard TEF UK Ts & Cs | Standard       |
