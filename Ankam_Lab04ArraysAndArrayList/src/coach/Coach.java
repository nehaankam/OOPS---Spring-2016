/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coach;

/**
 *
 * @author Neha Ankam
 */
public class Coach {
    private String firstName;
    private String lastName;
    private double Salary;
    private static int totalCoach;
    /**
     * this is a parameterized constructor
     * @param firstName
     * @param lastName
     * @param salary 
     */
    public Coach(String firstName, String lastName, double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.Salary=salary;
        totalCoach++;
    }

    /**
     *this is a parameterized constructor with two arguments
     * @param firstName
     * @param lastName
     */
    public Coach(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        Salary = 0;
        totalCoach++;
    }	

    /**
     *no arg constructor
     */
    public Coach(){
        
    }
    /**
     * this is method for get salary
     * @return Salary
     */
    
    double getSalary(){
        return Salary;
    }
    /**
     * this is used to set salary
     * @param salary 
     */
    void setSalary(double salary){
        this.Salary=salary;
    }
    /**
     * this is used  to get total coach number
     * @return totalCoach
     */
    int getTOtalCoach(){
        return totalCoach;
    }
    /**
     * this is used to display attributes
     * @return values 
     */
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + "; Salary: $" + Salary;  
    }
    
    
}
