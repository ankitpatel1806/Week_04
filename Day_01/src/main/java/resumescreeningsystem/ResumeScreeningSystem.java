package resumescreeningsystem;

import java.util.List;

public class ResumeScreeningSystem {

    // Method to process a list of resumes for any job role
    public static void processResumes(List<? extends JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            jobRole.displayRoleDetails();
        }
    }
}

