package com.cognizantTraining;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class jdbcPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException , SQLException, NumberFormatException, IOException {

        // User Inputs start here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Enter Emp Id");
       // int id = Integer.parseInt(br.readLine());
        //System.out.println("Enter Employee Name");
       // String name = br.readLine();
        /*System.out.println("Enter Employee Address");
        String address = br.readLine();
        System.out.println("Enter Age");
        int age = Integer.parseInt(br.readLine());
        System.out.println("Enter Phone Number");
        long phone = Long.parseLong(br.readLine()); */

        // Establish JDBC Connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3307/ctspune";
        Connection conn = DriverManager.getConnection(url, "root", "root");
        // String query = "insert into employee values(?,?,?,?,?)";
        String query = "update employee set name =? where id =?";
        //String query = "Select * from employee";
        PreparedStatement ps = conn.prepareStatement(query);
        //ps.setString(1,name);
        //ps.setInt(2, id);
       // int result = ps.executeUpdate();
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.println("id is : \n "+rs.getInt(1)+" Name is: \n"+rs.getString(2)
                    +"Address is : \n"+rs.getString(3)+"Age is : \n"
                    +rs.getInt(4)+"Phone Number is : \n"+rs.getLong(5));
        }

        /*ps.setInt(1, id);
        ps.setString(2,name);
        ps.setString(3, address);
        ps.setInt(4, age);
        ps.setLong(5, phone);
        int result = ps.executeUpdate();
        {
            if (result > 0){
                System.out.println("Query Executed !!");
            }
            else {
                System.out.println("We encountered some difficulty");
            }*/

        }
    }

