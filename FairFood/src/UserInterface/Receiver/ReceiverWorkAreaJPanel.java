/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receiver;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.Receiver.Receiver;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author visha
 */
public class ReceiverWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
     private EcoSystem system;
    private UserAccount userAccount;
    private Organisation organisation;
    private Enterprise enterprise;
    private Receiver receiver;
     Network network;
   

    /**
     * Creates new form ReceiverWorkAreaJPanel
     */
     public ReceiverWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organisation organisation, UserAccount account, EcoSystem system,  Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organisation = organisation;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.network = network;
        this.system = system;
        
        NameText.setEditable(false);
        AddText.setEditable(false);
          CityText.setEditable(false);
         
          LocText.setEditable(false);
          PassTxt.setEditable(false);
           NtwComboBox.setEditable(false);
      
       
        clearFields();
        
                    NameText.setText(userAccount.getReceiver().getName());
                    
                  // LocText.setText(userAccount.getReceiver().getLocation());
                    PassTxt.setText(userAccount.getPassword());
                    AddText.setText(userAccount.getReceiver().getAddress());
                    CityText.setText(userAccount.getReceiver().getCity());
                    DefaultComboBoxModel dm=new DefaultComboBoxModel();
                    dm.addElement(userAccount.getReceiver().getNetwork());
                    NtwComboBox.setModel(dm);
                

                      
                    receiver = userAccount.getReceiver();
                    return;
    }
     
    private void clearFields(){
    // Labels initialzed to false
       
        PassLbl.setVisible(false);
        
    }
    private boolean passwordPatternCorrect(String val){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(val));
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        AddText = new javax.swing.JTextField();
        CityText = new javax.swing.JTextField();
        LocText = new javax.swing.JTextField();
        PassTxt = new javax.swing.JTextField();
        PassLbl = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PlaceOrder = new javax.swing.JButton();
        NtwComboBox = new javax.swing.JComboBox<>();

        jLabel1.setText("Name");

        jLabel2.setText("Address");

        jLabel3.setText("City");

        jLabel4.setText("State");

        jLabel5.setText("Location");

        jLabel6.setText("Password");

        NameText.setText("jTextField1");

        AddText.setText("jTextField2");

        CityText.setText("jTextField3");

        LocText.setText("jTextField5");

        PassTxt.setText("jTextField6");
        PassTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassTxtKeyReleased(evt);
            }
        });

        PassLbl.setText("pass@1");

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jButton2.setText("Ask Questions");

        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });

        NtwComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Save)
                        .addGap(108, 108, 108))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update)
                        .addGap(97, 97, 97))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(PassLbl))
                            .addComponent(NtwComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PlaceOrder, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Save)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AddText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Update)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jButton2))
                        .addGap(39, 39, 39)
                        .addComponent(PlaceOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(NtwComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(LocText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(PassTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassLbl))))
                .addContainerGap(233, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
         Network network = (Network) NtwComboBox.getSelectedItem();
         
        if(NameText.getText().isEmpty()  || AddText.getText().isEmpty() || CityText.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Field(s) cannot be Empty!","Error",JOptionPane.ERROR_MESSAGE);
             return;
          }
//        else if(NameText.getText().!isEmpty()  || AddText.getText().!isEmpty() || CityText.getText().!isEmpty()){
//          
//          
//            
//            String address = AddText.getText();
//    
//                system.getReceiverDirectory().updateReceiver(receiver, name, address, city);
//                system.getUserAccountDirectory().updateUserAccount(userAccount, password);
//                JOptionPane.showMessageDialog(null, "Customer has been updated successfully","Success",JOptionPane.INFORMATION_MESSAGE);
//                
//         NameText.setEditable(false);
//         NameText.setEnabled(false);
//       
//        AddText.setEditable(false);
//        AddText.setEnabled(false);
//        
//         PassTxt.setEditable(false);
//         PassTxt.setEnabled(false);
//         
//        CityText.setEditable(false);
//        CityText.setEnabled(false);
//        
//        NtwComboBox.setEditable(false);
//        NtwComboBox.setEnabled(false);
//        
//        
//        Save.setEnabled(false);
//        Update.setEnabled(true);
//        clearFields();
//        }
        else {
           JOptionPane.showMessageDialog(null, "Please enter all the required fields correctly!","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        
                                          

    }//GEN-LAST:event_SaveActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
         NameText.setEditable(true);
        NameText.setEnabled(true);
        
       
        AddText.setEditable(true);
        AddText.setEnabled(true);
        
         PassTxt.setEditable(true);
         PassTxt.setEnabled(true);
        
        CityText.setEditable(true);
        CityText.setEnabled(true);
        
        NtwComboBox.setEditable(true);
      
       
        Save.setEnabled(true);
        Update.setEnabled(false);
    }//GEN-LAST:event_UpdateActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        // TODO add your handling code here:
        FoodOrderJPanel placeOrder =new FoodOrderJPanel(userProcessContainer,receiver,system,userAccount,enterprise, network);
        userProcessContainer.add("FoodOrderJPanel",placeOrder);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                                                
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void PassTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassTxtKeyReleased
        // TODO add your handling code here:
         if(!passwordPatternCorrect(PassTxt.getText()) && !(PassTxt.getText().isEmpty())){
            
            PassLbl.setVisible(true);
        }else{
            PassLbl.setVisible(false);
           
        }
    }//GEN-LAST:event_PassTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddText;
    private javax.swing.JTextField CityText;
    private javax.swing.JTextField LocText;
    private javax.swing.JTextField NameText;
    private javax.swing.JComboBox<String> NtwComboBox;
    private javax.swing.JLabel PassLbl;
    private javax.swing.JTextField PassTxt;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JButton Save;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
