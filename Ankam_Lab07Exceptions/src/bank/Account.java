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
public interface Account {
    
    static double INTEREST_RATE_ACCOUNT = 1.5;
    static double TRANSACTION_FEE = 5;
    
    double calcInterest(int ageOfAccount);
    double calcTransactionFee(double amount) throws TransferLimitException;
    
    }
    
    

