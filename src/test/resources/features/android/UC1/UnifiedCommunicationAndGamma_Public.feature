Feature: Enterprise industrialisation

  @Test
  Scenario Outline: To verify that salesRepresentative is able to complete an E2E order successfully with HostedMI, MobileRecording and InboundNumbers products in the same basket for public account
    Given User logins as Sales representative
    Then Sales representative creates an opportunity with the following details and saves it "<Account_Name>" "<Deal_Type>" "<Type_of_support>"
    Then Sales rep adds an retail product with required details
      |Product_Category   |Product          |Product_Detail                          |Quans  |LOC |Billed_Upfront   |Revenue_per_month   |Business_Type   |
      |Communication      |Voice            |Inbound Numbers (Talk Talk)             |200    |1   |500              |15000               |New / Additional|
      |Communication      |Collaboration    |Hosted Micloud from O2 (Mitel on cloud) |200    |1   |500              |15000               |New / Additional|
      |Communication      |Security Services|Mobile Voice Recording (MVR)            |200    |1   |500              |15000               |New / Additional|
    Then Sales representative creates a product basket and adds an Enterprise mobile offer
    And Sales representative adds hostedMICloud mobileRecording inBoundNumbersTalkTalk into basket and edits and configures hostedMICloud"<hostedTerm>""<totalNumOfSites>""<ServiceTypes>""<SIPConfig>""<selectHandsetType>""<HandsetQty>""<ThirdPartyType>""<survivableType>""<SurveyQty>""<numPrtType>""<TotalnumPortQty>""<O2numType>""<qtynumType>""<macdReq>""<totalmacdQty>"
    And Sales representative edits and configures mobileRecording and inboundNumberTalkTalk"<MobileRecording_Term>"  "<MobRcordingsolution>" "<SFTP_Transmission>""<SMS2Email_Transmission>""<inbound_Term>"  "<Product_Type>" "<MAC>""<DiscoveryAndDocumentDays>""<BuildAndTestDays>""<PortDays>""<PlatformDevelopmentDaysDays>""<InboundNumberFeature>"
    Then Sales representative configures the Call mix details as required details
    And Sales representative views the Profit and Loss report for the configured mobile offer
    Then Sales representative provides the required discount for the opted configuration
    Then Sales representative visits the Clauses section for further details
    Then Finance Manager approves the basket for the approval criteria
    #Then User logs in as Sales representative to change the opportunity stage as Awareness of needs inorder to kick off the Sales governance process
    #Then Sales representative feeds in the details in Agreement to support stage
    #Then User logins as Qgate Administrator to approve Agreement to support stage
    #Then User logins as Sales representative to feed in the details in Solution and Delivery QA Stage
    #Then User logins as Qgate Administrator to approve Solution and Delivery QA Stage
    #Then User logins as Sales representative to feed in the data in Agreement to Propose stage with the following details"<Submission_type>"  "<Contract_terms>"  "<Service_levels>"
    #Then User logins as Qgate Administrator to approve Agreement to propose stage
    #Then User logins as Sales representative to change the Opportunity stage as decision
    #Then User logins as Sales representative to feed in thr details in Agreement to sign stage
    #Then User logins as Qgate Administrator to approve Agreement to sign stage
    #Then User logins as Sales representative to feed in the details in Acceptance into delivery stage
    #Then User logins as Qgate Administrator to approve Acceptance into delivery stage
    #Then User logins as Sales representative to feed in the details in Acceptance into service stage.
    #Then User logins as Qgate Administrator to approve Acceptance into service stage
    Examples:
      |Scenario_Identifier                                                                                                                                             |hostedTerm|totalNumOfSites|    ServiceTypes    |   SIPConfig    |  selectHandsetType    |HandsetQty|   ThirdPartyType   |      survivableType      |SurveyQty|   numPrtType  |TotalnumPortQty|O2numType|qtynumType|macdReq|totalmacdQty |  inbound_Term|Product_Type| MAC|DiscoveryAndDocumentDays|BuildAndTestDays|PortDays| PlatformDevelopmentDaysDays| InboundNumberFeature|MobileRecording_Term|MobRcordingsolution |SFTP_Transmission|SMS2Email_Transmission |Type          |     Related_Product       |Term|Account_Name | Deal_Type | Type_of_support           | Product_Category | Product        | Product_Detail| Quans | LOC | Billed_Upfront  | Revenue_per_month | Margin                             | Submission_type  | Contract_terms          | Service_levels | BillSpend | Mobex| PrivateAPN |NOC |VDtype      |Voice_type|Data_type  |
      |ID_009 ID_038 ID_055 ID_084 ID_100 ID_104 ID_133 ID_149 ID_150 ID_151 ID_155 ID_184 ID_200 ID_201 ID_202 ID_208 ID_237 ID_253 ID_254 ID_255 ID_291 ID_292 ID_293|    12    |      500      |Premium Availability|Active - Standby|Mainstream Phone (5324)|   234    |Handset Installation|Survivable Gateway 3300 CX|   765   |Port Multi-line|       345     | New DDI |  543     |Bespoke|    455      |     12       |    CC2     |CC2 |          23             |      24       |   25   |             26             |       Area Plans    |        12          |      SMS Only      |        Yes      |          Yes          |Call Recording|Inbound Numbers (TalkTalk) | 12 |TestSGAccount| Acquisition| Self-serve pricing tools | Mobile           | Voice & Data   | Voice & Data  |  3500 |  1  |         40000   |           45000   | Blended Margin >17.5% Annuity >20% | First submission | Standard TEF UK Ts & Cs | Standard       | No        | No   | No         |2000|Voice & Data|Unlimited |Individual |
