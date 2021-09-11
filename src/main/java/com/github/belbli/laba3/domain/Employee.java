package com.github.belbli.laba3.domain;

public class Employee {
    private Integer empId;
    private String name;
    private String ssn;
    private Double salary;

    public Employee(Integer empId, String name, String ssn, Double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public Integer getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + salary +
                '}';
    }
}
