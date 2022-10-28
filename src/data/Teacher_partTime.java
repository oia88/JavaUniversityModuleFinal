package data;

import java.util.ArrayList;
import java.util.List;

public class Teacher_partTime extends Teacher {
    private List<Teacher_partTime> partTime;
    private int hoursPerWeek;

    public Teacher_partTime(String name, double baseSalary, int hours) {
        super(name, baseSalary);
        this.partTime = new ArrayList<>();
        this.hoursPerWeek = hours;
    }

    @Override
    public double calculateSalary() {
        double salary = baseSalary * hoursPerWeek;
        return salary;
    }
}
