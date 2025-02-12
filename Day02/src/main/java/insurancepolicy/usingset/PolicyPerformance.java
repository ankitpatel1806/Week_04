package insurancepolicy.usingset;

import java.time.LocalDate;

public class PolicyPerformance {
    public static void main(String[] args) {
        PolicyManager policyManager = new PolicyManager();

        // Adding policies
        policyManager.addPolicy(new Policy("P0125", "Ankit Kumar", LocalDate.now().plusMonths(12), CoverageType.HEALTH, 3000.0));
        policyManager.addPolicy(new Policy("P0126", "Anand Soni ", LocalDate.now().plusMonths(12), CoverageType.AUTO, 15000.0));

        // Retrieving policies
        System.out.println("All Unique Policies: " + policyManager.getAllUniquePolicies());
        System.out.println("Policies Expiring Soon: " + policyManager.getPoliciesExpiringSoon());
        System.out.println("Policies with Auto Coverage: " + policyManager.getPoliciesByCoverageType(CoverageType.AUTO));

        // Performance Comparison
        policyManager.performanceComparison();
    }
}

