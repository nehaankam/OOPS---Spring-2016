/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employess;

/**
 *
 * @author Neha Ankam
 */
public class Employee {
    /**
     * declaration of variable firstName
     */
    private String firstName;
    /**
     * declaration of variable lastName
     */
    private String lastName;
    /**
     * declaration of variable employeeID
     */
    private int employeeID;
    /**
     * declaration of variable phoneNumber
     */
    private String phoneNumber;
    /**
     * declaration of variable address
     */
    private String address;
    /**
     * constructor initializing the values
     * @param firstName
     * @param lastName
     * @param employeeID
     * @param phoneNumber
     * @param address 
     */
    public Employee(String firstName, String lastName, int employeeID, String phoneNumber, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.phoneNumber = phoneNumber;
        this.address = address;
        
    }
    /**
     * no arg constructor in which no values are assigned to the variables
     */
    public Employee(){
        
    }
    /**
     * returns the firstName
     * @return firstName
     */
    public String getFirstName(){
        return firstName;
    }
    /**
     * returns the lastName
     * @return lastName
     */
    public String getLastName(){
        return lastName;
    }
    /**
     * returns the employeeID
     * @return employeeID
     */
    public int getEmployeeID(){
        return employeeID;
    }
    /**
     * returns the phoneNumber
     * @return phoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    /**
     * returns the address
     * @return address 
     */
    public String getAddress(){
        return address;
    }
    /**
     * sets the firstName value
     * @param firstName 
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /**
     * sets the lastName value
     * @param lastName 
     */
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    /**
     * sets the employeeID value
     * @param employeeID 
     */
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }
    /**
     * sets the phoneNumber value
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    /**
     * sets the address value
     * @param address 
     */
    public void setAddress(String address){
        this.address = address;
    }
    /**
     * returns the string which contains the variables firstName, lastName, employeeID, phoneNumber and address
     * @return string with variables
     */
    public String toString(){
        return (firstName + " " + lastName + " with employeeID: " + employeeID + ", phone number: " + phoneNumber + " and address: " + address);
    }
}
