package universitymanagement;

import java.util.List;

// Generic class to handle any type of course
public class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void evaluateCourse() {
        courseType.evaluate();
    }

    public String getCourseName() {
        return courseType.getCourseName();
    }

    public T getCourseType() {
        return courseType;
    }
}
