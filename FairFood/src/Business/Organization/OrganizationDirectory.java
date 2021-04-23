/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
       
         if (type.getValue().equals(Type.CommunityFridge.getValue())){
            organization = new CommunityFridgeOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FoodSafetyOrganization.getValue())){
            organization = new FoodSafetyOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.DonationOrganization.getValue())){
            organization = new DonationOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.EventOrganization.getValue())){
            organization = new EventOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.FoodAdvisorOrganisation.getValue())){
            organization = new FoodAdvisorOrganisation();
            organizationList.add(organization);
        }
     
        
         else if (type.getValue().equals(Type.GroceryStoreOrganization.getValue())){
            organization = new GroceryStoreOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Delivery.getValue())){
            organization = new DeliveryOrganization();
            organizationList.add(organization);
        }
        
        return organization;
    }
}