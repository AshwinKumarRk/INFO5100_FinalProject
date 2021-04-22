/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.GroceryStore.GroceryStore;
import Business.Organisation.Organisation;
import Business.Receiver.Receiver;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author visha
 */
public class UserAccount {
    private String username;
    private String password;
    private WorkQueue workQueue;
    private Receiver receiver;
    private Employee employee;
    private Role role;
    

   
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }
   

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    

    public UserAccount() {
        workQueue = new WorkQueue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
}
