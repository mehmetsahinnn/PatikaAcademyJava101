package classes.SalaryCalculator;

import java.util.Calendar;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
    double taxRate = 0.03;
    if (salary < 1000) {
        return 0;
    } else {
        return salary * taxRate;
    }
}

    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public void raiseSalary() {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);

        if (year - hireYear < 10) {
            this.salary = (int) (salary * 1.05);
        } else if ((year - hireYear > 9) && (year - hireYear < 20)) {
            this.salary = (int) (salary * 1.10);
        } else if ((year - hireYear > 19)) {
            this.salary = (int) (salary * 1.15);
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';
    }
}
