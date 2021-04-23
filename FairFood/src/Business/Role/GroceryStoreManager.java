/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.AdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;
import UserInterface.GroceryStoreManager.ManageGroceryStoreJPanel;

/**
 *
 * @author ashwin
 */
public class GroceryStoreManager extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        return new ManageGroceryStoreJPanel(userProcessContainer, enterprise, organization, account, business, network);
    }
 
}
