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

    public String getCourseList() {
        String coursesList = "";
        for(int i = 0; i < courseList.size(); i++){
            coursesList += this.courseList.get(i) + "\n";
        }
        return coursesList;
    }

    public String getStudentList() {
        String studentsList = "";
        for(int i = 0; i < studentList.size(); i++){
            studentsList += this.studentList.get(i) + "\n";
        }
        return studentsList;
    }

    public String getTeacherList() {
        String teachersList = "";
        for (int i = 0; i < this.teacherList.size(); i++){
            teachersList += this.teacherList.get(i) + "\n";
        }
        return teachersList;
    }
    public String getName() {
        return name;
    }
    public Course getCourseByIndex(int courseIndex){
        return this.courseList.get(courseIndex);
    }
    public String getCoursesName(){
       String courseName = "";
       for(int i = 0; i < this.courseList.size(); i++){
           courseName += this.courseList.get(i).getName() + "\n";
       }
       return courseName;
    }
    public String getTeachersName(){
        String teachersName = "";
        for(int i = 0; i < this.teacherList.size(); i++){
            teachersName += this.teacherList.get(i).getName() + "\n";
        }
        return teachersName;
    }
    public Course getPythonData(int pythonIndex){
        Course python = this.getCourseByIndex(0);
        return python;
    }
    public Course getJavaData(int javaIndex){
        Course java = this.getCourseByIndex(1);
        return java;
    }
    public Course getJavascriptData(int javascriptIndex){
        Course javascript = this.getCourseByIndex(2);
        return javascript;
    }
    public Course getCData(int cIndex){
        Course c = this.getCourseByIndex(3);
        return c;
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
    public Student createNewStudent(String name, int age){
        Student newStudent = new Student(name, age);
        University.this.addStudent(newStudent);
        return newStudent;
    }
    public Course createNewCourse(String name, String classroom, String teacherName){
        Course newCourse = new Course(name, classroom, teacherName);
        University.this.addCourse(newCourse);
        return newCourse;
    }
    public void findStudent(int id){
        int contador = 0;
        for (int i = 0; i < this.courseList.size(); i++){
            for (int j = 0; j < courseList.get(i).getCurrentStudents().size(); j++){
                if(id == this.courseList.get(i).getCurrentStudents().get(j).getId()){
                    do{
                        System.out.println(this.courseList.get(i).name);
                        contador++;
                    } while (contador < i );
                }
            }
        }
    }
}
