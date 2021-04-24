/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receiver;

import Business.Receiver.Receiver;
import Business.EcoSystem;
import Business.Enterprise.CommunityFridge;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.ReceiverRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryStoreWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ashwin
 */
public class ReceiverWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceiverWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private Receiver receiver;
    Network network;
    private boolean ValidZip = true;
    
     
    public ReceiverWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business,  Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = business;
        
        Name.setEditable(false);
        Address.setEditable(false);
        Pass.setEditable(false);
        City.setEditable(false);
        statecombo.setEditable(false);
        ZipCode.setEditable(false);
        Save.setEnabled(false);
        clearValues();
        
        Name.setText(userAccount.getReceiver().getName());
        Pass.setText(userAccount.getPassword());
        Address.setText(userAccount.getReceiver().getAddress());
        City.setText(userAccount.getReceiver().getCity());
        DefaultComboBoxModel dm=new DefaultComboBoxModel();
        dm.addElement(userAccount.getReceiver().getNetwork());
        statecombo.setModel(dm);
        ZipCode.setText(String.valueOf(userAccount.getReceiver().getZipcode()));
        receiver = userAccount.getReceiver();
        return;
    }
    private void clearValues(){
        PassLabel.setVisible(false);
        ZipLabel.setVisible(false);
       
    }
 
    private boolean passwordPatternCorrect(String val1){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(val1));
        boolean b1=m1.matches();
        return b1;
    }
    private boolean numberPatternCorrect(String val2){
        Pattern p=Pattern.compile("^[0-9]$");
        Matcher m=p.matcher(val2);
        boolean b=m.matches();
        return b;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        participate = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Save = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        statecombo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        ZipCode = new javax.swing.JTextField();
        ZipLabel = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        PassLabel = new javax.swing.JLabel();
        updateBtn1 = new javax.swing.JButton();
        PlaceOrder = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(194, 155, 106));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 30));

        Name.setEditable(false);
        Name.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Name.setEnabled(false);
        Name.setPreferredSize(new java.awt.Dimension(160, 25));
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameKeyReleased(evt);
            }
        });
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        participate.setBackground(new java.awt.Color(255, 255, 255));
        participate.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        participate.setText("participate");
        participate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                participateActionPerformed(evt);
            }
        });
        add(participate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, -1, 51));

        update.setBackground(new java.awt.Color(255, 102, 0));
        update.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 106, 51));

        Save.setBackground(new java.awt.Color(255, 102, 0));
        Save.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, 106, 51));

        jLabel10.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Address:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, 40));

        Address.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Address.setEnabled(false);
        Address.setPreferredSize(new java.awt.Dimension(160, 25));
        Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AddressKeyReleased(evt);
            }
        });
        add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 158, -1));

        jLabel11.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("City:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 120, -1));

        City.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        City.setEnabled(false);
        City.setPreferredSize(new java.awt.Dimension(160, 25));
        City.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CityKeyReleased(evt);
            }
        });
        add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 158, -1));

        jLabel12.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("State:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 110, -1));

        statecombo.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        statecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        statecombo.setEnabled(false);
        statecombo.setPreferredSize(new java.awt.Dimension(160, 25));
        statecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statecomboActionPerformed(evt);
            }
        });
        add(statecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 158, -1));

        jLabel13.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Zip Code:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 90, 20));

        ZipCode.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        ZipCode.setEnabled(false);
        ZipCode.setPreferredSize(new java.awt.Dimension(160, 25));
        ZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ZipCodeKeyReleased(evt);
            }
        });
        add(ZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 158, -1));

        ZipLabel.setFont(new java.awt.Font("PT Serif Caption", 1, 12)); // NOI18N
        ZipLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ZipLabel.setText("Only Numbers Allowed");
        add(ZipLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 160, 20));

        Pass.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Pass.setEnabled(false);
        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassKeyReleased(evt);
            }
        });
        add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 158, 25));

        jLabel8.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Password:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 107, 20));

        PassLabel.setFont(new java.awt.Font("PT Serif Caption", 1, 12)); // NOI18N
        PassLabel.setText("Trgs@1");
        add(PassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 160, 20));

        updateBtn1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        updateBtn1.setText("Update");
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });
        add(updateBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 106, 51));

        PlaceOrder.setBackground(new java.awt.Color(255, 102, 0));
        PlaceOrder.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });
        add(PlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 380, 130, 60));

        jButton1.setText("Community Fridge");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 230, 130, 60));

        jLabel1.setText("Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, -240, 1470, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void participateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_participateActionPerformed
        
        ReceiverOptionsJPanel receiverOptionsJPanel=new ReceiverOptionsJPanel(userProcessContainer,receiver,system,userAccount,enterprise, network);
        userProcessContainer.add("ReceiverOptionsJPanel",receiverOptionsJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_participateActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Name.setEditable(true);
        Name.setEnabled(true);
        Address.setEditable(true);
        Address.setEnabled(true);
        Pass.setEditable(true);
        Pass.setEnabled(true);
        City.setEditable(true);
        City.setEnabled(true);
        statecombo.setEditable(true);
        ZipCode.setEditable(true);
        ZipCode.setEnabled(true);
        Save.setEnabled(true);
        update.setEnabled(false);
    }//GEN-LAST:event_updateActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        Network network = (Network) statecombo.getSelectedItem();
        if(Name.getText().isEmpty()  || Address.getText().isEmpty() || City.getText().isEmpty() || ZipCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Field(s) cannot be Empty!","Error",JOptionPane.ERROR_MESSAGE);
             return;         
          
          }else {
              String name = Name.getText();
              String password = Pass.getText();
              String add = Address.getText();
              String city = City.getText();
              String address = Address.getText();
              String zipcode = ZipCode.getText();
            
                system.getReceiverDirectory().updateReceiver(receiver, name,  address, city, zipcode);
                system.getUserAccountDirectory().updateUserAccount(userAccount, password);
                JOptionPane.showMessageDialog(null, "Updated successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                
        Name.setEditable(false);
        Name.setEnabled(false);
        Address.setEditable(false);
        Address.setEnabled(false);
        Pass.setEditable(false);
        Pass.setEnabled(false);
        City.setEditable(false);
        City.setEnabled(false);
        statecombo.setEditable(false);
        statecombo.setEnabled(false);
        ZipCode.setEditable(false);
        ZipCode.setEnabled(false);
        Save.setEnabled(false);
        update.setEnabled(true);
        clearValues();
        }
       
    }//GEN-LAST:event_SaveActionPerformed

    private void NameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyReleased
        // TODO add your handling code here:  
    }//GEN-LAST:event_NameKeyReleased

    private void AddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressKeyReleased

    private void CityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CityKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CityKeyReleased

    private void ZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ZipCodeKeyReleased
        // TODO add your handling code here:
        int zip=0;
        try{
            zip = Integer.parseInt(ZipCode.getText());
            ValidZip = true;
             ZipLabel.setVisible(false);
             return;
        }catch(NumberFormatException e){
            if(!ZipCode.getText().isEmpty()){
             ValidZip = false;
             ZipLabel.setVisible(true);
             return;
            }else {
             ValidZip = false;
             ZipLabel.setVisible(false);
             return;
            }
        }
    }//GEN-LAST:event_ZipCodeKeyReleased

    private void PassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyReleased
        // TODO add your handling code here:
        if(!passwordPatternCorrect(Pass.getText()) && !(Pass.getText().isEmpty())){
          
            PassLabel.setVisible(true);
        }else{
            PassLabel.setVisible(false);
           
        }
    }//GEN-LAST:event_PassKeyReleased

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBtn1ActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        // TODO add your handling code here:
        PlaceOrderJPanel placeOrder =new PlaceOrderJPanel(userProcessContainer,receiver,system,userAccount,enterprise, network);
        userProcessContainer.add("PlaceOrderJPanel",placeOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void statecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statecomboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CommunityFridgeJPanel placeOrder =new CommunityFridgeJPanel(userProcessContainer,receiver,system,userAccount,enterprise, network);
        userProcessContainer.add("CommunityFridgeJPanel",placeOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField City;
    private javax.swing.JTextField Name;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton Save;
    private javax.swing.JTextField ZipCode;
    private javax.swing.JLabel ZipLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton participate;
    private javax.swing.JComboBox statecombo;
    private javax.swing.JButton update;
    private javax.swing.JButton updateBtn1;
    // End of variables declaration//GEN-END:variables
}
