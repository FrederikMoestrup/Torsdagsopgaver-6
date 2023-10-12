package Task3;

import java.util.ArrayList;

public class Student extends Person{

    ArrayList<String> passedCourses = new ArrayList<>();
    ArrayList<String> currentCourses = new ArrayList<>();
    public Student(String name, ArrayList<String> passedCourses) {
        super(name);
        this.passedCourses=passedCourses;
    }

    @Override
    boolean addCourse(String course) {
        if(this.passedCourses.contains(course)){
            return false;
        }
        this.currentCourses.add(course);
        return true;
    }
}
