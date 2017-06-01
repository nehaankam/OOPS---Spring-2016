/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicles;

import java.util.List;

/**
 * concrete class which extends AbstractVehicle class and implements VehicleFactory interface
 * @author Neha Ankam
 */
public class Lincoln extends AbstractVehicle implements VehicleFactory{
    
    private static final double MILEAGE_FACTOR = 0.82;
    /**
     * a six argument constructor
     * @param model
     * @param engine
     * @param transmission
     * @param body
     * @param doors
     * @param initialPrice 
     */
    Lincoln(String model,String engine,String transmission,String body,int doors,double initialPrice){
        super(model,engine,transmission,body,doors,initialPrice);
    }
    /**
     * no arg constructor
     */
    Lincoln(){}
    /**
     * calculates the total cost
     * @param accessory
     * @return total cost
     */
    @Override
    public double calculateCost(List<String> accessory) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     double accessoryPrice = 0.0;
     for(String s:accessory){
         if(s.equals("Remote Access"))
             accessoryPrice+=350;
         if(s.equals("Interior Light Kit"))
             accessoryPrice+=400;
         if(s.equals("Graphics Kit"))
             accessoryPrice+=699;
         if(s.equals("Leather Seats"))
             accessoryPrice+=710;
         if(s.equals("Ash Cup"))
             accessoryPrice+=199;
         if(s.equals("Cargo Organizer"))
             accessoryPrice+=172;
     }
       // System.out.println(accessoryPrice);
     return accessoryPrice + getInitialPrice();
    }
    /**
     * calculates actual mileage
     * @return actual mileage
     */
    @Override
    public double calculateActualMileage() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      return STANDARD_MILEAGE*MILEAGE_FACTOR;
    }
    /**
     * returns the string in given format
     * @return string
     */
    @Override
    public String toString(){    
        String accessories = "";
        for(String s : getAccessories()){
            accessories+=s+" ";
        }
        accessories = accessories.trim();
        return super.toString();
    }
   
    
}
