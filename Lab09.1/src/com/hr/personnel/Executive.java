package com.hr.personnel;


import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    public Executive() {}

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " Got sunburn playing gold during work!");

    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
    }

    @Override
    public void fileReturn() {
        System.out.println(getName() + " has a file return");
    }

}