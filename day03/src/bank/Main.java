package bank;

import bank.exception.InsufficientException;
import bank.exception.InvalidException;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("94530204218709", 1000);
        System.out.println(account);
        account.deposit(500);
        System.out.println(account);
        try {
            account.withdraw(5000);
        } catch (InvalidException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account);


    }
}
