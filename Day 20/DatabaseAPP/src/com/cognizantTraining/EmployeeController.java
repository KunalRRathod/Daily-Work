package com.cognizantTraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
public class EmployeeController {
    public static void main(String[] args) throws NumberFormatException, IOException {
        //EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int continue_loop = 1;
		do {
			System.out.println("****employee management system**** ");
			System.out.println("choose options");
			System.out.println("1.add employee");
			System.out.println("2.delete employee");
			System.out.println("3. update employee");
			System.out.println("4. get employee by id");
			System.out.println("5. display all employee");
			System.out.println("6. exit");
			int no = Integer.parseInt(br.readLine());
			EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
			List<Employee> list = employeeDAO.getAllEmployees();		
			switch (no) {
			case 1:
				System.out.println("Enter Employee ID");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee Name");
				String nm = br.readLine();
				System.out.println("Enter Employee Address");
				String ad = br.readLine();
				System.out.println("Enter Employee Designation");
				String dsg = br.readLine();
				System.out.println("Enter Employee Age");
				int ag = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee Salary");
				int sal = Integer.parseInt(br.readLine());
				System.out.println("Enter Employee Mobile");
				long mob = Long.parseLong(br.readLine());
				Employee emp = new Employee(id, nm, ad, dsg, ag, sal, mob);
				employeeDAO.addEmployee(emp);		
				System.out.println("Do yo want to continue if yes press 1 else press 0");
				int p = Integer.parseInt(br.readLine());
				if (p == 1)
					continue_loop = 1;
				else
					continue_loop = 0;
				break;	
				case 2:
				System.out.println("Enter the employee id to delete data:");
				int del = Integer.parseInt(br.readLine());
				Employee obj = employeeDAO.getEmployeeById(del);
				employeeDAO.deleteEmployee(obj);
				System.out.println("Do yo want to continue if yes press 1 else press 0");
				int q = Integer.parseInt(br.readLine());
				if (q == 1)
					continue_loop = 1;
				else
					continue_loop = 0;
				break;
				case 3:
				System.out.println(" enter the id of employee whose data you want to update");
				int up = Integer.parseInt(br.readLine());
				Employee obj1 = employeeDAO.getEmployeeById(up);
				System.out.println("enter name");
				String y = br.readLine();
				obj1.setName(y);
				employeeDAO.updateEmployee(obj1);				// empObj.updateEmployee(emp1); // to update
				System.out.println(obj1);
				// empObj.updateEmployee(up); // to update
				System.out.println(up);
				System.out.println("Do yo want to continue if yes press 1 else press 0");
				int r = Integer.parseInt(br.readLine());
				if (r == 1)
					continue_loop = 1;
				else
					continue_loop = 0;			
				break;
				case 4:
				System.out.println(" enter employee id to get data");
				int data = Integer.parseInt(br.readLine());
				Employee obj2 = employeeDAO.getEmployeeById(data);
				System.out.println("Details:");
				// list.forEach(System.out::println);
				System.out.println(obj2);
				System.out.println("Do yo want to continue if yes press 1 else press 0");
				int s = Integer.parseInt(br.readLine());
				if (s == 1)
					continue_loop = 1;
				else
					continue_loop = 0;
				break;	
				case 5:
				System.out.println(" display detais of all employee");
				System.out.println("Details:");
				list.forEach(System.out::println);
				System.out.println("Do yo want to continue if yes press 1 else press 0");
				int t = Integer.parseInt(br.readLine());
				if (t == 1)
					continue_loop = 1;
				else
					continue_loop = 0;
				break;				case 6:
				System.exit(0);
				return;			default:
				System.out.println("wrong Input");
				break;
			}
		} while (continue_loop != 0);
	}
}
     
