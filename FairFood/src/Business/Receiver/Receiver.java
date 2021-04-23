/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Receiver;

import Business.Network.Network;
import java.util.Random;

/**
 *
 * @author truptiraut
 */
public class Receiver {
    
    private String name;
    private int id;
    private static int count = 0;
    private Network network;
    private String zipcode;
    private String enterprise;
    private String email;
    private String address;
    private String city;
    private int min = 1000;
    private int max = 9999;

    public Receiver() {
        Random r = new Random();
        count = r.nextInt(max-min) + min;
        id = count;
    }

    public int getId() {
        return id;
    }

    
    public Network getNetwork() {
        return network;
    }

   
    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }
    
     public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
   
    
    @Override
    public String toString() {
        return name;
    }
    
}
