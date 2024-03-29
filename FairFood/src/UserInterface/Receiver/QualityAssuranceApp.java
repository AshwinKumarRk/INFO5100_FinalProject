/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receiver;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ashwin
 */
public class QualityAssuranceApp extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;

    /**
     * Creates new form QualityAssuranceJPanel
     */
  
    QualityAssuranceApp(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system =system;
        this.network = network;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        FoodSafety = new javax.swing.JButton();
        FoodAdvisor = new javax.swing.JButton();
        back = new javax.swing.JButton();
        rightJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(151, 120, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FoodSafety.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        FoodSafety.setText("Food Safety Officer");
        FoodSafety.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodSafetyActionPerformed(evt);
            }
        });
        jPanel1.add(FoodSafety, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 35));

        FoodAdvisor.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        FoodAdvisor.setText("Food Advisor");
        FoodAdvisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodAdvisorActionPerformed(evt);
            }
        });
        jPanel1.add(FoodAdvisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 240, 35));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        back.setText(" Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        jSplitPane1.setLeftComponent(jPanel1);

        rightJPanel.setBackground(new java.awt.Color(255, 255, 255));
        rightJPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aaa.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        rightJPanel.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(rightJPanel);

        add(jSplitPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void FoodSafetyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodSafetyActionPerformed
        // TODO add your handling code here:
         FoodSafetyOfficerJPanel panel = new FoodSafetyOfficerJPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("FoodSafetyOfficerJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_FoodSafetyActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backActionPerformed

    private void FoodAdvisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodAdvisorActionPerformed
        // TODO add your handling code here:
         FoodAdvisorJPanel panel = new FoodAdvisorJPanel(userProcessContainer, system, network, userAccount);
        rightJPanel.add("FoodAdvisorJPanel", panel);
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_FoodAdvisorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FoodAdvisor;
    private javax.swing.JButton FoodSafety;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel rightJPanel;
    // End of variables declaration//GEN-END:variables
}
