/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Receiver.ReceiverDirectory;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author truptiraut
 */
public abstract class Organization {

    public String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ReceiverDirectory receiverDirectory;
    private int organizationID;
   private int min = 1000;
    private int max = 9999;
    private static int count = 0;

    
    public enum Type{
        Admin("Admin Organization"), 
        CommunityFridge("CommunityFridge Organization"), 
        DonationOrganization("Donation Organization"),
        EventOrganization(" Event Organization"),
        FoodAdvisorOrganisation("FoodAdvisor Organization"),
        FoodSafetyOrganization("FoodSafety"),
        GroceryStoreOrganization("GroceryStore Organization"),
        Delivery("DeliveryMan");
        //Lab("Lab Organization"),
        //Doctor("Doctor Organisation");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        receiverDirectory = new ReceiverDirectory();
          Random r = new Random();
        count = r.nextInt(max-min) + min;
        organizationID = count;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public ReceiverDirectory getReceiverDirectory() {
        return receiverDirectory;
    }

    public void setReceiverDirectory(ReceiverDirectory receiverDirectory) {
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
