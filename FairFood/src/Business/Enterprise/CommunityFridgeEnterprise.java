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
public class CommunityFridgeEnterprise  extends Enterprise{
     public CommunityFridgeEnterprise (String name) {
        super(name, Enterprise.EnterpriseType.GroceryStore);
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }


    
}