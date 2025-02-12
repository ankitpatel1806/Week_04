package insurancepolicy.usingset;

import java.time.LocalDate;
public class Policy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;
    private CoverageType coverageType;
    private double premiumAmount;
    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate, CoverageType coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }
    public String getPolicyNumber() {
        return policyNumber;
    }
    public String getPolicyholderName() {
        return policyholderName;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public CoverageType getCoverageType() {
        return coverageType;
    }
    public double getPremiumAmount() {
        return premiumAmount;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }
    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }
    @Override
    public String toString() {
        return "Policy{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                ", coverageType=" + coverageType +
                ", premiumAmount=" + premiumAmount +
                '}';
    }
}

