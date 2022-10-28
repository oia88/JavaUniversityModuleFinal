package persistance;

import data.Course;
import data.University;

public class DataLoader {
    public University loadUniversity(){
        University globantU = new University("Globant University");
        return globantU;
    }

    private void loadTeachers(){}
    /* private void loadCourse(Course course){
        Course course1 = new Course("Python", "A-101", "Chad Muska");
    }*/

}
