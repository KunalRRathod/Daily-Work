package com.cognizantTraining;

import java.util.List;
public class EmployeeController {
    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        //List<Employee> list = employeeDAO.getAllEmployees();
        //list.forEach(System.out::println);
        //Employee employee = new Employee(10, "Chaitali","Pune","Associate", 22, 4022235, 282897242);
        //employeeDAO.saveEmployee(employee);
        Employee employee = employeeDAO.getEmployeeById(1);
        System.out.println(employee);
    }
}
