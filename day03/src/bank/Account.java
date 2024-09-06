package bank;

import bank.exception.*;

public class Account {
    private String accNo;
    private double balance;

    public Account() {

    }

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidException, InsufficientException {
        if (amount <= 0) {
            throw new InvalidException("Invalid amount");
        } else if (amount > balance) {
            throw new InsufficientException("Insufficient balance");
        }
        balance -= amount;
    }

    public void transfer(Account acc, double amount) {
        try {
            withdraw(amount);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        acc.deposit(amount);
    }
}

