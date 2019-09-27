package com.playtika.javacourse;

import java.util.Arrays;

public class Employee {

    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }

    public static void main(String[] args) {
        Employee[] empls = {
                new Employee(56, "Olga"),
                new Employee(76, "Alex"),
                new Employee(12, "Serj")
        };
        System.out.println(Arrays.toString(empls));

        Arrays.sort(empls, new EmployeeComparator());
        System.out.println(Arrays.toString(empls));
    }
}
