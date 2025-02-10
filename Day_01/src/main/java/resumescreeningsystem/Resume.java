package resumescreeningsystem;
// Generic class for Resume processing
public class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;

    public Resume(T jobRole, String candidateName) {
        this.jobRole = jobRole;
        this.candidateName = candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    // Method to display resume details
    public void displayResumeDetails() {
        System.out.println("Candidate: " + candidateName);
        jobRole.displayRoleDetails();
    }
}
