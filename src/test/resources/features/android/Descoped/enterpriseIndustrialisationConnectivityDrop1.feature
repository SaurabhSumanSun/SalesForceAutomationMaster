Feature: Enterprise industrialisation Connectivity Drop1

  @Test
  Scenario Outline: To verify that salesRep is able to complete an E2E order successfully with the Connectivity Drop 1 products in the same basket
    Given User logins as Sales rep


    Then Sales rep creates an opportunity with the following details and saves it "<Deal_Type>"  "<Type_of_support>"
    Then Sales rep adds an retail product with the following details "<Product_Category>"  "<Product>"  "<Product_Detail>"  "<Quans>"  "<LOC>"  "<Billed_Upfront>"  "<Revenue_per_month>"
    Then Sales rep creates a product basket and adds an Enterprise mobile offer
    And Sales rep edits and completes the configuration of all the products "<PMATerm>" "<PMABandwidth>""<QuantityofAPN>""<NumberOfSites>""<BTNNITerm>""<BTNNIMigrationType>""<PCCDeliverytype>""<PCCContractTerm>""<GIPTerm>""<GIPServiceTier>"
    #And Sales rep adds MWAN to the basket "<MWANTerm>""<MWANAPN>""<GroupName>""<Resiliency>""<PrimaryCircuitType>""<PrimaryAccessType>""<GroupName2>""<Resiliency2>""<PrimaryCircuitType2>""<PrimaryAccessType2>""<SecondaryCircuitytype>""<SecondaryAccessType>"
    And Sales rep views the Profit and Loss report for the configured mobile offer
    Then Sales rep provides the required discount for the opted configuration
    Then Sales rep visits the Clauses section for further details
    Then Finance Manager approves the basket for the required approval criteria
    Then User logs in as Sales rep to change the opportunity stage as Awareness of needs inorder to kick off the Sales governance process
    Then Sales rep feeds in the details into Agreement to support stage
    Then User logins as Qgate Admin and approve Agreement to support stage
    Then User logins as Sales rep and feed in the details in Solution and Delivery QA Stage
    Then User logins as Qgate admin and approve Solution and Delivery QA Stage
    Then User logins as Sales rep to feed in the data in Agreement to Propose stage with the following details"<Submission_type>"  "<Contract_terms>"  "<Service_levels>"
    Then User logins as Qgate Admin to approve Agreement to propose stage
    Then User logins as Sales rep to change the Opportunity stage as decision
    Then User logins as Sales rep to feed in thr details in Agreement to sign stage
    Then User logins as Qgate Admin to approve Agreement to sign stage
    Then User logins as Sales Rep and feed in the details in Acceptance into delivery stage for DW products
    Then User logins as Qgate Admin and approve Acceptance into delivery stage for DW products
    Then User logins as Sales rep and feed in the details in Acceptance into service stage for DW products
    Then User logins as Qgate Admin and approve Acceptance into service stage for DW products

      Examples:
          |Scenario_Identifier| Deal_Type   | Type_of_support          | Product_Category | Product      | Product_Detail | Quans | LOC | Billed_Upfront | Revenue_per_month | Margin                             | Submission_type  | Contract_terms          | Service_levels | BillSpend | Mobex | PrivateAPN | NOC  | VDtype       | Voice_type | Data_type  | PMATerm | PMABandwidth | QuantityofAPN | NumberOfSites | BTNNITerm | BTNNIMigrationType | PCCDeliverytype | PCCContractTerm | GIPTerm | GIPServiceTier |MWANTerm|MWANAPN|GroupName|Resiliency|PrimaryCircuitType|PrimaryAccessType|GroupName2|Resiliency2  |PrimaryCircuitType2|PrimaryAccessType2|SecondaryCircuitytype|SecondaryAccessType  |
          |                   | Acquisition | Self-serve pricing tools | Connectivity     | O2 Gateway   | Ethernet       |  3500 |   1 |          40000 |             45000 | Blended Margin >17.5% Annuity >20% | First submission | Standard TEF UK Ts & Cs | Standard       | No        | No    | No         | 2000 | Voice & Data | Unlimited  | Individual |      24 | 150 MB       |             2 |             2 |        24 | Migration Only     | Type A          |              24 |      24 | Gold           |12      |0      |Test     |Single    |DSL               |ADSL Connect Max |Test1     |Dual Standard|DSL                |ADSL Connect      |Cellular              |Mobile Connect Backup|