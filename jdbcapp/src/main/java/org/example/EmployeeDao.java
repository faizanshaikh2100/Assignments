package org.example;

import java.sql.SQLException;

public interface EmployeeDao {
    public void createEmployee(Employee emp) throws SQLException, ClassNotFoundException;
    public void getAllEmployees() throws SQLException, ClassNotFoundException;
    public void getEmployeeById(int id) throws SQLException, ClassNotFoundException;

    public void updateEmpByName(int id,String name) throws SQLException, ClassNotFoundException;
    public void deleteEmp(int id) throws SQLException, ClassNotFoundException;
    public void sortDesc() throws SQLException, ClassNotFoundException ;
    public void sortAesc() throws SQLException, ClassNotFoundException;
    public  void searchUsingStartPart(String name4) throws SQLException, ClassNotFoundException;

}
