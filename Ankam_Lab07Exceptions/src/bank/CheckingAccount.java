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
public class CheckingAccount extends AbstractBankAccount{

    public CheckingAccount(int accountNo, double balance, int routing_number) {
        super(accountNo, balance, routing_number);
    }

    @Override
    public double calcTransactionFee(double amount) throws TransferLimitException{
        if(amount>2000)
            throw new TransferLimitException("Exception: Limit is $2000 only");
        
            double charges = 0;
           
            if(amount>0 && amount<=15)
                charges = TRANSACTION_FEE + 3;
            if(amount>15 && amount <=100)
                charges = TRANSACTION_FEE + 17;
            if(amount>100 && amount<=1000)
                charges = TRANSACTION_FEE + 75;
            if(amount>1000   && amount<=2000)
                charges = TRANSACTION_FEE + 250;
            return charges;
        
    }

    @Override
    public double calcInterest(int ageOfAccount) {
    return (getBalance()*(INTEREST_RATE_ACCOUNT - 0.25)*(((double)ageOfAccount)/12))/100;
    }
   
    
    
    
    
}
