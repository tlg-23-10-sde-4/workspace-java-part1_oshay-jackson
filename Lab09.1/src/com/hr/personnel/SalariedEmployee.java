package com.hr.personnel;


import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    double salary;

    public SalariedEmployee() {
        super(); // all constructors have to report to super class
    }
    @Override
    public void pay() {
        System.out.println(getName() + " paid $" + getSalary());
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    public void takeVacation() {
        System.out.println(getName() + " took a vacation");
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary=" + getSalary();
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid $" + getSalary() * SALARIED_TAX_RATE);
    }

    @Override
    public double getStandardDeduction() {
        return 0;
    }
    @Override
    public void fileReturn() {
    }
}
