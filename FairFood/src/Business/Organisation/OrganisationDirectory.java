package Business.Organisation;

import Business.Employee.EmployeeDirectory;
import Business.Organisation.Organisation.Type;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
    
    public Organisation createOrganisation(Organisation.Type type)
    {
        Organisation o = null;
        if(type.getValue().equals(Organisation.Type.Inspector.getValue()))
        {
            o = new InspectorOrganisation();
            organisationList.add(o);
        }
        else if(type.getValue().equals(Organisation.Type.Stock.getValue()))
        {
            o = new StockOrganisation();
            organisationList.add(o);
        }
        else if(type.getValue().equals(Organisation.Type.GroceryStore.getValue()))
        {
            o = new GroceryStoreOrganisation();
            organisationList.add(o);
        }
        else if(type.getValue().equals(Organisation.Type.Receiver.getValue()))
        {
            o = new ReceiverOrganisation();
            organisationList.add(o);
        }
        else if(type.getValue().equals(Organisation.Type.DeliveryMan.getValue()))
        {
            o = new DeliveryManOrganisation();
            organisationList.add(o);
        }
          else if(type.getValue().equals(Organisation.Type.NGOManager.getValue()))
        {
            o = new NGOManagerOrganisation();
            organisationList.add(o);
        }
      
        return o;
    }
}
