/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private final Employee[] employees = new Employee[100];
    private int currentIndex = 0;  // for dealing with the array

    // constructors
    public Department() {
        super(); // all constructors have to report to super class object
    } // no-arg constructor

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (int i = 0; i < currentIndex; i++) {
            System.out.println(employees[i]);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].work();
        }
    }

    public void payEmployees() {
        for (int i = 0; i < currentIndex; i++) {
            employees[i].pay();
        }
    }

    /*
     * Employees on salary must take vacation to make sure their alloted number of
     */
    public void holidayBreak() {
        for (int i = 0; i < currentIndex; i++) {
            // Boil the type of SalariedEmployee down deeper.
            // There is a Salaried Employee
            // There is a Salaried Employee that takes vacation
            // This will enable more specific SalariedEmployee methods to be called.



            if (employees[i] instanceof SalariedEmployee) {
                // ((SalariedEmployee) employees[i]).takeVacation(); * Downcast method call all in one.

               SalariedEmployee semp = (SalariedEmployee) employees[i]; // explicit downcast to new reference
               semp.takeVacation();
               // Downcast syntax
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees[currentIndex++] = emp;
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String toString() {
        return super.toString() + ", name=" + getName() + ", location=" + getLocation();
    }

    public void getStandardDeduction() {
        System.out.println(getName() + " has no standard deduction.");
    }

    public void fileReturn() {
    }

    public void payTaxes() {
    }
}