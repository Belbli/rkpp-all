package com.github.belbli.laba3.domain;


public class Manager extends Employee {
    private String deptName;

    public Manager(Integer empId, String name, String ssn, Double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() +
                "deptName='" + deptName + '\'' +
                '}';
    }
}
