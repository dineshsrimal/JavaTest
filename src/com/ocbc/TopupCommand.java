package com.ocbc;

import java.util.Map;

public class TopupCommand implements Command {
    @Override
    public void invoke(String[] inputs, Account currentUserAcc, Map<String, Account> userAccounts) {
        long amount = Integer.parseInt(inputs[1]);
        currentUserAcc.setBalance(currentUserAcc.getBalance() + amount);
        System.out.println("Your balance is " + currentUserAcc.getBalance());
    }
}
