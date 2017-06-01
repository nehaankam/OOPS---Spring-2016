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
public abstract class AbstractBankAccount implements Account{
    private int accountNo;
    private double balance;
    private int routing_number;

    public AbstractBankAccount(int accountNo, double balance, int routing_number) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.routing_number = routing_number;
    }
    
  public double calcBalance(double amount,java.lang.String transactionType,int ageOfAccount)throws LowBalanceException, TransferLimitException{
      
      
      
      double balance = 0.0;
      
        if(transactionType.equals("Deposit"))
        {
           
            
            balance = getBalance()+amount+calcInterest(ageOfAccount);
            setBalance(getBalance()+amount+calcInterest(ageOfAccount));
           
        }
        else{
        if(amount>getBalance())
            throw new LowBalanceException("Exception: Withdrawal failed due to Low Balance");
        if(amount<=0){
            throw new TransferLimitException("Exception: Withdrawal failed due to Transaction Limit");
        }
            
        balance = getBalance() - amount - calcTransactionFee(amount)+calcInterest(ageOfAccount);
        setBalance(getBalance() - amount - calcTransactionFee(amount)+calcInterest(ageOfAccount));
        }
        return balance;
  }
    @Override
  public abstract double calcTransactionFee(double amount) throws TransferLimitException;
   
    @Override
  public abstract double calcInterest(int ageOfAccount);
  
  public int getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public int getRouting_number() {
        return routing_number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return "accountNo= "+accountNo+", balance= $"+balance+", routingNumber= "+routing_number;
    }
}
