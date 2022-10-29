package persistance;

import data.*;

public class DataLoader {
    public static University loadUniversity(){
        University globantU = new University("Globant University");
        loadTeachers(globantU);
        loadStudents(globantU);
        loadCourse(globantU);
        setStudentsInCourse(globantU);
        return globantU;
    }

    private static void loadTeachers(University university){
        Teacher_FullTime teacher1 = new Teacher_FullTime("Fazt Montana", 200.0, 4);
        Teacher_FullTime teacher2 = new Teacher_FullTime("Bill Gates", 150.0, 2);
        Teacher_partTime teacher3 = new Teacher_partTime("Steve Jobs", 180.0, 48);
        Teacher_partTime teacher4 = new Teacher_partTime("Linux Towards", 250.0, 48);
        university.addTeacher(teacher1);
        university.addTeacher(teacher2);
        university.addTeacher(teacher3);
        university.addTeacher(teacher4);
    }
    private static void loadStudents(University university){
        Student student1 = new Student("Alejandra Alarcon",26);
        Student student2 = new Student("Oscar Araque",34);
        Student student3 = new Student("Daniel Ramirez",35);
        Student student4 = new Student("Margarita Bedoya",30);
        Student student5 = new Student("Daviana Castillo",26);
        Student student6 = new Student("Nicola Stornelli",34);
        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);
        university.addStudent(student4);
        university.addStudent(student5);
        university.addStudent(student6);
    }
     private static void loadCourse(University university){
        Course course1 = new Course("Python", "A-101", "Fazt Montana");
        Course course2 = new Course("Java", "B-203", "Bill Gates");
        Course course3 = new Course("Javascript", "C-302", "Steve Jobs");
        Course course4 = new Course("C++", "D-407", "Linux Towards");
        university.addCourse(course1);
        university.addCourse(course2);
        university.addCourse(course3);
        university.addCourse(course4);
    }
    private static void setStudentsInCourse(University university){
        university.addStudentInCourse(0,1);
        university.addStudentInCourse(2,1);
        university.addStudentInCourse(4,1);
        university.addStudentInCourse(3,1);
        university.addStudentInCourse(0,0);
        university.addStudentInCourse(1,0);
        university.addStudentInCourse(2,0);
        university.addStudentInCourse(4,0);
        university.addStudentInCourse(0,2);
        university.addStudentInCourse(2,2);
        university.addStudentInCourse(4,2);
        university.addStudentInCourse(5,2);
        university.addStudentInCourse(0,3);
        university.addStudentInCourse(1,3);
        university.addStudentInCourse(4,3);
    }
}
