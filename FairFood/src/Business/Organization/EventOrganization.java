/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public class EventOrganization extends Organization {
    public EventOrganization() {
        super(Organization.Type.EventOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManager());
        return roles;
    }
    
}
