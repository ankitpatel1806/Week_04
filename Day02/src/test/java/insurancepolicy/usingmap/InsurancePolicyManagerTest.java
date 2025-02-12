package insurancepolicy.usingmap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class InsurancePolicyManagerTest {
    private InsurancePolicyManager manager;

    @BeforeEach
    void setUp() {
        manager = new InsurancePolicyManager();
        manager.addPolicy(new InsurancePolicy("P001", "John Doe", LocalDate.of(2025, 3, 15)));
        manager.addPolicy(new InsurancePolicy("P002", "Jane Smith", LocalDate.of(2025, 2, 25)));
        manager.addPolicy(new InsurancePolicy("P003", "John Doe", LocalDate.of(2025, 2, 28)));
    }

    @Test
    void testGetPolicyByNumber() {
        InsurancePolicy policy = manager.getPolicy("P001");
        assertNotNull(policy);
        assertEquals("P001", policy.getPolicyNumber());
        assertEquals("John Doe", policy.getPolicyholderName());
    }

    @Test
    void testGetPoliciesExpiringWithin30Days() {
        List<InsurancePolicy> expiringPolicies = manager.getPoliciesExpiringWithin30Days();
        assertTrue(expiringPolicies.size() > 0);
        assertTrue(expiringPolicies.stream().allMatch(p -> p.getExpiryDate().isBefore(LocalDate.now().plusDays(30))));
    }

    @Test
    void testGetPoliciesByPolicyholder() {
        List<InsurancePolicy> johnPolicies = manager.getPoliciesByPolicyholder("John Doe");
        assertEquals(2, johnPolicies.size());
        assertTrue(johnPolicies.stream().allMatch(p -> p.getPolicyholderName().equalsIgnoreCase("John Doe")));
    }

    @Test
    void testRemoveExpiredPolicies() {
        manager.removeExpiredPolicies();
        assertTrue(manager.getExpirySortedPolicyMap().containsKey(LocalDate.of(2025, 2, 25)));
    }
}

