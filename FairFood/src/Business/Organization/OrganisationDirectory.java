/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Organisation.Organisation.Type;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class OrganisationDirectory {
    private ArrayList<Organisation> organisationList;
    
    public OrganisationDirectory()
    {
        organisationList = new ArrayList<>();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }

    public void setOrganisationList(ArrayList<Organisation> organisationList) {
        this.organisationList = organisationList;
    }
    
    public Organisation createOrganisation(Type type)
    {
        Organisation o = null;
        
         if(type.getValue().equals(Type.GroceryStore.getValue()))
        {
            o = new GroceryStoreOrganisation();
            organisationList.add(o);
        }
        else if(type.getValue().equals(Type.Receiver.getValue()))
        {
            o = new ReceiverOrganisation();
            organisationList.add(o);
        }
        else if(type.getValue().equals(Type.DeliveryMan.getValue()))
        {
            o = new DeliveryManOrganisation();
            organisationList.add(o);
        }
          else if(type.getValue().equals(Type.CommunityFridge.getValue()))
        {
            o = new CommunityFridgeOrganisation();
            organisationList.add(o);
        }
      
        return o;
    }
}
