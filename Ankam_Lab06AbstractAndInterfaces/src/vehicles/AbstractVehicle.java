/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import java.util.ArrayList;
import java.util.List;

/**
 *abstract class with one abstract method
 * @author Neha Ankam
 */
public abstract class AbstractVehicle {
    private String model;
    private String engine;
    private String transmission;
    private String body;
    private int doors;
    private double initialPrice;
    List<String> accessories;
    /**
     * a six argument constructor
     * @param model
     * @param engine
     * @param transmission
     * @param body
     * @param doors
     * @param initialPrice 
     */
    public AbstractVehicle(String model, String engine, String transmission, String body, int doors, double initialPrice) {
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.body = body;
        this.doors = doors;
        this.initialPrice = initialPrice;
        this.accessories = new ArrayList<String>();
    }
    /**
     * no arg constructor
     */
    public AbstractVehicle() {
    }
    /**
     * adds accessories to the arraylist
     * @param items
     * @return List of type string
     */
    public List<String> addAccessories(String items){
        
       
        String[] vehicleitems = items.split(","); 
       
        for(String s:vehicleitems){
            accessories.add(s);
        }

        return accessories;
    }
    /**
     * returns model string
     * @return model
     */
    public String getModel() {
        return model;
    }
    /**
     * returns engine string
     * @return engine
     */
    public String getEngine() {
        return engine;
    }
    /**
     * returns transmission string
     * @return transmission
     */
    public String getTransmission() {
        return transmission;
    }
    /**
     * returns body string
     * @return body
     */
    public String getBody() {
        return body;
    }
    /**
     * returns number of doors integer value
     * @return doors
     */
    public int getDoors() {
        return doors;
    }
    /**
     * returns initial price value
     * @return initial price
     */
    public double getInitialPrice() {
        return initialPrice;
    }

    public List<String> getAccessories() {
        return accessories;
    }
    /**
     * returns string in given format
     * @return string
     */
    @Override
    public String toString(){
        return ("Model: "+model+"\nEngine: "+engine+"\nBody: "+body+"\nDoors: "+doors+"\nTransmission: "+transmission+"\nInitial Price: $"+initialPrice);
    }
    public abstract double calculateCost(List<String> accessory);
}
