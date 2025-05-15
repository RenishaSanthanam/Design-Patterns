package org.example;

public class ATM implements Account{
    @Override
    public void withDraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withDraw();
    }

    @Override
    public void getAccountNumber() {

    }
}
