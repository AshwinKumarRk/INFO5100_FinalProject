/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Receiver;

import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class ReceiverRequest {
    
 private int reqId;
    private static int counter=1;
    private String status;
    private String recieverName;
    private int receiverId;
    private String  receiverUserName;
    private ArrayList<Products> productList;
    private String feedback;
    
      public ReceiverRequest() {
        reqId = counter;
        ++counter;
        productList=new ArrayList<Products>();
    }

    public ArrayList<Products> getItemsList() {
        return productList;
    }

    public void setItemsList(ArrayList<Products> productList) {
        this.productList = productList;
    }

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

  

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReceiverName() {
        return recieverName;
    }

    public void setReceiverName(String recieverName) {
        this.recieverName = recieverName;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverUserName() {
        return receiverUserName;
    }

    public void setReceiverUserName(String receiverUserName) {
        this.receiverUserName = receiverUserName;
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

