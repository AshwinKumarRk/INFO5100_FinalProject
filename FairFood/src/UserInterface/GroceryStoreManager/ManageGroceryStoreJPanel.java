

package UserInterface.GroceryStoreManager;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  visha
 */
public class ManageGroceryStoreJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private Organization organization;
    private UserAccount acc;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem business;
  
    
  

    public ManageGroceryStoreJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.business=business;
        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        stock = new javax.swing.JButton();
        orders = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Grocery Store");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 220, 1200, -1));

        stock.setBackground(new java.awt.Color(255, 255, 255));
        stock.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        stock.setText("Check Stock");
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 170, 90));

        orders.setBackground(new java.awt.Color(255, 255, 255));
        orders.setFont(new java.awt.Font("PT Serif Caption", 0, 18)); // NOI18N
        orders.setText("Manage Orders");
        orders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersActionPerformed(evt);
            }
        });
        add(orders, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 170, 90));

        jLabel2.setBackground(new java.awt.Color(243, 223, 198));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/beige.jpeg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-370, 0, 1570, 750));
    }// </editor-fold>//GEN-END:initComponents

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
       ManageStockJPanel panel = new ManageStockJPanel(userProcessContainer,organization,business,enterprise,account);
        userProcessContainer.add("ManageStockJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // System.out.println("Working");
    }//GEN-LAST:event_stockActionPerformed

    private void ordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersActionPerformed
        ManageOrdersJPanel panel = new ManageOrdersJPanel(userProcessContainer,organization, business,enterprise,account);
        userProcessContainer.add("ManageOrdersJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ordersActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton orders;
    private javax.swing.JButton stock;
    // End of variables declaration//GEN-END:variables
    
}
