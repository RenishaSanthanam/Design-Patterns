package org.example;

public class BankAccount implements Account{
    @Override
    public void withDraw() {
        System.out.println("Amount withdrawed");
    }

    @Override
    public void getAccountNumber() {

    }
}
