package com.cognizantTraining;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAOImpl implements EmployeeDAO {
   Connection conn = getConnection();
   PreparedStatement ps = null;


   public boolean saveEmployee(Employee employee) {
       String sql = "insert into employee values(?,?,?,?,?,?,?)";
       try {
           ps = conn.prepareStatement(sql);
           ps.setInt(1, employee.getId());
           ps.setString(2, employee.getName());
           ps.setString(3, employee.getAddress());
           ps.setInt(4, employee.getAge());
           ps.setLong(5, employee.getPhone());
           ps.setString(6, employee.getDesignation());
           ps.setDouble(7, employee.getSalary());

           ps.executeUpdate();
           return true;
       }
       catch (SQLException e){
           e.printStackTrace();
           return false;
       }
   }
    public void addEmployee(Employee employee) {

    }

    public void deleteEmployee(Employee employee) {

    }

    public void updateEmployee(Employee employee) {
       String sql = "update employee set name =? where id =?";
       try {
           ps = conn.prepareStatement(sql);
           ps.setInt(1, employee.getId());
       }
       catch(Exception ex){
           ex.printStackTrace();
       }

    }

    public Employee getEmployeeById(int id) {
       String sql = "select * from employee where id =?";
       try {
           ps = conn.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs = ps.executeQuery();
           Employee employee = null;
           while (rs.next()) {
               employee = new Employee();
               employee.setId(rs.getInt("id"));
               employee.setName(rs.getString("name"));
               employee.setAge(rs.getInt("age"));
               employee.setAddress(rs.getString("address"));
               employee.setPhone(rs.getLong("phone"));
               employee.setDesignation(rs.getString("designation"));
               employee.setDesignation(rs.getString("salary"));
           }



       }
       catch (Exception ex) {
           ex.printStackTrace();
       }
        return null;
    }


    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<Employee>();
        String sql = "select * from employee";
        try {
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Employee emp = new Employee();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setAge(rs.getInt("age"));
                emp.setAddress(rs.getString("address"));
                emp.setPhone(rs.getLong("phone"));
                employees.add(emp);
            }
            return  employees;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;

    }


    private Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/ctspune";
            conn = DriverManager.getConnection(url, "root", "root");
            return conn;
        } catch (Exception e) {
            return null;
        }
    }
}