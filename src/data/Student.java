package data;

public class Student {
    private String name;
    private int id;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.id = (int)(Math.random()*10000);
        this.age = age;
    }
}
