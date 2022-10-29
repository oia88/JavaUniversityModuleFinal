package data;

public abstract class Teacher {
    private int id;
    private String name;
    protected double baseSalary;
    public double totalSalary;

    public Teacher(String name, double baseSalary) {
        this.id = (int)(Math.random()*10000);
        this.name = name;
        this.baseSalary = baseSalary;
        this.totalSalary = calculateSalary();
    }

    public String getName() {
        return name;
    }
    public abstract double calculateSalary();
    @Override
    public String toString() {
          return "Teacher: " + "\n" + "#ID: " + this.id + "\n" + "Name: " + this.name + "\n" +"Salary: " + this.totalSalary + "\n" + "---------------------" + "\n";
    }
}
