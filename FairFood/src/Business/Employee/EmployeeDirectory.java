/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.GroceryStore.GroceryStore;
import Business.Receiver.Receiver;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void removeEmployee (Employee e){
        employeeList.remove(e);
    }
       public boolean checkIfUsernameIsUnique(String name){
        for (Employee e : employeeList){
            if (e.getName().equals(name))
                return false;
        }
        return true;
    }
    
}
