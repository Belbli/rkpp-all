package com.github.belbli.laba3.domain;

public class Admin extends Employee {

    public Admin(Integer empId, String name, String ssn, Double salary) {
        super(empId, name, ssn, salary);
    }

    @Override
    public String toString() {
        return "Admin " + super.toString();
    }
}
