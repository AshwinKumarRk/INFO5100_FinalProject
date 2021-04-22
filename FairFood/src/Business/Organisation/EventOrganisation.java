/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.EventManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class EventOrganisation extends Organisation {

    public EventOrganisation() {
        super(Type.Donation.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManager());
        return roles;
    }
     
    
}
