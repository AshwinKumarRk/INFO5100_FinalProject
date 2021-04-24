/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receiver;

import Business.Receiver.Receiver;
import Business.ReceiverRequestOrder;
import Business.EcoSystem;
import Business.Enterprise.CommunityFridge;
import Business.Enterprise.QualityAssuranceEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.AdminOrganization;
import Business.Organization.CommunityFridgeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.WorkQueue.CommunityFridgeWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import UserInterface.SystemAdminWorkArea.ManageNetworkJPanel;

/**
 *
 * @author truptiraut
 */
public class ReceiverOptionsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceiverOptionsJPanel
     */
    private Receiver rec;
    private JPanel userProcessContainer;
    private EcoSystem system;
    private ReceiverRequestOrder order;
    private UserAccount userAccount;
    Enterprise e;
    private Network network;
    public ReceiverOptionsJPanel(JPanel userProcessContainer,Receiver customer, EcoSystem system, UserAccount userAccount, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.rec = customer;
        this.userAccount = userAccount;
        this.system = system;
        this.network = network;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AskQA = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        Participate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(234, 200, 156));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AskQA.setBackground(new java.awt.Color(255, 255, 255));
        AskQA.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        AskQA.setText("Ask Questions");
        AskQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AskQAActionPerformed(evt);
            }
        });
        add(AskQA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 280, 80));

        jLabel6.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 80, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Have any Doubts ?");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 11, 692, 36));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        back.setText(" Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 30));

        Participate.setBackground(new java.awt.Color(255, 255, 255));
        Participate.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        Participate.setText("Participate");
        Participate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParticipateActionPerformed(evt);
            }
        });
        add(Participate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 280, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bbb.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -70, 1200, 600));
    }// </editor-fold>//GEN-END:initComponents

    private void AskQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AskQAActionPerformed
        QualityAssuranceApp qa =new QualityAssuranceApp(userProcessContainer, system, network, userAccount);
        userProcessContainer.add("QualityAssuranceApp",qa);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);    
       
    }//GEN-LAST:event_AskQAActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backActionPerformed

    private void ParticipateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParticipateActionPerformed
        // TODO add your handling code here:
        ApplyForVolunteerJPanel panel1 =new ApplyForVolunteerJPanel(userProcessContainer, system, network, userAccount);
        userProcessContainer.add("ApplyForVolunteerJPanel",panel1);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_ParticipateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AskQA;
    private javax.swing.JButton Participate;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    
}
