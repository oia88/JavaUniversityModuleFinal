package data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> currentStudents;
    public String name;
    public String classroom;
    public String teacherName;

    public Course(String name, String classroom, String teacherName) {
        this.name = name;
        this.classroom = classroom;
        this.teacherName = teacherName;
        this.currentStudents = new ArrayList<>();
    }

    public List<Student> getCurrentStudents() {
        return currentStudents;
    }
    public String getName() {
        return name;
    }
    public void addStudent(Student student){
        this.currentStudents.add(student);
    }
    @Override
    public String toString() {
        return "Course: " + "\n" + "Name: " + this.name + "\n" + "Classroom: " + this.classroom + "\n" + "Teacher: " + this.teacherName + "\n" + this.currentStudents + "\n";
    }
}
