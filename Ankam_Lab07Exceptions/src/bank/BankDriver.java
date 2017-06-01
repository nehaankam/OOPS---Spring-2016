/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Neha Ankam
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IllegalPersonsException {
        
        Scanner sc = new Scanner(new File("Account.txt"));
        //1. Declare and initialize a scanner object "sc" to read from the file "Account.txt"
//2. while Account.txt has more data(While loop starts here) 
        System.out.println("--------------------------------------------------------");
        while(sc.hasNext()){
        
           String AccountType = sc.nextLine();
           
           if(AccountType.equals("IndividualSavingAccount")){
               
               int accountNumber = sc.nextInt();
               int balance = sc.nextInt();
               int routingNumber = sc.nextInt();
               String Fname = sc.next();
               String Lname = sc.next();
               int age = sc.nextInt();
               //  Read in the data, and store them to the respective variables such as,
        //  name, transactionType, paymentType, accountType variables of type String 
        //  If the AccountType in the input file is "IndividualSavingAccount".
        //  Then declare accountNumber, balance, routingNumber of type int and Fname,Lname of type String, age of type int in same sequence.
//3a.If the age scanned is less than 18 then create an object for kidSavingAccount named as "kidAccount" 
                //  and initialize the multiple argument constructor with above mentioned variables (question 5).
// 3a - (i). Test the toString() of kidAccount
//3a - (ii). Call calcBalance(500, "Deposit", 12) using the kidSavingAccount object. Use try - catch to handle the appropriate user defined Exceptions.
//3a - (iii). Call kidAccount.calcBalance(15000, "Withdrawal", 3) using the kidSavingAccount object. Use try - catch to handle the appropriate user defined Exceptions
               if(age<18)
               {
               
                   KidSavingAccount kidAccount = new KidSavingAccount(accountNumber, balance, routingNumber, Fname, Lname, age);
                   System.out.println("Kid Details:");
                   System.out.println(kidAccount);
                   try{
                       System.out.println("Balance in account if amount of 500 is deposited and ageOfAccount is 12 months= $"+String.format("%.2f",kidAccount.calcBalance(500,"Deposit",12)));
                       
                   }
                   
                   catch(LowBalanceException e){
                       System.out.println(e.getMessage());
                   } catch (TransferLimitException e) {
                       System.out.println(e.getMessage());
                   }
                   
                    try{
                        System.out.println("Balance in account if amount of 10000 is withdrawn and ageOfAccount is 3 months= $"+String.format("%.2f",kidAccount.calcBalance(10000,"Withdrawal",3)));
                      
                      }
                   
                     catch(LowBalanceException e){
                       System.out.println(e.getMessage());
                   } catch (TransferLimitException e) {
                       System.out.println(e.getMessage());
                   }   
                   
                    
                    System.out.println("--------------------------------------------------------");
               }
               //3b. If the age is age is greater than 18 then create an object for IndividualSavingAccount named as "indSavingAcc"
                    //and initialize the multiple argument constructor with above mentioned variables.
// 3b - (i). Test the toString() of IndividualSavingAccount
// 3b - (ii). Call indSavingAcc.calcBalance(1500, "Deposit", 12) using IndividualSavingAccount object.Use try - catch to handle the appropriate user defined Exceptions 
//3b - (iii). Call indSavingAcc.calcBalance(10000, "Withdrawal", 3) using IndividualSavingAccount object.Use try - catch to handle the appropriate user defined Exceptions 
               else{
                   IndividualSavingAccount indSavingAcc = new IndividualSavingAccount(accountNumber, balance, routingNumber, Fname, Lname, age);
                   System.out.println("Individual Details:");
                   System.out.println(indSavingAcc);
                  try{
                       System.out.println("Balance in account if amount of 1500 is deposited and ageOfAccount is 12 months= $"+String.format("%.2f",indSavingAcc.calcBalance(1500,"Deposit",12)));
                       
                   }
                   
                   catch(LowBalanceException e){
                       System.out.println(e.getMessage());
                   } catch (TransferLimitException e) {
                       System.out.println(e.getMessage());
                   }
                    try{
                        
                        System.out.println("Balance in account if amount of 10000 is withdrawn and ageOfAccount is 3 months= $"+String.format("%.2f",indSavingAcc.calcBalance(10000,"Withdrawal",3)));
                      
                   }
                   
                     catch(LowBalanceException e){
                       System.out.println(e.getMessage());
                   } catch (TransferLimitException e) {
                       System.out.println(e.getMessage());
                   }                 
                   
                   
                   
                   System.out.println("--------------------------------------------------------");
                   
               }
               
               
               
           }
           // 4. If the AccountType in the input file is "FamilySavingAccount".
            //  Then declare accountNumber, balance, routingNumber, noOfpersons of type int. Read the data from input to store values in these variables
// 5. create an object for FamilySavingAccount named as "FSAObject" 
                //  and initialize the multiple argument constructor with above mentioned variables (question 4).
// 6a. while { count is less than nofPersons then create variables FName, LName of type String and age of type int in same sequence and read the data from file.
// 6b. Create an object for Person class named as "person" and initialize the multiple argument consructor in Person class with above given variables
// 6c. Add the person to persons array list using FamilySavingAccount object and using try - catch block handle appropriate Exception.
                    // Declare a local count variable with initial value as 0 and increment the count value every time a person is added to the list.              
// While Loop Ends here
                // 7. Test the toString() method of FamilySavings object. 
// 8. Call calcBalance(5000, "Deposit", 5) and calcBalance(500, "Withdrawal", 10) using FamilySavings object and handle appropriate Exceptions using try - catch blocks  
           
           if(AccountType.equals("FamilySavingAccount")){
               int accountNumber = sc.nextInt();
               int balance =  sc.nextInt();
               int routingNumber = sc.nextInt();
               int noOfPersons = sc.nextInt();
               
               FamilySavingAccount FSAObject = new FamilySavingAccount(accountNumber, balance, routingNumber, noOfPersons);
                       int count=0;
                       System.out.println("Person Details for Family Account:");
                       System.out.println("");
               while(count<noOfPersons){
                   String FName = sc.next();
                   String LName = sc.next();
                   int age = sc.nextInt();
                   Person person = new Person(age, FName, LName);
                   FSAObject.addPerson(person);
                   System.out.println(person);
                   count++;
               }
               System.out.println("--------------------------------------------------------");
               System.out.println("Family Account Details:");
               System.out.println(FSAObject);
               try{
                   System.out.println("Balance in account if amount of 5000 is Deposit and ageOfAccount is 5 months= $"+String.format("%.2f", FSAObject.calcBalance(5000,"Deposit",5)));
               }   
                 catch (LowBalanceException ex) {
                     System.out.println(ex.getMessage());
               } catch (TransferLimitException ex) {
                     System.out.println(ex.getMessage());
               }
                try{
                    
                    System.out.println("Balance in account if amount of 500 is withdraw and ageOfAccount is 10 months= $"+String.format("%.2f",FSAObject.calcBalance(500,"Withdrawal",10)));
               }   
                 catch (LowBalanceException e) {
                     System.out.println(e.getMessage());
               } catch (TransferLimitException e) {
                     System.out.println(e.getMessage());
               }
               
                System.out.println("--------------------------------------------------------");
           }
           if(AccountType.equals("JointCheckingAccount")){
               int accountNumber = sc.nextInt();
               int balance = sc.nextInt();
               int routingNumber = sc.nextInt();
               int noOfPersons = sc.nextInt();
               
               JointCheckingAccount JCAObject = new JointCheckingAccount(accountNumber, balance, routingNumber, noOfPersons);
               int count=0;
               System.out.println("Person Details for Joint Account Details:");
               System.out.println("");
               while(count<noOfPersons){
                   String FName = sc.next();
                   String LName = sc.next();
                   int age = sc.nextInt();
                   Person person = new Person(age, FName, LName);
                   JCAObject.addPerson(person);
                   System.out.println(person);
                   count++;
               }
               System.out.println("--------------------------------------------------------");
               System.out.println("Joint Checking Account Details:");
               System.out.println(JCAObject);
               try{
                   System.out.println("Balance in account if amount of 5000 is Deposit and ageOfAccount is 5 months= $"+String.format("%.2f",JCAObject.calcBalance(5000,"Deposit",5)));
               }   
                 catch (LowBalanceException ex) {
                     System.out.println(ex.getMessage());
               } catch (TransferLimitException ex) {
                     System.out.println(ex.getMessage());
               }
                try{
                    System.out.println("Balance in account if amount of 500 is withdraw and ageOfAccount is 10 months= $"+String.format("%.2f",JCAObject.calcBalance(500,"Withdrawal",10)));
               }   
                 catch (LowBalanceException e) {
                     System.out.println(e.getMessage());
               } catch (TransferLimitException e) {
                     System.out.println(e.getMessage());
               }
                
           }
        
        }
        
        
// 9. If the AccountType in the input file is "JointCheckingAccount".
            //  Then declare accountNumber, balance, routingNumber, noOfpersons of type int. And store the data from input file to the appropriate variables.
//10. Create an object for JointCheckingAccount named as "JCAObject"
                //  and initialize the multiple argument constructor with above mentioned variables (question 12). 
//11a. { while count is less than nofPersons then create variables FName, LName of type String and age of type int in same sequence and read the data from file.
// 11b. Create an object for Person class named as "person" and initialize the multiple argument consructor in Person class with above given variables
// 11c. Add the person to persons array list using FamilySavingAccount object and using try - catch block handle appropriate Exception.
                    // Declare a local count variable with initial value as 0 and increment the count value every time a person is added to the list. 
//12. Test the toString() method of JointCheckingAccount object.
//13. call calcBalance(5000, "Deposit", 5) and calcBalance(500, "Withdrawal", 10) using JointCheckingObject and handle appropriate Exceptions using try - catch blocks
// While loop Ends here

	}

    }
    

