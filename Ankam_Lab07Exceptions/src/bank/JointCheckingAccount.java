/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Neha Ankam
 */
public class JointCheckingAccount extends CheckingAccount {
    private Person[] persons;
    private int personsCount;
    
    public JointCheckingAccount(int accountNo, double balance, int routingNumber, int noOfPersons){
        super(accountNo,balance,routingNumber);
        this.personsCount = 0;
        persons = new Person[noOfPersons];
       
    }
    
    public void addPerson(Person person) throws IllegalPersonsException{
        if(personsCount<0) 
            throw new IllegalPersonsException("Invalid number of persons");
        persons[personsCount] = person;
        personsCount++;
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
    
}
