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
public class TransportEnterprise {
    public TransportEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Transport);
    }
    
    @Override
    
     public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
