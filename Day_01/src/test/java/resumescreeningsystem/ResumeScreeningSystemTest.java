package resumescreeningsystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystemTest {

    @Test
    public void testResumeForSoftwareEngineer() {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Ankit Patel", "Responsible for writing code.");
        Resume<SoftwareEngineer> resume = new Resume<>(softwareEngineer, "Ankit Patel");

        // Validate resume details for Software Engineer
        assertNotNull(resume);
        assertEquals("Ankit Patel", resume.getCandidateName());
        assertEquals("Ankit Patel", resume.getJobRole().getName());
    }

    @Test
    public void testResumeForDataScientist() {
        DataScientist dataScientist = new DataScientist("Anand Soni", "Responsible for analyzing data and building models.");
        Resume<DataScientist> resume = new Resume<>(dataScientist, "Anand Soni");

        // Validate resume details for Data Scientist
        assertNotNull(resume);
        assertEquals("Anand Soni", resume.getCandidateName());
        assertEquals("Anand Soni", resume.getJobRole().getName());
    }

    @Test
    public void testResumeForProductManager() {
        ProductManager productManager = new ProductManager("Ankit kumar", "Responsible for overseeing product development.");
        Resume<ProductManager> resume = new Resume<>(productManager, "Ankit kumar");

        // Validate resume details for Product Manager
        assertNotNull(resume);
        assertEquals("Ankit kumar", resume.getCandidateName());
        assertEquals("Ankit kumar", resume.getJobRole().getName());
    }

    @Test
    public void testProcessResumes() {
        // Create instances of different job roles
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Ankit Patel", "Responsible for writing code.");
        DataScientist dataScientist = new DataScientist("Anand Soni", "Responsible for analyzing data and building models.");
        ProductManager productManager = new ProductManager("Ankit kumar", "Responsible for overseeing product development.");

        // Create resumes for each job role
        Resume<SoftwareEngineer> resume1 = new Resume<>(softwareEngineer, "Ankit Patel");
        Resume<DataScientist> resume2 = new Resume<>(dataScientist, "Anand Soni");
        Resume<ProductManager> resume3 = new Resume<>(productManager, "Ankit kumar");

        // Process resumes using the wildcard method
        List<JobRole> jobRoles = Arrays.asList(softwareEngineer, dataScientist, productManager);
        ResumeScreeningSystem.processResumes(jobRoles);
    }

    @Test
    public void testInvalidResumeProcessing() {
        // Create invalid job role object (null)
        assertThrows(NullPointerException.class, () -> {
            ResumeScreeningSystem.processResumes(Arrays.asList((JobRole) null));
        });
    }
}

