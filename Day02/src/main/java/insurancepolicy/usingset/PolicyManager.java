package insurancepolicy.usingset;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class PolicyManager {

    private Set<Policy> hashSetPolicies = new HashSet<>();
    private Set<Policy> linkedHashSetPolicies = new LinkedHashSet<>();
    private Set<Policy> treeSetPolicies = new TreeSet<>((p1, p2) -> p1.getExpiryDate().compareTo(p2.getExpiryDate()));


    public void addPolicy(Policy policy) {
        hashSetPolicies.add(policy);
        linkedHashSetPolicies.add(policy);
        treeSetPolicies.add(policy);
    }


    public Set<Policy> getAllUniquePolicies() {
        return new HashSet<>(hashSetPolicies);
    }

    public Set<Policy> getPoliciesExpiringSoon() {
        LocalDate now = LocalDate.now();
        return hashSetPolicies.stream()
                .filter(policy -> policy.getExpiryDate().isBefore(now.plusDays(30)))
                .collect(Collectors.toSet());
    }


    public Set<Policy> getPoliciesByCoverageType(CoverageType coverageType) {
        return hashSetPolicies.stream()
                .filter(policy -> policy.getCoverageType() == coverageType)
                .collect(Collectors.toSet());
    }

    public Set<Policy> getDuplicatePolicies() {
        Set<Policy> duplicates = new HashSet<>();
        Set<String> seen = new HashSet<>();
        for (Policy policy : hashSetPolicies) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }
    public void performanceComparison() {
        long startTime, endTime;


        startTime = System.nanoTime();
        addTest(hashSetPolicies);
        endTime = System.nanoTime();
        System.out.println("HashSet Add Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        removeTest(hashSetPolicies);
        endTime = System.nanoTime();
        System.out.println("HashSet Remove Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        searchTest(hashSetPolicies);
        endTime = System.nanoTime();
        System.out.println("HashSet Search Time: " + (endTime - startTime));

        // LinkedHashSet operations
        startTime = System.nanoTime();
        addTest(linkedHashSetPolicies);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        removeTest(linkedHashSetPolicies);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Remove Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        searchTest(linkedHashSetPolicies);
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet Search Time: " + (endTime - startTime));

        // TreeSet operations
        startTime = System.nanoTime();
        addTest(treeSetPolicies);
        endTime = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        removeTest(treeSetPolicies);
        endTime = System.nanoTime();
        System.out.println("TreeSet Remove Time: " + (endTime - startTime));

        startTime = System.nanoTime();
        searchTest(treeSetPolicies);
        endTime = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (endTime - startTime));
    }

    private void addTest(Set<Policy> set) {
        for (int i = 0; i < 10000; i++) {
            set.add(new Policy("POLICY" + i, "Name" + i, LocalDate.now().plusDays(i), CoverageType.HEALTH, 100.0));
        }
    }

    private void removeTest(Set<Policy> set) {
        for (int i = 0; i < 10000; i++) {
            set.remove(new Policy("POLICY" + i, "Name" + i, LocalDate.now().plusDays(i), CoverageType.HEALTH, 100.0));
        }
    }

    private void searchTest(Set<Policy> set) {
        set.contains(new Policy("POLICY5000", "Name5000", LocalDate.now().plusDays(5000), CoverageType.HEALTH, 100.0));
    }
}

