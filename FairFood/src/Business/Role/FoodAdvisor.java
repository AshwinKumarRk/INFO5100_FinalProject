/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FoodAdvisorOrganisation;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.FoodAdvisor.FoodAdvisorWorkAreaJPanel;
import javax.swing.JPanel;


/**
 *
 * @author visha
 */
public class FoodAdvisor extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        return new FoodAdvisorWorkAreaJPanel(userProcessContainer, enterprise, organization, account, business, network);
    }
}
