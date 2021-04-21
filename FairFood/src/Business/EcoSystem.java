/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.GroceryStore.GroceryStore;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.management.relation.Role;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author visha
 */
public class EcoSystem extends Organisation{
      private static EcoSystem business;
    private ArrayList<Network> networkList;
     private GroceryStore grocerystoreDirectory;
      private EnterpriseDirectory enterpriseDirectory;
      
       private EcoSystem(){
        super(null);
        enterpriseDirectory=new EnterpriseDirectory();
        networkList=new ArrayList<Network>();
    }


     public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    public void removeNetwork(Network network){
        networkList.remove(network);
       
    }
    @Override
     public ArrayList<Business.Role.Role> getSupportedRole() {
        ArrayList<Business.Role.Role> roleList=new ArrayList<Business.Role.Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networkList){
            
        }
        return true;
    }
}
