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
public class CommFridgeManager extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organisation organisation, UserAccount account, EcoSystem system, Network network) {
        return new CommunityFridgeWorkAreaJPanel(userProcessContainer, enterprise, organisation, account, system, network);
    }
}
