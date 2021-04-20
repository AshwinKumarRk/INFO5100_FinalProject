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
    private String address;
    private String city;
    private String state;
     private String email;
       private Network network;
    private String enterprise;

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
    private int min = 1000;
    private int max = 9999;
    private static int count = 0;
    private int id;
    private String[] catersTo;
    private String location;
    private int deliveryTime;

 
    
    public Receiver() {
        Random r = new Random();
        count = r.nextInt(max-min) + min;
        id = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Receiver.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getCatersTo() {
        return catersTo;
    }

    public void setCatersTo(String[] catersTo) {
        this.catersTo = catersTo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

  }
