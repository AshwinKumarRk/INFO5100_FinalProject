/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

//import Business.Enterprise.Products;
import Business.Enterprise.Products;
import static java.lang.Integer.toString;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class ReceiverRequestOrder {
    private int reqId;
    private static int counter=1;
    private String status;
    private String customerName;
    private int customerId;
    private String goal;
    private String  customerUserName;
    private ArrayList<Products> itemsList;
    private String feedback;
    
      public ReceiverRequestOrder() {
        reqId = counter;
        ++counter;
        itemsList=new ArrayList<Products>();
    }

    public ArrayList<Products> getItemsList() {
        return itemsList;
    }

    public void setItemsList(ArrayList<Products> itemsList) {
        this.itemsList = itemsList;
    }

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUserName() {
        return customerUserName;
    }

    public void setCustomerUserName(String customerUserName) {
        this.customerUserName = customerUserName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return Integer.toString(this.reqId);
    }
}
