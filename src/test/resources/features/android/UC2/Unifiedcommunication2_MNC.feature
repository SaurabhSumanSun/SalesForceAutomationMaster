Feature: Enterprise industrialisation Unified communication 2

  @Test
  Scenario Outline: To verify that salesRep is able to complete an E2E order successfully with the PBX, SIP, Fixed Lines, Inbound number in the same basket
    Given user login to salesforce application
    #Then Sales rep creates an opportunity with the "Test Private" as Account "Acquisition" as Deal Type and "Self-serve pricing tools" as Type of support
    Then Sales representative creates an opportunity with the following details and saves it "<Account_Name>" "<Deal_Type>" "<Type_of_support>"
    Then Sales rep adds a product detail with required details
      |Product_Category   |Product        |Product_Detail                                    |Quans  |LOC |Billed_Upfront   |Revenue_per_month   |Business_Type   |
      |Communication      |Collaboration  |Cisco                                             |200    |1   |500              |15000               |New / Additional|
      |Communication      |Collaboration  |SIP Trunking (O2 Powered by Gamma)                |200    |1   |500              |15000               |New / Additional|
      |Communication      |Voice          |Fixed Calls                                       |200    |1   |500              |15000               |New / Additional|
      |Communication      |Voice          |Inbound Numbers (Gamma)                           |200    |1   |500              |15000               |New / Additional|
    Then Sales rep creates a product basket
    Then SalesRep adds PBX, SIP, Fixed Lines, Inbound number in the same basket
    Then Sales representative configures Call mix
    Then SalesRep views the Profit and Loss report
    Then SalesRep provides the required discount
    Then SalesRep visits the Clauses section
    Then Finance Manager approves the basket
    #Then Sales representative changes the opportunity stage as Awareness of needs inorder to kick off the Sales governance process
    #Then SalesRepresentative feeds in the details in Agreement to support stage
    #Then User logins as QgateAdministrator to approve Agreement to support stage
    #Then User logins as SalesRepresentative to feed in the details in Solution and Delivery QA Stage
    #Then User logins as QgateAdministrator to approve Solution and Delivery QA Stage
    #And Sales representative feeds the data in Agreement to Propose stage with the following details"<Submission_type>"  "<Contract_terms>"  "<Service_levels>"
    #And Qgate Administrator approves Agreement to propose stage
    #And Sales representative changes the Opportunity stage as decision
    #And Sales representative feeds details in Agreement to sign stage
    #And Qgate Administrator to approve Agreement to sign stage
    #Then User logins as SalesRepresentative to feed in the details in Acceptance into delivery stage
    #Then User logins as QgateAdministrator to approve Acceptance into delivery stage
    #Then User logins as SalesRepresentative to feed in the details in Acceptance into service stage
    #Then User logins as QgateAdministrator to approve Acceptance into service stage

    Examples:
      |Scenario_Identifier                                                                                                                                                   |Account_Name | Deal_Type | Type_of_support           |
      |ID_49 ID_50 ID_076 ID_094 ID_095 ID_096 ID_125 ID_143 ID_144 ID_145 ID_176 ID_194 Id_195 ID_196 ID_229 ID_247 ID_248 ID_249 ID_273 ID_285 ID_286 ID_287 ID_316        |1000+ Sites  | Acquisition| Self-serve pricing tools |
