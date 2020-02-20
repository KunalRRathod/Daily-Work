package com.cognizantTraining;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        addEmployees(list);
        // Collections.sort(list);
        for (Employee emp: list)
        {
            System.out.println(emp);
        }
        Collections.sort(list, new SortByName());
        //System.out.println(list);

    }

    private static void addEmployees(ArrayList<Employee> list) {
        Employee emp1 = new Employee(854, "Kunal", "Pune", "Programmer", 20, 41241.89, 79878974L);
        Employee emp2 = new Employee(855, "Sakshi", "Pune", "Programmer", 20, 41241.89, 78758974L);
        Employee emp3 = new Employee(853, "Aayushi", "Pune", "Programmer", 20, 41241.89, 79878974L);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

    }
}
