/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class CommunityFridge extends Enterprise {
    
    public CommunityFridge(String name){
        super(name,EnterpriseType.CommunityFridge);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
