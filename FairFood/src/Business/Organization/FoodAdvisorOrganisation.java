/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.FoodAdvisor;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public class FoodAdvisorOrganisation extends Organization{
    public FoodAdvisorOrganisation() {
        super(Organization.Type.FoodAdvisorOrganisation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodAdvisor());
        return roles;
    }
}
