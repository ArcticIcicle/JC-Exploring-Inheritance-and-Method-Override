package org.example;

class BankAccount {
    private double balance;

    public BankAccount(double startingBalance) {
        this.balance = startingBalance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}

// Child class
class CheckingAccount extends BankAccount {
    private double fee = 5.0;

    public CheckingAccount(double startingBalance) {
        super(startingBalance);
    }

    public void deductMonthlyFee() {
        double currentBalance = super.getBalance() - fee;
        System.out.println("Fee deducted. New balance: " + currentBalance);
    }
}
