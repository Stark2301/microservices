package com.arya.java8.Question3;

public class Student {
    private int Id;
    private String name;
    private int age;
    private String gender;
    private String roleName;
    private int year;
    private Double salary;

    public Student(int id, String name, int age, String gender, String roleName, int year, Double salary) {
        Id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.roleName = roleName;
        this.year = year;
        this.salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", roleName='" + roleName + '\'' +
                ", year=" + year +
                ", salary=" + salary +
                '}';
    }
}
