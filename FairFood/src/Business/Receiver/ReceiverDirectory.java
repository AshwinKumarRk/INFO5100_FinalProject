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
public class ReceiverDirectory {
    
 private ArrayList<Receiver> receiverList;

    public ReceiverDirectory() {
        receiverList = new ArrayList();
    }

    public ArrayList<Receiver> getReceiverList() {
        return receiverList;
    }
    
    public Receiver createReceiver(Receiver receiver){
        
        receiverList.add(receiver);
        return receiver;
    }
    
    public void removeReceiver(Receiver c){
        receiverList.remove(c);
    }
    
    public boolean checkIfUsernameIsUnique(String email){
        for (Receiver e : receiverList){
            if (e.getEmail().equals(email))
                return false;
        }
        return true;
    }
       public Receiver updateReceiver(Receiver rec, String name, String address, String city, String state, String location, int deliveryTime){
        rec.setName(name);
        rec.setAddress(address);
        rec.setCity(city);
        rec.setState(state);
        rec.setLocation(location);
        
        return rec;
    } 
    
}

