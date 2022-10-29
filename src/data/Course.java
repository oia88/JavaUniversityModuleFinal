package data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    List<Student> currentStudents;
    public String name;
    public String classroom;
    public String teacherName;

    public Course(String name, String classroom, String teacherName) {
        this.name = name;
        this.classroom = classroom;
        this.teacherName = teacherName;
        this.currentStudents = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.currentStudents.add(student);
    }
}
