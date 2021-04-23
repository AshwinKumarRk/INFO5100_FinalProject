/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Receiver;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class ReceiverDirectory {
    
    private ArrayList<Receiver> recList;

    public ReceiverDirectory() {
        recList = new ArrayList();
    }

    public ArrayList<Receiver> getRecList() {
        return recList;
    }
    
    public Receiver createReceiver(Receiver c){
        recList.add(c);
        return c;
    }
    
    public void removeReceiver(Receiver r){
        recList.remove(r);
    }
    
    public boolean checkIfUsernameIsUnique(String email){
        for (Receiver e : recList){
            if (e.getEmail().equals(email))
                return false;
        }
        return true;
    }
       public Receiver updateReceiver(Receiver rec, String name , String address, String city, String zipcode){
        rec.setName(name);
        rec.setAddress(address);
        rec.setCity(city);
        rec.setZipcode(zipcode);
       
        
        return rec;
    } 
    
}
