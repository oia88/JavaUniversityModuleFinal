package data;

import java.util.ArrayList;
import java.util.List;

public class Teacher_FullTime extends Teacher{

    private int expYears;

    public Teacher_FullTime(String name, double baseSalary, int exp) {
        super(name, baseSalary);
        this.expYears = exp;
    }

    @Override
    public double calculateSalary() {
        double salary = baseSalary * (expYears + 110/100);
        return salary;
    }
}
