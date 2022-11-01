package data;

import java.util.ArrayList;
import java.util.List;

public class Teacher_FullTime extends Teacher{

    private int expYears;

    public Teacher_FullTime(String name, double baseSalary, int expYears) {
        super(name, baseSalary);
        this.expYears = expYears;
    }
    @Override
    public double calculateSalary() {
        double salary = baseSalary * (expYears * 1.1);
        return salary;
    }
}
