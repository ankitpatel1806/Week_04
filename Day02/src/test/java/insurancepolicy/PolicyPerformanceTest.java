package insurancepolicy;
import insurancepolicy.usingset.CoverageType;
import insurancepolicy.usingset.Policy;
import insurancepolicy.usingset.PolicyManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;
class PolicyManagerTest {
    private PolicyManager policyManager;
    @BeforeEach
    void setUp() {
        policyManager = new PolicyManager();
    }
    @Test
    void testAddPolicy() {
        Policy policy = new Policy("P0125", "Ankit Kumar", LocalDate.now().plusMonths(12), CoverageType.HEALTH, 3000.0);
        policyManager.addPolicy(policy);
        Set<Policy> policies = policyManager.getAllUniquePolicies();
        assertTrue(policies.contains(policy), "Policy should be added to the set");
    }
    @Test
    void testGetPoliciesExpiringSoon() {
        Policy policy1 = new Policy("P0125", "Ankit Kumar", LocalDate.now().plusDays(12), CoverageType.HEALTH, 3000.0);
        Policy policy2 = new Policy("P0126", "Anand Soni", LocalDate.now().plusMonths(12), CoverageType.AUTO, 15000.0);
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);

        // Get policies expiring within 30 days
        Set<Policy> expiringPolicies = policyManager.getPoliciesExpiringSoon();

        // Assert that only the first policy is in the result
        assertTrue(expiringPolicies.contains(policy1), "Policy expiring soon should be included");
        assertFalse(expiringPolicies.contains(policy2), "Policy not expiring soon should not be included");
    }

    @Test
    void testGetPoliciesByCoverageType() {
        Policy healthPolicy = new Policy("P0125", "Ankit Kumar", LocalDate.now().plusMonths(1), CoverageType.HEALTH, 300.0);
        Policy autoPolicy = new Policy("P0126", "Anand Soni", LocalDate.now().plusMonths(2), CoverageType.AUTO, 150.0);
        policyManager.addPolicy(healthPolicy);
        policyManager.addPolicy(autoPolicy);

        // Get all health policies
        Set<Policy> healthPolicies = policyManager.getPoliciesByCoverageType(CoverageType.HEALTH);

        // Assert that the correct policies are returned
        assertTrue(healthPolicies.contains(healthPolicy), "Health policy should be returned");
        assertFalse(healthPolicies.contains(autoPolicy), "Auto policy should not be returned");
    }

    @Test
    void testGetDuplicatePolicies() {
        Policy policy1 = new Policy("P0125", "Ankit Kuamr", LocalDate.now().plusMonths(1), CoverageType.HEALTH, 300.0);
        Policy policy2 = new Policy("P0126", "Anand Soni", LocalDate.now().plusMonths(1), CoverageType.HEALTH, 300.0);
        policyManager.addPolicy(policy1);
        policyManager.addPolicy(policy2);
        Set<Policy> duplicates = policyManager.getDuplicatePolicies();

        assertEquals(0, duplicates.size(), "There should be exactly one duplicate policy");
        assertFalse(duplicates.contains(policy1), "Duplicate policy should be found");
    }

    @Test
    void testPerformanceComparison() {
        // Here, we can test the performance of adding, removing, and searching policies.
        // For example:
        long startTime = System.nanoTime();
        policyManager.performanceComparison();  // Run the performance comparison
        long endTime = System.nanoTime();

        System.out.println("Performance Test Time: " + (endTime - startTime) + "ns");
    }
}

