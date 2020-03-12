package com.cognizantTraining;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
	// Step 1 : Load DataBase Driver MySQL 8
      Class.forName("com.mysql.cj.jdbc.Driver"); // creates an exception - ClassNotFound, so use throws
        // Step 2 : Establish the connection using Driver Manager Class
        String url = "jdbc:mysql://localhost:3307/ctspune";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        //System.out.println("Connection Established Successfully");
        //System.out.println(conn.getClass().getName());

        //Execute SQL Queries
        Statement stmt = conn.createStatement();
        // SQL insert Query
        /*String query1 = "insert into employee values(4,'Chaitali', 'Pune', 22, 8773342587)";
        int result = stmt.executeUpdate(query1);
            if (result > 0){
                System.out.println("Record Inserted Successfully");
            }
            else {
                System.out.println("Something went wrong");
            }
        String query2 = "update employee  set address = 'Indore' where id = 3";
        int update = stmt.executeUpdate(query2);
        if (update > 0){
            System.out.println("Record Updated Successfully");
        }
        else {
            System.out.println("Something went wrong");
        }
       String query3 = "select * from employee";
        ResultSet rs = stmt.executeQuery(query3);
        while (rs.next()){
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String address = rs.getString(3);
            int age = rs.getInt(4);
            long phone = rs.getLong(5);
            System.out.println(id+" : "+name+" : "+address+" : "+age+" : "+phone);
        } */
       //String createtable = "CREATE TABLE MANAGER (mid int primary key, mname VARCHAR(50), address VARCHAR(60), age int, phone long )";

        //int res= stmt.executeUpdate(createtable);
        String query2 = "alter table employee modify column id int auto_increment";
        //String query1 = "insert into manager values(4,'Chaitali', 'Pune', 22, 8773342587)";
        int result = stmt.executeUpdate(query2);
        if (result > 0){
            System.out.println("Record Inserted Successfully");
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}


