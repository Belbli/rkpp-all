package com.github.belbli.laba3.domain;

public class Engineer extends Employee {
    public Engineer(Integer empId, String name, String ssn, Double salary) {
        super(empId, name, ssn, salary);
    }

    @Override
    public String toString() {
        return "Engineer " + super.toString();
    }
}
