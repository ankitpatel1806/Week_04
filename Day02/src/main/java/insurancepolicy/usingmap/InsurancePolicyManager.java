package insurancepolicy.usingmap;
import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {
    private Map<String, InsurancePolicy> policyMap;
    private Map<String, InsurancePolicy> orderedPolicyMap;
    private Map<LocalDate, InsurancePolicy> expirySortedPolicyMap;

    public InsurancePolicyManager() {
        this.policyMap = new HashMap<>();
        this.orderedPolicyMap = new LinkedHashMap<>();
        this.expirySortedPolicyMap = new TreeMap<>();
    }

    public void addPolicy(InsurancePolicy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);
        expirySortedPolicyMap.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy getPolicy(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringWithin30Days() {
        List<InsurancePolicy> expiringPolicies = new ArrayList<>();
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);
        for (InsurancePolicy policy : expirySortedPolicyMap.values()) {
            if ((policy.getExpiryDate().isAfter(today) || policy.getExpiryDate().isEqual(today)) &&
                    policy.getExpiryDate().isBefore(next30Days)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    public List<InsurancePolicy> getPoliciesByPolicyholder(String policyholderName) {
        List<InsurancePolicy> holderPolicies = new ArrayList<>();
        for (InsurancePolicy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                holderPolicies.add(policy);
            }
        }
        return holderPolicies;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<Map.Entry<LocalDate, InsurancePolicy>> iterator = expirySortedPolicyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<LocalDate, InsurancePolicy> entry = iterator.next();
            if (entry.getKey().isBefore(today)) {
                iterator.remove();
                policyMap.remove(entry.getValue().getPolicyNumber());
                orderedPolicyMap.remove(entry.getValue().getPolicyNumber());
            }
        }
    }

    public Map<String, InsurancePolicy> getOrderedPolicyMap() {
        return orderedPolicyMap;
    }

    public Map<LocalDate, InsurancePolicy> getExpirySortedPolicyMap() {
        return expirySortedPolicyMap;
    }
}
