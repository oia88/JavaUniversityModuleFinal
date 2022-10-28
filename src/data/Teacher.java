package data;

public abstract class Teacher {
    private int id;
    private String name;
    protected double baseSalary;

    public Teacher(String name, double baseSalary) {
        this.id = (int)(Math.random()*10000);
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();
}
