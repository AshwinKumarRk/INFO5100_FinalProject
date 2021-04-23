/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.DonationManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class DonationOrganisation extends Organisation {

    public DonationOrganisation() {
        super(Type.Donation.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DonationManager());
        return roles;
    }
     
    
}