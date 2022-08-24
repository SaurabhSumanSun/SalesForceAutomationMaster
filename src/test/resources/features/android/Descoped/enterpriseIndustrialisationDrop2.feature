Feature: Enterprise industrialisation Drop 2

  @Test
  Scenario: To verify that salesRep is able to complete an E2E order successfully with Drop2 products
    Given SalesREP login to salesforce application
    And SalesREP creates an opportunity with the "Acquisition" as Deal Type and "Self-serve pricing tools" as Type of support
    And SalesREP creates a product basket
    And SalesREP adds CSV file from "C:\Users\angelr2\Desktop\MLAN & Meraki CSV.csv" location
    And SalesREP adds Drop2 products into basket
    And SalesREP views the Profit and Loss report for the configured mobile offer
    And SalesREP provides the required discount for the opted configuration
    And SalesREP visits the Clauses section for further details
    And FinanceManager approves the basket
    Then User logs in as SalesREP to change the opportunity satge as Awareness of needs inorder to kick off the Sales governance process
    Then SalesREP feeds in the details in Agreement to support stage
    Then User logins as QgateAdmin to approve Agreement to support stage
    Then User logins as SalesREP to feed in the details in Solution and Delivery QA Stage
    Then User logins as QgateAdmin to approve Solution and Delivery QA Stage
    Then User logins as SalesREP to feed in the data in Agreement to Propose stage with the following details "<Submission_type>"  "<Contract_terms>"  "<Service_levels>"
    Then User logins as QgateAdmin to approve Agreement to propose stage
    Then User logins as SalesREP to change the Opportunity stage as decision
    Then User logins as SalesREP to feed in thr details in Agreement to sign stage
    Then User logins as QgateAdmin to approve Agreement to sign stage
    Then User logins as SalesREP to feed in the details in Acceptance into delivery stage
    Then User logins as QgateAdmin to approve Acceptance into delivery stage
    Then User logins as SalesREP to feed in the details in Acceptance into service stage
    Then User logins as QgateAdmin to approve Acceptance into service stage








