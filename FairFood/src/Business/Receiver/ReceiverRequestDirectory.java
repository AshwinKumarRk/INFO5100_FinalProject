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
public class ReceiverRequestDirectory {
    
private ArrayList<ReceiverRequest> ReqList;

    public ReceiverRequestDirectory() {
        ReqList = new ArrayList();
    }

    public ArrayList<ReceiverRequest> getReqOrderList() {
        return ReqList;
    }

    public void setReqOrderList(ArrayList<ReceiverRequest> ReqList) {
        this.ReqList = ReqList;
    } 

     public ReceiverRequest createOrder(){
        ReceiverRequest order = new ReceiverRequest(); 
        ReqList.add(order);
        return order;
    }
     
      public void deleteOrder(ReceiverRequest order){
        ReqList.remove(order); 
    }
     
     
}


