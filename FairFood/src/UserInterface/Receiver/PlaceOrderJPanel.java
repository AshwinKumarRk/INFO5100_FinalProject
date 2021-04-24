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
import Business.Enterprise.Products;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryStoreWorkRequest;
import Business.Enterprise.GroceryStoreEnterprise;
import Business.Network.Network;
import Business.Organization.CommunityFridgeOrganization;
import Business.Organization.Organization;
import javax.swing.JOptionPane;
import Business.Organization.GroceryStoreOrganization;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visha
 */
public class PlaceOrderJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount acc;
    private EcoSystem systems;
    private String total;
    private int productsCount = 0;
       private int itemCount = 0;
    private int cartCount=0;
    private Enterprise enterprise;
    private ArrayList<Products> recList;
    private Receiver customer;
    private Network network;
    

    /**
     * Creates new form PlaceOrderJPanel
     */
  

    PlaceOrderJPanel(JPanel userProcessContainer, Receiver customer, EcoSystem system, UserAccount account, Enterprise enterprise, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.acc = account;
        this.customer = customer;
        this.systems=system;
        this.enterprise=enterprise;
        this.network = network;
        this.recList = new ArrayList<>();
        populateProducts();
    }
    
    
      public String populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) CartItems1.getModel();
        dtm.setRowCount(0);
        int totalBill=0;
        for(int i=itemCount;i<recList.size();i++) {
            Object row[] = new Object[2];
            
            row[0] = recList.get(i);
           
            dtm.addRow(row);
        }
        
        
    return String.valueOf(totalBill);
     }


     
     
    private void populateRequestTable(String name) 
     {
//        DefaultTableModel dtm = (DefaultTableModel) ProductsTable.getModel();
//        dtm.setRowCount(0);
//        for(Enterprise e:systems.getEnterpriseDirectory().getEnterpriseList())
//        {
//            if(name == String.valueOf(e))
//            {
//                 for(Products item:e.getItemsList())
//                    {
//                         Object row[] = new Object[2];
//                         row[0] = item;
//                         dtm.addRow(row);
//                     }
//            }
////      
//         }
    }
    
private void populateProducts()
{
    DefaultTableModel dtm = (DefaultTableModel) ProductsTable.getModel();
        dtm.setRowCount(0);
        for(Network net : systems.getNetworkList()){ 
            for(Enterprise e: net.getEnterpriseDirectory().getEnterpriseList()){
                 for(Products i: e.getItemsList()) {
                     System.out.println(i.getItemName());
                    Object row[] = new Object[2];
                    row[0] = i;
                    row[1] = i.getItemName();
                    dtm.addRow(row);
                 }
            }
        }
//         DefaultTableModel dtm1 = (DefaultTableModel) ProductsTable.getModel();
//       dtm1.setRowCount(0);
//        for(Network net : systems.getNetworkList()){ 
//            for(Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()){
//                for(Organization o: e.getOrganizationDirectory().getOrganizationList()){
//                    for(WorkRequest request : o.getWorkQueue().getWorkRequestList()){
//                           if(request.getReceiver() != null && request.getReceiver().getRole().toString().equals("Business.Role.DeliveryManRole")){
//                               if(request.getStatus().toLowerCase().equals("delivered")){
//                                   int ord = request.getRequestID();
//                                   Object row[] = new Object[3];
//                                        row[0] = ord;
//                                       
//                                        row[1] = request;
//                                       
//                                        dtm1.addRow(row);
//                               }
//                           }
//                    }
//                }
//            }
//        
//       
//              
//      
//   }
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
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Cart = new javax.swing.JButton();
        deleteFcart = new javax.swing.JButton();
        PlaceOrder = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        proTable = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        CartItems1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        notes = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(246, 236, 212));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place Your Order");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 0, 1127, 37));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 30));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Products");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 452, -1));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 99, 40));

        Cart.setBackground(new java.awt.Color(255, 255, 255));
        Cart.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        Cart.setText("Add To Cart");
        Cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartActionPerformed(evt);
            }
        });
        add(Cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        deleteFcart.setBackground(new java.awt.Color(255, 255, 255));
        deleteFcart.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        deleteFcart.setText("Delete From Cart");
        deleteFcart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFcartActionPerformed(evt);
            }
        });
        add(deleteFcart, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, -1, 49));

        PlaceOrder.setBackground(new java.awt.Color(255, 255, 255));
        PlaceOrder.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        PlaceOrder.setText("Place Order");
        PlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOrderActionPerformed(evt);
            }
        });
        add(PlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, 125, 49));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Cart Items");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 450, -1));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Products", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        proTable.setViewportView(ProductsTable);

        add(proTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 450, 150));

        CartItems1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane4.setViewportView(CartItems1);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 410, 160));

        notes.setColumns(20);
        notes.setRows(5);
        jScrollPane3.setViewportView(notes);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/placeorder.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 120, 1200, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backActionPerformed

    private void PlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOrderActionPerformed
        // TODO add your handling code here:
        if(CartItems1.getRowCount() > 0 && cartCount > 0){
            GroceryStoreWorkRequest request = new GroceryStoreWorkRequest();
            request.setRecList(recList);
            request.setSender(acc);
            request.setStatus("Order Placed");
           
            request.setMessage(notes.getText());
            Organization org = null;
        for(Network net: systems.getNetworkList()){
            for(Enterprise enter : net.getEnterpriseDirectory().getEnterpriseList()){
                if(enter instanceof GroceryStoreEnterprise){
                    for (Organization organization : enter.getOrganizationDirectory().getOrganizationList()){
                        if (organization instanceof GroceryStoreOrganization){
                            org = organization;
                            break;
                        }
                    }
                }
            } 
        }
        
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            acc.getWorkQueue().getWorkRequestList().add(request);
            JOptionPane.showMessageDialog(null, "Order placed successfully","Success",JOptionPane.INFORMATION_MESSAGE);
        }
            
        }else{
            JOptionPane.showMessageDialog(null, " Add products to the cart and place the order.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            return;
       }
        
    }//GEN-LAST:event_PlaceOrderActionPerformed

    private void CartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartActionPerformed
        // TODO add your handling code here:
        int selectedRow = ProductsTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            Products i = (Products)ProductsTable.getValueAt(selectedRow,0);
            cartCount++;
           recList.add(i);
            this.total=populateTable();
            JOptionPane.showMessageDialog(null, "Added to cart","Success",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_CartActionPerformed

    private void deleteFcartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFcartActionPerformed
        // TODO add your handling code here:
          int selectedRow = CartItems1.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
        Products i = (Products)CartItems1.getValueAt(selectedRow,0 );        
      recList.remove(i);
      this.total=populateTable();
         
        }
    }//GEN-LAST:event_deleteFcartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cart;
    private javax.swing.JTable CartItems1;
    private javax.swing.JButton PlaceOrder;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JButton back;
    private javax.swing.JButton deleteFcart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea notes;
    private javax.swing.JScrollPane proTable;
    // End of variables declaration//GEN-END:variables

   

   
}
