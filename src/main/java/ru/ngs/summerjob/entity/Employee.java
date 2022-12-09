package ru.ngs.summerjob.entity;


import java.util.HashMap;
import java.util.Map;

public class Employee {
    private String name;
    private String surName;
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;


    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information technology");
        departments.put("HR", "Human resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Volvo", "Volvo");
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("General Motors", "GM");
    }

    public Employee(String name, String surName, int salary, String department) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.department = department;
    }


    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
