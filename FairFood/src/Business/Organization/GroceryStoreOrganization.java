/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManRole;
import Business.Role.Role;
import Business.Role.GroceryStoreManager;
import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class GroceryStoreOrganization extends Organization{

    public GroceryStoreOrganization() {
        super(Organization.Type.GroceryStoreOrganization.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GroceryStoreManager());
        return roles;
    }
}
