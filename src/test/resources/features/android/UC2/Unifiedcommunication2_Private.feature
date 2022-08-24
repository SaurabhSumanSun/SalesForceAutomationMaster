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
    |ID_020 ID_031 ID_032 ID_033 ID_45 ID_46 ID_47 ID_066 ID_077 ID_078 ID_079 ID_091 ID_092 ID_093 ID_115 ID_126 ID_127 ID_128 ID_140 ID_141 ID_142 ID_166 ID_177 ID_178  |Test Private | Acquisition| Self-serve pricing tools |
