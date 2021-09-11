package com.github.belbli.laba2;

import com.github.belbli.laba2.domain.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpId(1);
        employee.setName("Jane Smith");
        employee.setSalary(650.00);
        employee.setSsn("SSN");

        System.out.println(employee);
    }
}
