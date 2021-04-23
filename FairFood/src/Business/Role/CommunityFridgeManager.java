/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CommunityFridgeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CommunityFridge.CommunityFridgeWorkAreaJPanel;

/**
 *
 * @author truptiraut
 */
public class CommunityFridgeManager extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        return new CommunityFridgeWorkAreaJPanel(userProcessContainer, enterprise, organization, account, business, network);
    }
}
