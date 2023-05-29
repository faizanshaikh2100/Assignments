package org.example;

import java.sql.*;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeDaoImpl implements EmployeeDao {

    public EmployeeDaoImpl() throws SQLException, ClassNotFoundException {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press Enter to continue");
            scanner.nextLine();
            System.out.println();
            System.out.println("---------Employee Portal-----------");
            System.out.println();
            System.out.println("Choose option");
            System.out.println();

            System.out.println("1 . Add Employee");
            System.out.println("2 . Show all Employee");
            System.out.println("3 . Show emp based on id");
            System.out.println("4 . Update emp");
            System.out.println("5 . delete employee");
            System.out.println("6 . Search");
            System.out.println("7 . Sorted Employee By salary");


            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter employee id");
                    int id = scanner.nextInt();
                    System.out.println("Enter employee Name");
                    String name = scanner.next();
                    System.out.println("Enter employee salary");
                    double salary = scanner.nextDouble();
                    System.out.println("Enter employee age");
                    int age = scanner.nextInt();

                    Employee emp = new Employee(id, name, salary, age);

                    createEmployee(emp);
                    break;

                case 2:
                    getAllEmployees();
                    break;

                case 3:
                    System.out.println("Enter employee id");
                    int id1 = scanner.nextInt();
                    getEmployeeById(id1);
                    break;
                case 4:
                    System.out.println("Enter employee id");
                    int id2 = scanner.nextInt();
                    System.out.println("Enter employee Name");
                    String name2 = scanner.next();

                    updateEmpByName(id2, name2);
                    break;

                case 5:
                    System.out.println("Enter id of employee you want to delete");
                    int id3 = scanner.nextInt();
                    deleteEmp(id3);
                    break;

                case 6:
                    System.out.println("Enter name");
                    String name4 = scanner.next();

                    searchUsingStartPart(name4);
                    break;
                case 7:
                    System.out.println("How you want to sort?");
                    System.out.println();
                    System.out.println("    1. Ascending order");
                    System.out.println("    2. Descending order");
                    int opt2 = scanner.nextInt();

                    switch (opt2){
                        case 1:
                            sortAesc();

                            break;
                        case 2:
                            sortDesc();

                            break;

                        default:
                            System.out.println("Wrong choice");
                            break;
                    }
                    break;
                default:
                    System.out.println("Wrong choice choose from 1,2,3 or 4 ");
                    break;
            }
        }
    }

    public void searchUsingStartPart(String name4) throws SQLException, ClassNotFoundException {
        con = DBConnection.createDBConnection();
        String query = "SELECT * FROM employee where name like '"+name4+"%'";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                System.out.println("-------------------------------------------");
            }
        }catch (Exception e){

        }
    }

    Connection con;

    @Override
    public void createEmployee(Employee emp) throws SQLException, ClassNotFoundException {
        con = DBConnection.createDBConnection();
        String query = "Insert into employee values(?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setDouble(3, emp.getSalary());
            ps.setInt(4, emp.getAge());
            int count = ps.executeUpdate();
            if (count != 0) System.out.println("Employee inserted successfully..!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void sortAesc() throws SQLException, ClassNotFoundException {
        con = DBConnection.createDBConnection();
        String query = "SELECT * FROM employee order by salary";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                System.out.println("-------------------------------------------");
            }
        }catch (Exception e){

        }
    }
    public void sortDesc() throws SQLException, ClassNotFoundException {
        con = DBConnection.createDBConnection();
        String query = "SELECT * FROM employee order by salary desc";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                System.out.println("-------------------------------------------");
            }
        }catch (Exception e){

        }
    }

    @Override
    public void getAllEmployees() throws SQLException, ClassNotFoundException {
        // TODO Auto-generated method stub
        con = DBConnection.createDBConnection();
        String query = "SELECT * FROM employee";
        System.out.println("-------------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\t", "ID","Name","Salary","Age");
        System.out.println("-------------------------------------------");
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()) {
                System.out.format("%d\t%s\t%f\t%d\t\n", rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                System.out.println("-------------------------------------------");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getEmployeeById(int id) throws SQLException, ClassNotFoundException {
        con = DBConnection.createDBConnection();

        String query = "SELECT * FROM employee where id = "+id;

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()) {
                System.out.format("%d\t%s\t%f\t%d\\t",
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getDouble(3),
                        rs.getInt(4));

            }
        } catch (Exception e) {
            e.printStackTrace();		}


    }

    @Override
    public void updateEmpByName(int id, String name) throws SQLException, ClassNotFoundException {
     con = DBConnection.createDBConnection();
     String query = "update employee set name=? where id=?";
     try{
         PreparedStatement ps = con.prepareStatement(query);
         ps.setString(1,name);
         ps.setInt(2,id);

         int count = ps.executeUpdate();
         if(count!=0) System.out.println("Employee details updated successfully..!!");
     }
     catch(Exception e){
         e.printStackTrace();
     }
    }

    @Override
    public void deleteEmp(int id) throws SQLException, ClassNotFoundException {
        con = DBConnection.createDBConnection();

        String query = "Delete FROM employee where id = "+id;

        try {
            Statement st = con.createStatement();
            int count = st.executeUpdate(query);
            if(count!=0)System.out.println("Deleted employee");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
//


    }
}
