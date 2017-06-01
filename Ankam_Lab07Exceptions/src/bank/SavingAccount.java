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
public class SavingAccount extends AbstractBankAccount{
    private static final double MINIMUM_BALANCE = 100;
    
    public SavingAccount(int accountNo,double balance,int routingNumber){
        super(accountNo, balance, routingNumber);
    }

    @Override
    public double calcBalance(double amount,java.lang.String transactionType,int ageOfAccount) throws LowBalanceException, TransferLimitException{
       double balance = 0.0;
      
        if(transactionType.equals("Deposit"))
        {
           
            
            balance = getBalance()+amount+calcInterest(ageOfAccount);
            setBalance(getBalance()+amount+calcInterest(ageOfAccount));
           
        }
        else{
        if(amount>getBalance())
            throw new LowBalanceException("Exception: Withdrawal failed due to low Balance in Saving account");
        if(amount>1000){
            throw new TransferLimitException("Exception: Withdrawal failed due to Transaction limit.");
        }
            
        balance = getBalance() - amount - calcTransactionFee(amount)+calcInterest(ageOfAccount);
        setBalance(getBalance() - amount - calcTransactionFee(amount)+calcInterest(ageOfAccount));
        }
        return balance;
    }
    
    @Override
    public double calcTransactionFee(double amount) throws TransferLimitException {
      
         if(amount>1000)
            throw new TransferLimitException("Exception: Limit is $1000 only");
       
            double charges = 0;
           
            if(amount>0 && amount<=15)
                charges = TRANSACTION_FEE + 1;
            if(amount>15 && amount <=100)
                charges = TRANSACTION_FEE + 12;
            if(amount>100 && amount<=1000)
                charges = TRANSACTION_FEE + 60;
            return charges;
       }

    @Override
    public double calcInterest(int ageOfAccount) {
       
        return (getBalance()*(INTEREST_RATE_ACCOUNT - 0.25)*(((double)ageOfAccount)/12))/100;
       
        
        
       
    }
}
