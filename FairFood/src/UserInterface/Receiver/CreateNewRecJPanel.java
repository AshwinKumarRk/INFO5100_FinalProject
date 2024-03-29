/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receiver;

import Business.Receiver.Receiver;
import UserInterface.SystemAdminWorkArea.*;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import Business.Organization.Organization;
import Business.Role.ReceiverRole;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;



/**
 *
 * @author truptiraut
 */
public class CreateNewRecJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewRecJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    Organization organization;
    private Receiver rec;
     
     private boolean ValidEmailID;
     private boolean ValidZip;
   
   
    public CreateNewRecJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.organization = organization;
        clearAll();
        populateNetworkComboBox();
        
    }
    private void clearAll(){
        
        EmailLabel.setVisible(false);
        EmailAldExist.setVisible(false);
        confirmPasswordLbl.setVisible(false);
        passwordLbl.setVisible(false);
        Zip.setVisible(false);
     }
    
private void populateNetworkComboBox() {
        NtwComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            NtwComboBox.addItem(network);
        }

    }
    
    private boolean usernamePatternCorrect(String val){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(val);
        boolean b=m.matches();
        return b;
    }
   
  
    
    private boolean passwordPatternCorrect(String val1){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(val1));
        boolean b1=m1.matches();
        return b1;
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameF = new javax.swing.JTextField();
        PassConf = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        Pass = new javax.swing.JPasswordField();
        EmailF = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        City = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        NtwComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        ZipCode = new javax.swing.JTextField();
        confirmPasswordLbl = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        Zip = new javax.swing.JLabel();
        EmailAldExist = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 220, 206));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NameF.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        NameF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameFKeyReleased(evt);
            }
        });
        add(NameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 30));

        PassConf.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        PassConf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassConfKeyReleased(evt);
            }
        });
        add(PassConf, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 30));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email ID:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 107, 30));

        Pass.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassKeyReleased(evt);
            }
        });
        add(Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, 30));

        EmailF.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        EmailF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFActionPerformed(evt);
            }
        });
        EmailF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmailFKeyReleased(evt);
            }
        });
        add(EmailF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, 30));

        submitBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 100, 50));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 107, 30));

        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER REGISTRATION");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 10, 1210, 50));

        resetBtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 100, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 107, 30));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Confirm Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, 30));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("City:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 90, 30));

        City.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        City.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CityKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CityKeyReleased(evt);
            }
        });
        add(City, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 190, 30));

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("State:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 80, 30));

        NtwComboBox.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        NtwComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NtwComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NtwComboBoxActionPerformed(evt);
            }
        });
        add(NtwComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 190, 30));

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Zip Code:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 110, 30));

        ZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ZipCodeKeyReleased(evt);
            }
        });
        add(ZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 190, 30));

        confirmPasswordLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        confirmPasswordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmPasswordLbl.setText("Password does not Match");
        add(confirmPasswordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 160, 20));

        EmailLabel.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        EmailLabel.setText(" 'aa@aa.com'");
        add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, 20));

        passwordLbl.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        passwordLbl.setText("Trjd@1");
        add(passwordLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 160, 20));

        Zip.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        Zip.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Zip.setText("Numbers Only");
        add(Zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 160, 20));

        EmailAldExist.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        EmailAldExist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EmailAldExist.setText("email already exists");
        add(EmailAldExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 160, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/userre.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 1190, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        clearValues();
        clearAll();
        // TODO add your handling code here:
    }//GEN-LAST:event_resetBtnActionPerformed
        private void clearValues(){
                NameF.setText("");
                EmailF.setText("");
                Pass.setText("");
                PassConf.setText("");
                City.setText("");
                try{
                NtwComboBox.setSelectedIndex(0);
                }catch (Exception e){
                    
                }
                ZipCode.setText("");
                
        }
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        Network network = (Network) NtwComboBox.getSelectedItem();
         if(NameF.getText().isEmpty() || EmailF.getText().isEmpty() || City.getText().isEmpty() ||  ZipCode.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Fields cannot be Empty!","Error",JOptionPane.ERROR_MESSAGE);
             return;
         
          
          }else if( ValidEmailID){
            String name = NameF.getText();
            String password = Pass.getText();
            String email = EmailF.getText();
            rec = new Receiver();
            rec.setName(name);
            rec.setEmail(email);
            rec.setZipcode(ZipCode.getText());
            rec.setNetwork(network);
            system.getReceiverDirectory().createReceiver(rec);
            system.getUserAccountDirectory().createReceiverAccount(email, password,rec, new ReceiverRole());
            JOptionPane.showMessageDialog(null, "Receiver is added successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            clearValues();
                
        }else {
           JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtnActionPerformed

    private void PassConfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassConfKeyReleased
        // TODO add your handling code here:
        if(PassConf.getText().equals(Pass.getText()) && !PassConf.getText().isEmpty()){
            
            confirmPasswordLbl.setVisible(false);
        }else if(PassConf.getText().isEmpty()){
            confirmPasswordLbl.setVisible(false);
            
        }else{
            confirmPasswordLbl.setVisible(true);
         
        }
    }//GEN-LAST:event_PassConfKeyReleased

    private void NameFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameFKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_NameFKeyReleased

    private void EmailFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailFKeyReleased
        // TODO add your handling code here:
        if (!usernamePatternCorrect(EmailF.getText()) && !(EmailF.getText().isEmpty()) && system.getReceiverDirectory().checkIfUsernameIsUnique(EmailF.getText())){
              EmailLabel.setVisible(true);
              EmailAldExist.setVisible(false);
             
              ValidEmailID =false;
        }else if(EmailF.getText().isEmpty()){
            EmailLabel.setVisible(false);
            EmailAldExist.setVisible(false);
            ValidEmailID =false;
           
        }else if(!system.getReceiverDirectory().checkIfUsernameIsUnique(EmailF.getText())){
            EmailAldExist.setVisible(true);
           
            ValidEmailID =false;
        }else{
         EmailLabel.setVisible(false);
         EmailAldExist.setVisible(false);
         ValidEmailID =true;
        }
    }//GEN-LAST:event_EmailFKeyReleased

    private void PassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyReleased
        // TODO add your handling code here:
        if(!passwordPatternCorrect(Pass.getText()) && !(Pass.getText().isEmpty())){
          
            passwordLbl.setVisible(true);
        }else if(Pass.getText().isEmpty()){
            passwordLbl.setVisible(false);
            
        }else{
            passwordLbl.setVisible(false);
          
        }
    }//GEN-LAST:event_PassKeyReleased

    private void CityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CityKeyReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_CityKeyReleased

    private void ZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ZipCodeKeyReleased
        // TODO add your handling code here:
        int zip=0;
        try{
            zip = Integer.parseInt(ZipCode.getText());
            if(zip == 0){
                Zip.setVisible(false);
               
                ValidZip = false;
            }
            ValidZip = true;
            
             Zip.setVisible(false);
             return;
        }catch(NumberFormatException e){
            if(!ZipCode.getText().isEmpty()){
             ValidZip = false;
            
             Zip.setVisible(true);
             return;
            }else {
             ValidZip = false;
             Zip.setVisible(false);
             
             return;
            }
        }
    }//GEN-LAST:event_ZipCodeKeyReleased

    private void CityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CityKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_CityKeyPressed

    private void EmailFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFActionPerformed

    private void NtwComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NtwComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NtwComboBoxActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField City;
    private javax.swing.JLabel EmailAldExist;
    private javax.swing.JTextField EmailF;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField NameF;
    private javax.swing.JComboBox NtwComboBox;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JPasswordField PassConf;
    private javax.swing.JLabel Zip;
    private javax.swing.JTextField ZipCode;
    private javax.swing.JLabel confirmPasswordLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
