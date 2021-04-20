/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author truptiraut
 */
public abstract class Role {
    
     
    public enum RoleType{
        Admin("Admin Role"),
        ClientServiceAssociate("Client Service Associate Role"),
        ClientServiceManager("Client Service Manager Role"),
        InventoryAssistant("Inventory Assistant Role"),
        InventoryManager("Inventory Manager Role"),
        Donor("Donor Role");
        
        
        private String value;
        private RoleType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString()
        {
            return this.value;
        }
    }
   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            Enterprise enterprise, 
            Organisation organisation,
            UserAccount account, 
            EcoSystem business,
            Network network);


    @Override
    public String toString() {
        return this.getClass().getName();
    }

}

    


