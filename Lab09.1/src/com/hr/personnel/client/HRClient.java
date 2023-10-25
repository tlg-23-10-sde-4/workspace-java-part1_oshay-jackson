/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;


import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {

        //SalariedEmployee emp = new SalariedEmployee();
        //emp.takeVacation();
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);



        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Shana", LocalDate.of(1990, 8, 2), 2000.0));
        dept.addEmployee(new HourlyEmployee("Mylinh", LocalDate.of(2000, 2, 2), 33.7, 100.0));
        dept.addEmployee(new SalariedEmployee("Jackson", LocalDate.of(2016, 8, 2), 100000.0));
        dept.addEmployee(new HourlyEmployee("Dylan", LocalDate.of(2016, 8, 2), 125.0, 100.0));
        dept.addEmployee(new Executive("Oshay", LocalDate.of(2016, 8, 2), 25000000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay its Employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

        // Mandatory holiday break
        System.out.println("\nMandatory holiday break:");
        dept.holidayBreak();

        // File return
        System.out.println("\nFile return:");
        dept.fileReturn();



        // Pay taxes
        System.out.println("\nPay taxes:");
        dept.payTaxes();


    }
}