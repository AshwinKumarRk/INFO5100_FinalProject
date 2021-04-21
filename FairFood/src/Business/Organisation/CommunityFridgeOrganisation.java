/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class CommunityFridgeOrganisation extends Organisation {
    public CommunityFridgeOrganisation() { 
    super(Organisation.Type.CommunityFridge.getValue());}
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
      // roles.add(new Inspector());
       roles.add(new CommFridgeManager());
       return roles;
    }
   
     
}


