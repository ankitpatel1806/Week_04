package insurancepolicy.usingmap;
import java.time.LocalDate;

public class InsurancePolicyManagementSystem {
    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        InsurancePolicy policy1 = new InsurancePolicy("P001", "Anand Soni", LocalDate.of(2025, 3, 15));
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Ankit Kumar", LocalDate.of(2025, 2, 25));
        InsurancePolicy policy3 = new InsurancePolicy("P003", "Anand Soni", LocalDate.of(2025, 2, 28));

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);

        System.out.println("Policy P002: " + manager.getPolicy("P002"));
        System.out.println("Policies expiring in the next 30 days: " + manager.getPoliciesExpiringWithin30Days());
        System.out.println("Policies for Anand Soni: " + manager.getPoliciesByPolicyholder("Anand Soni"));

        manager.removeExpiredPolicies();
        System.out.println("Remaining policies after removal of expired: " + manager.getExpirySortedPolicyMap());
    }
}
