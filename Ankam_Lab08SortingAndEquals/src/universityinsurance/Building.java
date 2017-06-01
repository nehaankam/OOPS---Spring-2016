/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universityinsurance;

import java.util.Objects;

/**
 *
 * @author Neha Ankam
 */
public class Building
extends java.lang.Object
implements java.lang.Comparable<Building> {
    
    
    private String buildingAddress;
    private String buildingName;
    private int noOfFloors;
    private java.lang.String managerName;
    private java.lang.String managerSSN;

    public Building(String buildingAddress, String buildingName, int noOfFloors, String managerName, String managerSSN) {
        this.buildingAddress = buildingAddress;
        this.buildingName = buildingName;
        this.noOfFloors = noOfFloors;
        this.managerName = managerName;
        this.managerSSN = managerSSN;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getManagerSSN() {
        return managerSSN;
    }
    
    public boolean checkSSNNumber(java.lang.String managerSSN)
                       throws NonDigitFoundException{
        for(int i=0;i<managerSSN.length();i++){
            char ch = managerSSN.charAt(i);
            int c =ch;
            if(c<48 || c>57){
                throw new NonDigitFoundException("The Manager SSN is invalid");
                //return false;
            }}
            
                return true;
    }
    
    

    @Override
    public int compareTo(Building building) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    return buildingName.compareTo(building.buildingName);
    
    
    }

   

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Building other = (Building) obj;
       
        if (!Objects.equals(this.managerName, other.managerName)) {
            return false;
        }
        return true;
    }
    
    @Override
    public java.lang.String toString(){
        return String.format("%-15s %-15s %2d %-15s %-15s",buildingAddress,buildingName,noOfFloors,managerName,managerSSN);  
    }
    
    
}
