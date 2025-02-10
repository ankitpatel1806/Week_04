package resumescreeningsystem;
import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystemMain {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Ankit Patel", "Responsible for writing code.");
        DataScientist dataScientist = new DataScientist("Anand Soni", "Responsible for analyzing data and building models.");
        ProductManager productManager = new ProductManager("Ankit kumar", "Responsible for overseeing product development.");
        Resume<SoftwareEngineer> resume1 = new Resume<>(softwareEngineer, "Ankit Patel");
        Resume<DataScientist> resume2 = new Resume<>(dataScientist, "Anand Soni");
        Resume<ProductManager> resume3 = new Resume<>(productManager, "Ankit kumar");
        resume1.displayResumeDetails();
        resume2.displayResumeDetails();
        resume3.displayResumeDetails();
        List<JobRole> jobRoles = Arrays.asList(softwareEngineer, dataScientist, productManager);
        ResumeScreeningSystem.processResumes(jobRoles);
    }
}
