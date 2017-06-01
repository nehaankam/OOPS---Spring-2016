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
public class KidSavingAccount extends IndividualSavingAccount{

    private static final double MINIMUM_BALANCE = 50;
    
    
    
    public KidSavingAccount(int accountNo, double balance, int routingNumber, String fName, String lName, int age) {
        super(accountNo, balance, routingNumber, fName, lName, age);
    }
    
    @Override
    public double calcBalance(double amount,java.lang.String transactionType, int ageOfAccount) throws LowBalanceException, TransferLimitException{
        double balance = 0.0;
      
        if(transactionType.equals("Deposit"))
        {
            
            
            balance = getBalance()+amount+calcInterest(ageOfAccount);
            setBalance(getBalance()+amount+calcInterest(ageOfAccount));
           
        }
        else{
        if(amount>getBalance())
            throw new LowBalanceException("Exception: Withdrawal failed due to low balance in Saving account");
        if(amount<0){
            throw new TransferLimitException("Exception: Withdrawal failed due to Transaction limit.");
        }
        
        balance = getBalance() - amount - calcTransactionFee(amount)+calcInterest(ageOfAccount);
        setBalance(getBalance() - amount - calcTransactionFee(amount)+calcInterest(ageOfAccount));
        }
        return balance;
        
    }
    @Override
    public double calcInterest(int ageOfAccount){
        return (getBalance()*(INTEREST_RATE_ACCOUNT)*(((double)ageOfAccount)/12))/100;
    }
    @Override
    public double calcTransactionFee(double amount) throws TransferLimitException{
        if(amount>100)
            throw new TransferLimitException("Exception: Limit is $100 only");
        
            double charges = 0;
           
            if(amount>0 && amount<=100)
                charges = TRANSACTION_FEE + 1;
            
            return charges;
    }
    @Override
    public String toString(){
        return super.toString();
    }
    
    
}
