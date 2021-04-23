/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CommunityFridgeManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class CommunityFridgeOrganization extends Organization {

    public CommunityFridgeOrganization() {
        super(Type.CommunityFridge.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CommunityFridgeManager());
        return roles;
    }
     
    
}
