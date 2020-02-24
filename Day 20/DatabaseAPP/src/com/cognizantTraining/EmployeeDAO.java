package com.cognizantTraining;
import java.util.List;

public interface EmployeeDAO{
    public void addEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public boolean saveEmployee(Employee employee);
    public Employee getEmployeeById(int id);
    public List<Employee> getAllEmployees();
}