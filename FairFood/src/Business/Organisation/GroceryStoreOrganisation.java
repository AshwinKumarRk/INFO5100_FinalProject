/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.DeliveryMan;
import Business.Role.GroceryStoreManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class GroceryStoreOrganisation extends Organisation{
 public GroceryStoreOrganisation() {
        super(Organisation.Type.GroceryStore.getValue());
    }
            

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new GroceryStoreManager());
       return roles;    

}

 
}