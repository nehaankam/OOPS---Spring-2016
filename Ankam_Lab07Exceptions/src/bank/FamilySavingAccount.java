/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.ArrayList;

/**
 *
 * @author Neha Ankam
 */
public class FamilySavingAccount extends SavingAccount{
    
   private ArrayList<Person> persons;
   private int personsCount;
   
   public FamilySavingAccount(int accountNo, double balance, int routingNumber, int noOfPersons){
       super(accountNo, balance, routingNumber);
       persons = new ArrayList<Person>();
   }
    public void addPerson(Person person) throws IllegalPersonsException{
        if(persons.size()<0)
            throw new IllegalPersonsException("Invalid number of persons");
        persons.add(person);
    }
    
   @Override
    public String toString(){
        return super.toString();
    }
    
}
