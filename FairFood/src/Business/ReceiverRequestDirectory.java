/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class ReceiverRequestDirectory {
     private ArrayList<ReceiverRequestOrder> cusReqOrderList;

    public ReceiverRequestDirectory() {
        cusReqOrderList = new ArrayList();
    }

    public ArrayList<ReceiverRequestOrder> getCusReqOrderList() {
        return cusReqOrderList;
    }

    public void setCusReqOrderList(ArrayList<ReceiverRequestOrder> cusReqOrderList) {
        this.cusReqOrderList = cusReqOrderList;
    } 

     public ReceiverRequestOrder createOrder(){
        ReceiverRequestOrder order = new ReceiverRequestOrder(); 
        cusReqOrderList.add(order);
        return order;
    }
     
      public void deleteOrder(ReceiverRequestOrder order){
        cusReqOrderList.remove(order); 
    }
      /*public ReceiverRequestOrder searchOrder(String enterpriseName){
        for (ReceiverRequestOrder order: cusReqOrderList) {
            if (order.getRestaurantName().equalsIgnoreCase(enterpriseName)) {
                return order;
            }
        }
        return null;
      }
      public Order updateOrder(Order order, String name, String address){
             order.setRestaurantName(name);
             return order;
         }*/
}
