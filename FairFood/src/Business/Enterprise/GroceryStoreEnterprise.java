/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class GroceryStoreEnterprise extends Enterprise{
    public GroceryStoreEnterprise (String name) {
        super(name, Enterprise.EnterpriseType.GroceryStore);
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
