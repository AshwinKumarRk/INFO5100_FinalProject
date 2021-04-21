/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Employee.EmployeeDirectory;
import Business.Receiver.ReceiverDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author ashwin
 */
public abstract class Organisation {
     public String name;
    private WorkQueue workQueue;
     private ReceiverDirectory receiverDirectory;
    private int organisationID;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
   
   private int min = 1000;
    private int max = 9999;
    private static int count = 0;

    public ReceiverDirectory getReceiverDirectory() {
        return receiverDirectory;
    }

    public void setReceiverDirectory(ReceiverDirectory receiverDirectory) {
        this.receiverDirectory = receiverDirectory;
    }
   
    public int getOrganisationID() {
        return organisationID;
    }

    public void setOrganisationID(int organisationID) {
        this.organisationID = organisationID;
    }
   
    
   
    public enum Type{
       Admin("Admin Organisation"),
       Inspector("Inspector Organisation"),
       FoodAdvisor("Food Advisor"),
       Stock("Inventory Organisation"),
       Receiver("Receiver Organisation"),
       GroceryStore("Donor Organisation"),
       DeliveryMan("Delivery Organisation"),
       CommunityFridge("CommunityFridge Organisation");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organisation(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        receiverDirectory = new ReceiverDirectory();
          Random r = new Random();
        count = r.nextInt(max-min) + min;
        organisationID = count;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

   
    public ReceiverDirectory getCustomerDirectory() {
        return receiverDirectory;
    }

    public void setCustomerDirectory(ReceiverDirectory customerDreceiverDirectoryirectory) {
        this.receiverDirectory = receiverDirectory;
    }
    

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
