/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FoodSafetyOfficer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class FoodSafetyOrganization extends Organization {
    public FoodSafetyOrganization() {
        super(Type.FoodSafetyOrganization.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodSafetyOfficer());
        return roles;
    }  
    
}
