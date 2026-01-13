package org.example.IntroToOOPS;

public class BankAccount {
    private Double balance;
    private String ownerName;

    public Double getBalance(){
        return balance;
    }
    public void setBalance(Double balance){
        this.balance=balance;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    public void deposit(Double amount){
        if(amount>=0){
            balance+=amount;
        }
        else{
            System.out.println("Amount can't be negative");
        }
    }
    public void withdraw(Double amount){
        if(amount>=0 && balance>=amount){
            balance-=amount;
        }
        else {
            System.out.println("can't withdraw, not enough balance");
        }
    }
}
