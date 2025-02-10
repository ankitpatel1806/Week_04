package universitymanagement;
public class ResearchCourse extends CourseType {

    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluating " + getCourseName() + " based on research.");
    }
}
