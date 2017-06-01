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
public class IndividualSavingAccount extends SavingAccount{
    private Person person;
    
    
    
    
    public IndividualSavingAccount(int accountNo, double balance, int routingNumber,java.lang.String fName, java.lang.String lName, int age)  {
        super(accountNo, balance, routingNumber);
        person = new Person(age,fName,lName);
    }
    
    @Override
    public String toString(){
        return "First name= "+person.getfName()+", Last name= "+person.getlName()+", age= "+person.getAge()+" "+super.toString();
      //  return super.toString();
    }
 
}
