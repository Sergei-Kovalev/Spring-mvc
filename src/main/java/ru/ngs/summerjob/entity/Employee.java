package ru.ngs.summerjob.entity;


import jakarta.validation.constraints.*;
import ru.ngs.summerjob.validation.CheckEmail;

import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, message = "Name must contain at least 2 characters")
    private String name;
//    @NotEmpty(message = "Surname is required field")
    @NotBlank(message = "Surname is required field")
    private String surName;
    @Min(value = 500, message = "500 min declared!")
    @Max(value = 1500, message = "Are you sure??? This is Belarus! -> 1500 max!")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> languageList;

    @CheckEmail(value = "ngs.ru", message = "e-mail must ends with ngs.ru")
    private String email;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Please use pattern XXX-XX-XX")
    private String phoneNumber;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information technology");
        departments.put("HR", "Human resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("Volvo", "Volvo");
        carBrands.put("Mercedes-Benz", "MB");
        carBrands.put("General Motors", "GM");

        languageList = new HashMap<>();
        languageList.put("English", "EN");
        languageList.put("Chinese", "CH");
        languageList.put("Poland", "PL");
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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLanguageList() {
        return languageList;
    }

    public void setLanguageList(Map<String, String> languageList) {
        this.languageList = languageList;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
