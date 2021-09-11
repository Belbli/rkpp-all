package com.github.belbli.laba3.domain;

public class Director extends Manager {
    private Double budget;

    public Director(Integer empId, String name, String ssn, Double salary, String deptName, Double budget) {
        super(empId, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    @Override
    public String toString() {
        return "Director{" + super.toString() +
                "budget=" + budget +
                '}';
    }
}
