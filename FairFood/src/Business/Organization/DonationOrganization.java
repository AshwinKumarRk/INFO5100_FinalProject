/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Role.Role;
import Business.Role.DonationManagerRole;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public class DonationOrganization extends Organization {

    public DonationOrganization() {
        super(Organization.Type.DonationOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonationManagerRole());
        return roles;
    }
    
}
