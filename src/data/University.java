package data;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;

    private List<Teacher> teacherList;

    private List<Student> studentList;
    private List<Course> courseList;

    public University(String name) {
        this.name = name;
        this.teacherList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.courseList = new ArrayList<>();
    }

}
