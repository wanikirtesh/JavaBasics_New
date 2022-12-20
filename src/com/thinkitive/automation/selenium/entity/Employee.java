package com.thinkitive.automation.selenium.entity;
public class Employee {
    public final float PI = 3.14f;
    private int employeeId;
    private final String employeeName;
    private String department;



    public Employee(int employeeId, String employeeName, String department){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.department =department;

    }

    public void printMyDetails(){
        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(department);
    }

    public String getMyDetails(){
        return "Id:" + employeeId + "\tName:" + employeeName + "\tDepartment:" + department;
    }


    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }
}
