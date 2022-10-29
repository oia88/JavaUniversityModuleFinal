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

    public List<Course> getCourseList() {
        return courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getName() {
        return name;
    }

    public void addTeacher(Teacher teacher){
        this.teacherList.add(teacher);
    }
    public void addStudent(Student student){
        this.studentList.add(student);
    }
    public void addCourse(Course course){
        this.courseList.add(course);
    }
    public void addStudentInCourse(int studentIndex, int courseIndex){
        this.getCourseByIndex(courseIndex).addStudent(this.studentList.get(studentIndex));
    }
    public Course getCourseByIndex(int courseIndex){
        return this.courseList.get(courseIndex);
    }
}
