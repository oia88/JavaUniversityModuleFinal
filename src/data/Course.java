package data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Course> currentStudents;
    public String name;
    public String classroom;
    public Teacher teacherName;
    public Student student;


    public Course(String name, String classroom, Teacher teacherName) {
        this.name = name;
        this.classroom = classroom;
        this.teacherName = teacherName;
        this.currentStudents = new ArrayList<>();
    }



}
